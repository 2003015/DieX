package club.theexperiment.diex;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class d2Fragment extends ListFragment {

    private d2 Dice;
    private String numDice;
    private int nD;
    private Button mD2RollButton;
    private String[] rollStrings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_d2, container, false);
        mD2RollButton = (Button) rootView.findViewById(R.id.d2RollButton);
        Dice = new d2();
        mD2RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numDice = ((EditText) rootView.findViewById(R.id.d2Rolls)).getText().toString();

                nD = Integer.parseInt(numDice);
                Dice.setNumberOfDice(nD);
                Dice.roll(nD);
                rollStrings = new String[Dice.getRolls().length];
                //String[] rollStrings = new String[Dice.getRolls().length];
                for (int i = 0; i < Dice.getRolls().length; i++) {

                    //rollStrings[i] = Integer.toString(Dice.getRolls()[i]);
                    rollStrings[i] = Integer.toString(Dice.getRolls()[i]);
                    Log.e("test", Integer.toString(Dice.getRolls()[i]));

                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (getActivity(), R.layout.listview, rollStrings);
                setListAdapter(arrayAdapter);
            }

        });
        return rootView;

    }
}
