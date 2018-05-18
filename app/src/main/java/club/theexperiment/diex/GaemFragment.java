package club.theexperiment.diex;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by 1806357 on 5/17/2018.
 */

public class GaemFragment extends Fragment {

    Button attack;
    private Gaem gaem;
    String a;
    Enemy enm;
    TextView hP, wP, hE, wE, log;

    public boolean onOptionsItemSelected(MenuItem item){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.content_frame, new defaultFragment());
        ft.commit();
        return true;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        //Link Views and Buttons
        final View rootView = inflater.inflate(R.layout.gaem, container, false);
        gaem = new Gaem();
        enm = new Enemy();


        hP = (TextView) rootView.findViewById(R.id.hP);
        wP = (TextView) rootView.findViewById(R.id.wP);
        hE = (TextView) rootView.findViewById(R.id.hE);
        wE = (TextView) rootView.findViewById(R.id.wE);
        log = (TextView) rootView.findViewById(R.id.log);



        hP.setText(gaem.getStrHealth());
        wP.setText(gaem.getStrWep());
        hE.setText(enm.getStrHealth());
        wP.setText(enm.getStrWep());
        a = "An enemy approaches!";
        log.setText(a);

        attack = (Button) rootView.findViewById(R.id.att);
        //Set method for when roll button clicked
        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gaem.getHealth() <= 0){
                    a = "You have been slain.";
                    log.setText(a);
                }
                else if(enm.Damage(gaem.Attack())){
                    a = "Good job, you have slain your foe, but a new one approaches!";
                    log.setText(a);
                    enm.setHealth(40);
                }
                else if(gaem.Damage(enm.Attack())){
                    a = "The enemy has killed you.";
                    log.setText(a);
                }
                hP.setText(gaem.getStrHealth());
                hE.setText(enm.getStrHealth());
            }

        });
        return rootView;

    }
}
