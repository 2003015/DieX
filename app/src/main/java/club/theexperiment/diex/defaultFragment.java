package club.theexperiment.diex;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class defaultFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_default, container, false);
        Button mD2Button = (Button) rootView.findViewById(R.id.d2Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.w("d2","Fire1");
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                Log.w("d2","Fire2");
                ft.replace(R.id.content_frame, new d2Fragment());
                Log.w("d2","Fire3");
                ft.commit();
                Log.w("d2","Fire4");
            }

        });
        Button mD4Button = (Button) rootView.findViewById(R.id.d4Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new d4Fragment());
                ft.commit();
            }

        });
        Button mD6Button = (Button) rootView.findViewById(R.id.d6Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new d6Fragment());
                ft.commit();
            }

        });
        Button mD8Button = (Button) rootView.findViewById(R.id.d8Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new d8Fragment());
                ft.commit();
            }

        });
        Button mD10Button = (Button) rootView.findViewById(R.id.d10Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new d10Fragment());
                ft.commit();
            }

        });
        Button mD12Button = (Button) rootView.findViewById(R.id.d12Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new d12Fragment());
                ft.commit();
            }

        });
        Button mD20Button = (Button) rootView.findViewById(R.id.d20Button);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new d20Fragment());
                ft.commit();
            }

        });
        Button mCustomButton = (Button) rootView.findViewById(R.id.customButton);
        mD2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new dCustomFragment());
                ft.commit();
            }

        });

        return rootView;
    }
}
