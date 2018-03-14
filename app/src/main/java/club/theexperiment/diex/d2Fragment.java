package club.theexperiment.diex;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class d2Fragment extends Fragment {

    private d2 Dice;
    private String numDice;
    private int nD;
    private static final String TAG = "ProfileFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_d2, container, false);

        Dice = new d2();

        numDice = ((EditText) rootView.findViewById(R.id.d2Rolls)).getText().toString();
        try{
            nD = Integer.parseInt(numDice);
            Dice.setNumberOfDice(nD);
            Dice.roll(nD);
            ///
        }
        catch (NumberFormatException e){
            ///
        }

        return rootView;
    }


}
