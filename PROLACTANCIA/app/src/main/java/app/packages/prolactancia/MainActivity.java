package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import app.packages.prolactancia.Controladores.clsDatabase;
import app.packages.prolactancia.R;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb;
    TextView t;
    Handler h = new Handler();
    int i = 0;
    boolean pb_activa = false;
    Intent menuprincipal;

    private clsDatabase loDatabase;
    private SQLiteDatabase loExecute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loDatabase= new clsDatabase(this);
        pb = (ProgressBar)findViewById(R.id.progressBar);
        t = (TextView)findViewById(R.id.textViewPorcentaje);

        LlenarLugares();

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
                            menuprincipal = new Intent(MainActivity.this, Abceso.class);
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

    private void LlenarLugares()
    {
        try{
            loExecute = loDatabase.getWritableDatabase();
            loExecute.delete("tbListaLocales", null, null);
            ContentValues values = new ContentValues();
            values.put("nombre_establecimiento", "Hospital General Guasmo Sur");
            values.put("direccion", "Avenida Cacique Tomalá");
            values.put("latitud", -2.278339);
            values.put("longitud", -79.895838);
            loExecute.insert("tbListaLocales", null, values);

            values = null;
            values = new ContentValues();
            values.put("nombre_establecimiento", "Hospital Universitario");
            values.put("direccion", "Avenida 43 NO, BODEGAS FERCONSA");
            values.put("latitud", -2.096141);
            values.put("longitud", -79.946781);
            loExecute.insert("tbListaLocales", null, values);

            values = null;
            values = new ContentValues();
            values.put("nombre_establecimiento", "Hospital del Niño, Dr Fransisco de Icaza Bustamante");
            values.put("direccion", "Avenida Quito");
            values.put("latitud", -2.2032727);
            values.put("longitud", -79.8953945);
            loExecute.insert("tbListaLocales", null, values);

            values = null;
            values = new ContentValues();
            values.put("nombre_establecimiento", "Hospital del IESS Los Ceibos");
            values.put("direccion", "Avenida del Bombero");
            values.put("latitud", -2.1762186);
            values.put("longitud", -79.9407821);
            loExecute.insert("tbListaLocales", null, values);

            values = null;
            values = new ContentValues();
            values.put("nombre_establecimiento", "Hospital de Niños Dr. Roberto Gilbert E.");
            values.put("direccion", "Avenida Roberto Gilbert y, Nicasio Safadi");
            values.put("latitud", -2.1778518);
            values.put("longitud", -79.8850402);
            loExecute.insert("tbListaLocales", null, values);

            values = null;
            values = new ContentValues();
            values.put("nombre_establecimiento", "Hospital De Niños Leon Becerra");
            values.put("direccion", "Eloy Alfaro y, Bolivia");
            values.put("latitud", -2.1289721);
            values.put("longitud", -79.9645355);
            loExecute.insert("tbListaLocales", null, values);

        }catch (Exception ex)
        {
            Toast.makeText(MainActivity.this,"Error al momento de llenar los lugares en el metodo lLlenarLugares()",Toast.LENGTH_LONG).show();
        }
    }
}