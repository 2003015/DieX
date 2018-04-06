package club.theexperiment.diex;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {
    //Create Die instance to use for rolls
    public static Die dice;
    //Override onCreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView;
        Uri uri;

        //Load fragment_default onto screen
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.content_frame, new defaultFragment());
        fragmentTransaction.commit();

           videoView = (VideoView) findViewById(R.id.video_view);

            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.d1_dice);
            videoView.setVideoURI(uri);

    }
}
