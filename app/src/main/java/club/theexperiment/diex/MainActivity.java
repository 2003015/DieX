package club.theexperiment.diex;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment contentFragment = null;

        Button btn = findViewById(R.id.your_button_id);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }

        }
    }
}
