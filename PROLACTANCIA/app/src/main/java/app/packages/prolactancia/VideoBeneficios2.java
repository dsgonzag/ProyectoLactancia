package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoBeneficios2 extends AppCompatActivity {

    VideoView vd_beneficios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_beneficios);

        String rutavideo = "android.resource://"+getPackageName()+"/"+R.raw.beneficios_hijo;
        Uri uri = Uri.parse(rutavideo);

        final Intent benef = new Intent(this, Beneficios.class);
        MediaPlayer.OnCompletionListener myVideoViewCompletionListener =
                new MediaPlayer.OnCompletionListener() {

                    @Override
                    public void onCompletion(MediaPlayer arg0) {
                        finish();
                        startActivity(benef);
                    }
                };

        vd_beneficios = findViewById(R.id.vd_beneficios);
        vd_beneficios.setVideoURI(uri);
        MediaController mediacontroller = new MediaController(vd_beneficios.getContext());
        mediacontroller.setMediaPlayer(vd_beneficios);
        mediacontroller.setAnchorView(vd_beneficios);
        vd_beneficios.start();
        vd_beneficios.setMediaController(mediacontroller);
        vd_beneficios.setOnCompletionListener(myVideoViewCompletionListener);
    }

    @Override
    public void onBackPressed() {
        Intent benef = new Intent(this, Beneficios.class);
        this.finish();
        startActivity(benef);
    }
}