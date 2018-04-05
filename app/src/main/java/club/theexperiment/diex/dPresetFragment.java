package club.theexperiment.diex;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;


public class dPresetFragment extends ListFragment {
    //Declare variables
    private String numDice;
    private int nD;
    private Button mDPresetRollButton;
    private String[] rollStrings;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Link Views and Buttons
        final View rootView = inflater.inflate(R.layout.fragment_dpreset, container, false);
        mDPresetRollButton = (Button) rootView.findViewById(R.id.dPresetRollButton);
        //Set method for when roll button clicked
        mDPresetRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Link textbox for number of sides
                numDice = ((EditText) rootView.findViewById(R.id.dPresetRolls)).getText().toString();
                //Parse number of sides in textbox
                nD = Integer.parseInt(numDice);
                //Set sides to specified number of sides
                MainActivity.dice.setNumberOfDice(nD);
                //Roll dice for roll array
                MainActivity.dice.roll(nD);
                //Create new array to store string versions of roll ints
                rollStrings = new String[MainActivity.dice.getRolls().length];
                //Create array strings specifying how many times each side was rolled
                for (int i = 0; i < MainActivity.dice.getRolls().length; i++) {


                    rollStrings[i] = (i + 1) + "s: " + Integer.toString(MainActivity.dice.getRolls()[i]);


                }
                //Create Array adapter to display String array
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<> (getActivity(), R.layout.listview, rollStrings);
                //Display String array
                setListAdapter(arrayAdapter);
            }

        });
        return rootView;

    }
}
