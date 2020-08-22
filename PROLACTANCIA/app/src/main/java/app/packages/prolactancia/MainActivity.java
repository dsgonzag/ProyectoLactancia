package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import app.packages.prolactancia.R;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    TextView t;
    Handler h = new Handler();
    int i = 0;
    boolean pb_activa = false;
    Intent menuprincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar)findViewById(R.id.progressBar);
        t = (TextView)findViewById(R.id.textViewPorcentaje);

        if(!pb_activa) {
            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (i<=100) {
                        h.post(new Runnable() {
                            @Override
                            public void run() {
                                t.setText(i+"%");
                                pb.setProgress(i);
                            }
                        });
                        try {
                            Thread.sleep(300);
                        } catch (Exception e) {
                            e.getLocalizedMessage();
                        }
                        if (i==100){
                            menuprincipal = new Intent(MainActivity.this, MenuPrincipal.class);
                            startActivity(menuprincipal);
                        }
                        i+=10;
                        pb_activa = true;
                    }
                }
            });

            th.start();
        }
    }
}