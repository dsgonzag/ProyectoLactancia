package com.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.packages.prolactancia.R;

public class MenuLactancia extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras,bt_home,bt_alimentacion,bt_problemas_lact,bt_succion,bt_frecuencia_lact;
    TextView txt_titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_lactancia);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Lactancia");

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);
        bt_alimentacion = findViewById(R.id.bt_alimentacion);
        bt_alimentacion.setOnClickListener(this);
        bt_problemas_lact = findViewById(R.id.bt_problemas_lact);
        bt_problemas_lact.setOnClickListener(this);
        bt_succion = findViewById(R.id.bt_succion);
        bt_succion.setOnClickListener(this);
        bt_frecuencia_lact = findViewById(R.id.bt_frecuencia_lact);
        bt_frecuencia_lact.setOnClickListener(this);

        redimensionar();

    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                siguiente = new Intent(MenuLactancia.this, MenuPrincipal.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_home:
                siguiente = new Intent(MenuLactancia.this, MenuPrincipal.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_alimentacion:
                siguiente = new Intent(MenuLactancia.this, Alimentacion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_problemas_lact:
                siguiente = new Intent(MenuLactancia.this, MenuProblemasLactancia.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_succion:
                siguiente = new Intent(MenuLactancia.this, SuccionPosicion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_frecuencia_lact:
                siguiente = new Intent(MenuLactancia.this, MenuFrecuenciaLactar.class);
                this.finish();
                startActivity(siguiente);
                break;
            default: break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuLactancia.this, MenuPrincipal.class);
        this.finish();
        startActivity(atras);
    }

    public void redimensionar(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int ancho = dm.widthPixels;
        int alto = dm.heightPixels;

        //Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();

        RelativeLayout.LayoutParams params_1 = (RelativeLayout.LayoutParams) bt_alimentacion.getLayoutParams();
        RelativeLayout.LayoutParams params_2= (RelativeLayout.LayoutParams) bt_problemas_lact.getLayoutParams();
        RelativeLayout.LayoutParams params_3 = (RelativeLayout.LayoutParams) bt_succion.getLayoutParams();
        RelativeLayout.LayoutParams params_4= (RelativeLayout.LayoutParams) bt_frecuencia_lact.getLayoutParams();

        RelativeLayout.LayoutParams params_5 = (RelativeLayout.LayoutParams) bt_atras.getLayoutParams();
        RelativeLayout.LayoutParams params_6= (RelativeLayout.LayoutParams) bt_home.getLayoutParams();

        if(ancho<= 480){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(28);
            params_1.width = 200;
            params_2.width = 200;
            params_3.width = 200;
            params_4.width = 200;
            //params_5.width = 200;
            //params_6.width = 200;
        }else if(ancho > 480 && ancho <= 600){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(30);
            params_1.width = 250;
            params_2.width = 250;
            params_3.width = 250;
            params_4.width = 250;
            //params_5.width = 125;
            //params_6.width = 125;
        }else if(ancho > 600 && ancho <= 720){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(32);
            params_1.width = 300;
            params_2.width = 300;
            params_3.width = 300;
            params_4.width = 300;
            //params_5.width = 150;
            //params_6.width = 150;
        }else if(ancho > 720 && ancho <= 840){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(34);
            params_1.width = 300;
            params_2.width = 300;
            params_3.width = 300;
            params_4.width = 300;
            //params_5.width = 175;
            //params_6.width = 175;
        }else if(ancho > 840 && ancho <= 960){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(36);
            params_1.width = 400;
            params_2.width = 400;
            params_3.width = 400;
            params_4.width = 400;
            //params_5.width = 200;
            //params_6.width = 200;
        }else if(ancho > 960 && ancho <= 1080){
            txt_titulo.setPadding(5,25,5,5);
            txt_titulo.setTextSize(37);
            params_1.width = 450;
            params_2.width = 450;
            params_3.width = 450;
            params_4.width = 450;
            params_5.width = 220;
            params_6.width = 220;
        }else if(ancho > 1080 && ancho <= 1200){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(40);
            params_1.width = 500;
            params_2.width = 500;
            params_3.width = 500;
            params_4.width = 500;
            params_5.width = 240;
            params_6.width = 240;
        }else if(ancho > 1200 && ancho <= 1320){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(42);
            params_1.width = 550;
            params_2.width = 550;
            params_3.width = 550;
            params_4.width = 550;
            params_5.width = 260;
            params_6.width = 260;
        }else if(ancho > 1320 && ancho <= 1440){
            txt_titulo.setPadding(5,20,5,5);
            txt_titulo.setTextSize(44);
            params_1.width = 600;
            params_2.width = 600;
            params_3.width = 600;
            params_4.width = 600;
            params_5.width = 275;
            params_6.width = 275;
        }


        if(alto<= 800){
            params_1.height = 200;
            params_1.bottomMargin = 30;
            params_2.height = 200;
            params_2.bottomMargin = 30;
            params_3.height = 200;
            params_3.bottomMargin = 100;
            params_4.height = 200;
            params_4.bottomMargin = 100;
            //params_5.height = 200;
            //params_5.bottomMargin = 30;
            //params_6.height = 200;
            //params_6.bottomMargin = 30;
        }else if(alto > 800 && alto <= 1080){
            params_1.height = 300;
            params_1.bottomMargin = 50;
            params_2.height = 300;
            params_2.bottomMargin = 50;
            params_3.height = 300;
            params_3.bottomMargin = 150;
            params_4.height = 300;
            params_4.bottomMargin = 150;
            /*params_5.height = 300;
            params_5.bottomMargin = 50;
            params_6.height = 300;
            params_6.bottomMargin = 50;*/
        }else if(alto > 1080 && alto <= 1280){
            params_1.height = 350;
            params_1.bottomMargin = 50;
            params_2.height = 350;
            params_2.bottomMargin = 50;
            params_3.height = 350;
            params_3.bottomMargin = 150;
            params_4.height = 350;
            params_4.bottomMargin = 150;
            /*params_5.height = 300;
            params_5.bottomMargin = 50;
            params_6.height = 300;
            params_6.bottomMargin = 50;*/
        }else if(alto > 1280 && alto <= 1920){
            params_1.height = 400;
            params_1.bottomMargin = 100;
            params_2.height = 400;
            params_2.bottomMargin = 100;
            params_3.height = 400;
            params_3.bottomMargin = 200;
            params_4.height = 400;
            params_4.bottomMargin = 200;
            /*params_5.height = 400;
            params_5.bottomMargin = 50;
            params_6.height = 400;
            params_6.bottomMargin = 50;*/
        }else if(alto > 1920 && alto <= 2260){
            params_1.height = 550;
            params_1.bottomMargin = 200;
            params_2.height = 550;
            params_2.bottomMargin = 200;
            params_3.height = 550;
            params_3.bottomMargin = 200;
            params_4.height = 550;
            params_4.bottomMargin = 200;
            params_5.height = 220;
            params_6.height = 220;
        }else if(alto > 2260 && alto <= 2560) {
            params_1.height = 700;
            params_1.bottomMargin = 150;
            params_2.height = 700;
            params_2.bottomMargin = 150;
            params_3.height = 700;
            params_3.bottomMargin = 250;
            params_4.height = 700;
            params_4.bottomMargin = 250;
            params_5.height = 275;
            params_6.height = 275;
        }
    }
}