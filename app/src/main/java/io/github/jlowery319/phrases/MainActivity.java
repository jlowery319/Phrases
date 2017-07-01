package io.github.jlowery319.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    // runs when any button is clicked
    public void buttonClicked(View view) {

        int id = view.getId(); // long number
        String ourId = "";
        // get String id name of corresponding View with long number int id
        ourId = view.getResources().getResourceEntryName(id);

        // get sound resource to pass to MediaPlayer since R.raw.sourcename will be different depending on button clicked
        int resourceId = view.getResources().getIdentifier(ourId, "raw", "io.github.jlowery319.phrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
