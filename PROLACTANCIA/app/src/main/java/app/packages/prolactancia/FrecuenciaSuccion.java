package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class FrecuenciaSuccion extends AppCompatActivity implements  View.OnClickListener{

    TextView txt_titulo,txt_mensaje;
    ImageButton bt_atras,bt_home;
    ImageView representativa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frecuencia_succion);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Frecuencia de succión");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(),fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("Se debe dar el seno...\n" +
                "tantas veces como su bebé lo desee, sin horarios ni tiempos.\n");

        representativa = findViewById(R.id.img_representativa);

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(FrecuenciaSuccion.this, MenuFrecuenciaLactar.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(FrecuenciaSuccion.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent atras = new Intent(FrecuenciaSuccion.this, MenuFrecuenciaLactar.class);
        this.finish();
        startActivity(atras);
    }
}