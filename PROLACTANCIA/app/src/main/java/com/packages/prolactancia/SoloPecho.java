package com.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

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

import com.packages.prolactancia.R;

public class SoloPecho extends AppCompatActivity implements  View.OnClickListener {

    TextView txt_titulo, txt_mensaje;
    ImageButton bt_atras, bt_home;
    ImageView representativa;
    View contenido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solo_pecho);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(), fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Pecho y nada más");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(), fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("Durante los primeros 6 meses si el bebé...\n" +
                "tiene sed o hambre, hay que darle pecho y nada más.\n");

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

        RelativeLayout.LayoutParams params_1 = (RelativeLayout.LayoutParams) representativa.getLayoutParams();
        RelativeLayout.LayoutParams params_men= (RelativeLayout.LayoutParams) txt_mensaje.getLayoutParams();
        RelativeLayout.LayoutParams params_cont = (RelativeLayout.LayoutParams) contenido.getLayoutParams();
        //RelativeLayout.LayoutParams params_vp= (RelativeLayout.LayoutParams) vista_pagina.getLayoutParams();
        RelativeLayout.LayoutParams params_7 = (RelativeLayout.LayoutParams) bt_atras.getLayoutParams();
        RelativeLayout.LayoutParams params_8= (RelativeLayout.LayoutParams) bt_home.getLayoutParams();

        if(ancho<= 480){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(24);
            txt_mensaje.setTextSize(15);
            params_1.width = 100;
        }else if(ancho > 480 && ancho <= 600){
            txt_titulo.setPadding(5,0,5,5);
            txt_titulo.setTextSize(26);
            txt_mensaje.setTextSize(15);
            params_1.width = 150;
        }else if(ancho > 600 && ancho <= 720){
            txt_titulo.setPadding(5,0,5,5);
            txt_titulo.setTextSize(28);
            txt_mensaje.setTextSize(15);
            params_1.width = 200;
        }else if(ancho > 720 && ancho <= 840){
            txt_titulo.setPadding(5,0,5,5);
            txt_titulo.setTextSize(30);
            txt_mensaje.setTextSize(16);
            params_1.width = 200;
        }else if(ancho > 840 && ancho <= 960){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(32);
            txt_mensaje.setTextSize(16);
            params_1.width = 300;
        }else if(ancho > 960 && ancho <= 1080){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(32);
            txt_mensaje.setTextSize(16);
            params_1.width = 350;

            params_7.width = 220;
            params_8.width = 220;
        }else if(ancho > 1080 && ancho <= 1200){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(38);
            txt_mensaje.setTextSize(18);
            params_1.width = 400;

            params_7.width = 240;
            params_8.width = 240;
        }else if(ancho > 1200 && ancho <= 1320){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(40);
            txt_mensaje.setTextSize(18);
            params_1.width = 450;

            params_7.width = 260;
            params_8.width = 260;
        }else if(ancho > 1320 && ancho <= 1440){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(42);
            txt_mensaje.setTextSize(20);
            params_1.width = 500;

            params_7.width = 275;
            params_8.width = 275;
        }else if(ancho > 1440){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(42);
            txt_mensaje.setTextSize(20);
            params_1.width = 500;

            params_7.width = 275;
            params_8.width = 275;
        }

        if(alto<= 800){
            params_cont.height = 450;
        }else if(alto > 800 && alto <= 1080){
            params_cont.height = 700;
        }else if(alto > 1080 && alto <= 1280){
            params_cont.height = 775;
        }else if(alto > 1280 && alto <= 1440){
            params_cont.height = 850;
        }else if(alto > 1440 && alto <= 1800){
            params_cont.height = 950;
        }else if(alto > 1800 && alto <= 1920){
            params_cont.height = 1050;
        }else if(alto > 1920 && alto <= 2040){
            params_cont.height = 1400;
        }else if(alto > 2040 && alto <= 2560){
            params_cont.height = 1600;
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(SoloPecho.this, MenuFrecuenciaLactar.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(SoloPecho.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(SoloPecho.this, MenuFrecuenciaLactar.class);
        this.finish();
        startActivity(atras);
    }

}