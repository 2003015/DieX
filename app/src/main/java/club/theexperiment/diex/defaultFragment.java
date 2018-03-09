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
        return rootView;
    }
}
