package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Abceso extends AppCompatActivity implements  View.OnClickListener{

    TextView txt_titulo,txt_mensaje;
    ImageButton bt_atras,bt_home;
    ImageView representativa;
    //Fragment contenido;
    View contenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abceso);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Absceso");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(),fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("Un absceso mamario...\n" +
                "es una acumulación dolorosa de pus que se forma en el seno\n");

        representativa = findViewById(R.id.img_representativa);
        contenido = findViewById(R.id.contenido);

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);

        redimensionar();
    }

    public void redimensionar(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int ancho = dm.widthPixels;
        int alto = dm.heightPixels;

        //Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();

        RelativeLayout.LayoutParams params_rep = (RelativeLayout.LayoutParams) representativa.getLayoutParams();
        RelativeLayout.LayoutParams params_men= (RelativeLayout.LayoutParams) txt_mensaje.getLayoutParams();
        RelativeLayout.LayoutParams params_cont = (RelativeLayout.LayoutParams) contenido.getLayoutParams();
        //RelativeLayout.LayoutParams params_vp= (RelativeLayout.LayoutParams) vista_pagina.getLayoutParams();

        if(ancho<= 480){
            params_rep.width = 100;
        }else if(ancho > 480 && ancho <= 720){
            params_rep.width = 150;
        }else if(ancho > 720 && ancho <= 1080){
            txt_titulo.setTextSize(24);
            params_rep.width = 250;
        }else if(ancho > 1080 && ancho <= 1440){
            params_rep.width = 350;
        }

        if(alto<= 800){
            txt_mensaje.setTextSize(15);
            params_cont.height = 400;
        }else if(alto > 800 && alto <= 1280){
            txt_mensaje.setTextSize(17);
            params_cont.height = 600;
        }else if(alto > 1280 && alto <= 1440){
            txt_mensaje.setTextSize(19);
            params_cont.height = 800;
        }else if(alto > 1400 && alto <= 1720){
            txt_mensaje.setTextSize(21);
            params_cont.height = 1000;
        }else if(alto > 1720 && alto <= 2040){
            txt_mensaje.setTextSize(22);
            params_cont.height = 1400;
        }else if(alto > 2040 && alto <= 2560){
            txt_mensaje.setTextSize(14);
            params_cont.height = 1600;
        }

        contenido.setLayoutParams(params_cont);
        representativa.setLayoutParams(params_rep);
        //vista_pagina.setLayoutParams(params_vp);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(Abceso.this, MenuProblemasLactancia.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(Abceso.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent atras = new Intent(Abceso.this, MenuProblemasLactancia.class);
        this.finish();
        startActivity(atras);
    }
}