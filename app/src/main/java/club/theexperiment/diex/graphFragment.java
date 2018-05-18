package club.theexperiment.diex;

import android.app.ListFragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

import java.util.List;

/**
 * Created by 2007015 on 5/17/2018.
 */

public class graphFragment extends Fragment {

    private Button graphButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        View rootView = inflater.inflate(R.layout.graph, container, false);

        GraphView graph = (GraphView) rootView.findViewById(R.id.graph);  //Graph
        graph.removeAllSeries();
        DataPoint[] points = new DataPoint[MainActivity.dice.getRolls().length];

        for (int i = 0; i < MainActivity.dice.getRolls().length;i++) {
            points[i] = new DataPoint(i+1, MainActivity.dice.getRolls()[i]);
        }

        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(points);
        graph.addSeries(series);

        // styling
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                if (data.getX() % 2 == 0) {
                    return Color.rgb(0, 0, 255);
                } else {
                    return Color.rgb(0,0, 100);
                }
            }


        });

        series.setSpacing(50);

// draw values on top
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.BLACK);

        return rootView;
    }

}
