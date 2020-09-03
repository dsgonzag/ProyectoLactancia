package com.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.packages.prolactancia.R;

public class VideoHigiene extends AppCompatActivity {

    VideoView vd_higiene;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_higiene);

        String rutavideo = "android.resource://"+getPackageName()+"/"+R.raw.higiene;
        Uri uri = Uri.parse(rutavideo);

        final Intent hig = new Intent(this, Higiene.class);
        MediaPlayer.OnCompletionListener myVideoViewCompletionListener =
                new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        finish();
                        startActivity(hig);
                    }
                };

        vd_higiene = findViewById(R.id.vd_higiene);
        vd_higiene.setVideoURI(uri);
        MediaController mediacontroller = new MediaController(vd_higiene.getContext());
        mediacontroller.setMediaPlayer(vd_higiene);
        mediacontroller.setAnchorView(vd_higiene);
        vd_higiene.start();
        vd_higiene.setMediaController(mediacontroller);
        vd_higiene.setOnCompletionListener(myVideoViewCompletionListener);
    }

    @Override
    public void onBackPressed() {
        Intent hig = new Intent(this, Higiene.class);
        this.finish();
        startActivity(hig);
    }
}