package club.theexperiment.diex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class d2Fragment extends Fragment {

    private d2 Dice;
    private String numDice;
    private int nD;
    private static final String TAG = "ProfileFragment";
    private List<String> rollStrings = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        final View rootView = inflater.inflate(R.layout.fragment_d2, container, false);

        Dice = new d2();
        final ListView listView = (ListView) rootView.findViewById(R.id.d2ListView);
        Button mD2RollButton = (Button) rootView.findViewById(R.id.d2RollButton);
        //final List<String> rollStrings = new ArrayList<>();
        mD2RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numDice = ((EditText) rootView.findViewById(R.id.d2Rolls)).getText().toString();

                nD = Integer.parseInt(numDice);
                Dice.setNumberOfDice(nD);
                Dice.roll(nD);
                //String[] rollStrings = new String[Dice.getRolls().length];
                for (int i = 0; i < Dice.getRolls().length; i++) {

                    //rollStrings[i] = Integer.toString(Dice.getRolls()[i]);
                    rollStrings.add(Integer.toString(Dice.getRolls()[i]));
                    Log.e("test", Integer.toString(Dice.getRolls()[i]));

                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<> (getActivity().getApplicationContext(), R.layout.listview, rollStrings);
                listView.setAdapter(arrayAdapter);

            }

        });

        /// use .getRolls




        return rootView;
    }


}
