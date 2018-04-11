package club.theexperiment.diex;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.VideoView;


public class dPresetFragment extends ListFragment {
    //Declare variables
    private String numDice;
    private int nD;
    private Button mDPresetRollButton;
    private Button mPresetBackButton;
    private String[] rollStrings;
    private int sum;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Uri uri;

        //Link Views and Buttons
        final View rootView = inflater.inflate(R.layout.fragment_dpreset, container, false);

        final VideoView videoView = (VideoView) rootView.findViewById(R.id.video_view);

        uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.d1_dice);
        videoView.setVideoURI(uri);

        mDPresetRollButton = (Button) rootView.findViewById(R.id.dPresetRollButton);
        //Set method for when roll button clicked
        mDPresetRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
                //Reset sum to 0
                sum = 0;
                //Link textbox for number of sides
                numDice = ((EditText) rootView.findViewById(R.id.dPresetRolls)).getText().toString();
                //Parse number of sides in textbox
                nD = Integer.parseInt(numDice);
                //Set sides to specified number of sides
                MainActivity.dice.setNumberOfDice(nD);
                //Roll dice for roll array
                MainActivity.dice.roll(nD);
                //Create new array to store string versions of roll ints
                rollStrings = new String[MainActivity.dice.getRolls().length+1];
                //Create array strings specifying how many times each side was rolled and add sum
                for (int i = 0; i < MainActivity.dice.getRolls().length; i++) {
                    rollStrings[i] = (i + 1) + "s: " + Integer.toString(MainActivity.dice.getRolls()[i]);
                    sum += (i+1)*MainActivity.dice.getRolls()[i];
                }
                //Add sum String to array//
                rollStrings[rollStrings.length-1] = "Sum: " + Integer.toString(sum);
                //Create Array adapter to display String array
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<> (getActivity(), R.layout.listview, rollStrings);
                //Display String array
                setListAdapter(arrayAdapter);
            }

        });
        //Create back button
        mPresetBackButton = (Button) rootView.findViewById(R.id.presetBackButton);
        //Set method for back button click
        mPresetBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load menu fragment
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.content_frame, new defaultFragment());
                ft.commit();
            }
        });
        return rootView;

    }
}
