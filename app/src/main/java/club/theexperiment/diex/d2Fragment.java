package club.theexperiment.diex;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;


public class d2Fragment extends ListFragment {

    private String numDice;
    private int nD;
    private Button mD2RollButton;
    private String[] rollStrings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_d2, container, false);
        mD2RollButton = (Button) rootView.findViewById(R.id.d2RollButton);
        mD2RollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numDice = ((EditText) rootView.findViewById(R.id.d2Rolls)).getText().toString();

                nD = Integer.parseInt(numDice);
                MainActivity.dice.setNumberOfDice(nD);
                MainActivity.dice.roll(nD);
                rollStrings = new String[MainActivity.dice.getRolls().length];

                for (int i = 0; i < MainActivity.dice.getRolls().length; i++) {


                    rollStrings[i] = (i + 1) + "s: " + Integer.toString(MainActivity.dice.getRolls()[i]);


                }
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<> (getActivity(), R.layout.listview, rollStrings);
                setListAdapter(arrayAdapter);
            }

        });
        return rootView;

    }
}
