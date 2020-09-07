package com.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.packages.prolactancia.R;

public class MenuPrincipal extends AppCompatActivity implements  View.OnClickListener{

    ImageButton bt_beneficios, bt_lactancia, bt_extraccion, bt_donacion, bt_higiene, bt_mitos;
    Intent siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        bt_beneficios=findViewById(R.id.bt_beneficios);
        bt_beneficios.setOnClickListener(this);
        bt_lactancia=findViewById(R.id.bt_lactancia);
        bt_lactancia.setOnClickListener(this);
        bt_extraccion=findViewById(R.id.bt_extraccion);
        bt_extraccion.setOnClickListener(this);
        bt_donacion=findViewById(R.id.bt_donacion);
        bt_donacion.setOnClickListener(this);
        bt_higiene=findViewById(R.id.bt_higiene);
        bt_higiene.setOnClickListener(this);
        bt_mitos=findViewById(R.id.bt_mitos);
        bt_mitos.setOnClickListener(this);

        redimensionar();
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_beneficios:
                //Toast.makeText (getApplicationContext (), "boton beneficios" , Toast.LENGTH_SHORT) .show ();
                siguiente = new Intent(MenuPrincipal.this, Beneficios.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_lactancia:
                siguiente = new Intent(MenuPrincipal.this, MenuLactancia.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_extraccion:
                siguiente = new Intent(MenuPrincipal.this, MenuExtraccion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_donacion:
                siguiente = new Intent(MenuPrincipal.this, Donacion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_higiene:
                siguiente = new Intent(MenuPrincipal.this, Higiene.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_mitos:
                siguiente = new Intent(MenuPrincipal.this, MitosVerdades.class);
                this.finish();
                startActivity(siguiente);
                break;
            default: break;
        }
    }

    public void redimensionar(){
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int ancho = dm.widthPixels;
        int alto = dm.heightPixels;

        //Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();
         int enc = 100;
         int marg_lat = 40;


        int ancho_disp = ancho - marg_lat;
        int ancho_2 = ancho_disp /2;

        int alto_disp = alto - enc;
        int esp = (int) Math.round(alto_disp * 0.1);
        //int margin_b = esp / 6;
        int margin_b = 0;
        alto_disp = alto_disp - esp;
        int alto_3 = alto_disp / 3;

        //Toast.makeText (getApplicationContext (), "espacio: " +esp + " margin: "+margin_b , Toast.LENGTH_SHORT) .show ();

        int ancho_bt = ancho_2 - 30;
        int alto_bt = alto_3;
        int dif = alto_bt - ancho_bt;
        int ax = 0;
        int ay = 0;

        //Toast.makeText (getApplicationContext (), "La diferencia es : "+dif , Toast.LENGTH_SHORT) .show ();

        if (dif < 50){
            ax = 50 - dif;
        }else if (dif > 50){
            ay = dif - 50;
        }

        ancho_bt = ancho_bt - ax;
        alto_bt = alto_bt - ay;


        //Toast.makeText (getApplicationContext (), "El ancho de botones será: "+ancho_bt , Toast.LENGTH_SHORT) .show ();
        //Toast.makeText (getApplicationContext (), "El alto de botones será: "+alto_bt , Toast.LENGTH_SHORT) .show ();


        ConstraintLayout.LayoutParams params_1 = (ConstraintLayout.LayoutParams) bt_beneficios.getLayoutParams();
        ConstraintLayout.LayoutParams params_2 = (ConstraintLayout.LayoutParams) bt_lactancia.getLayoutParams();
        ConstraintLayout.LayoutParams params_3 = (ConstraintLayout.LayoutParams) bt_extraccion.getLayoutParams();
        ConstraintLayout.LayoutParams params_4 = (ConstraintLayout.LayoutParams) bt_donacion.getLayoutParams();
        ConstraintLayout.LayoutParams params_5 = (ConstraintLayout.LayoutParams) bt_higiene.getLayoutParams();
        ConstraintLayout.LayoutParams params_6 = (ConstraintLayout.LayoutParams) bt_mitos.getLayoutParams();

        params_1.width = ancho_bt;
        params_1.height = alto_bt;
        params_1.bottomMargin = margin_b;

        params_2.width = ancho_bt;
        params_2.height = alto_bt;
        params_2.bottomMargin = margin_b;

        params_3.width = ancho_bt;
        params_3.height = alto_bt;
        params_3.bottomMargin = margin_b;

        params_4.width = ancho_bt;
        params_4.height = alto_bt;
        params_4.bottomMargin = margin_b;

        params_5.width = ancho_bt;
        params_5.height = alto_bt;
        params_5.bottomMargin = margin_b;

        params_6.width = ancho_bt;
        params_6.height = alto_bt;
        params_6.bottomMargin = margin_b;
        /*if(ancho<= 480){
            params_1.width = 200;
            params_2.width = 200;
            params_3.width = 200;
            params_4.width = 200;
            params_5.width = 200;
            params_6.width = 200;
        }else if(ancho > 480 && ancho <= 600){
            params_1.width = 250;
            params_2.width = 250;
            params_3.width = 250;
            params_4.width = 250;
            params_5.width = 250;
            params_6.width = 250;
        }else if(ancho > 600 && ancho <= 720){
            params_1.width = 300;
            params_2.width = 300;
            params_3.width = 300;
            params_4.width = 300;
            params_5.width = 300;
            params_6.width = 300;
        }else if(ancho > 720 && ancho <= 840){
            params_1.width = 300;
            params_2.width = 300;
            params_3.width = 300;
            params_4.width = 300;
            params_5.width = 300;
            params_6.width = 300;
        }else if(ancho > 840 && ancho <= 960){
            params_1.width = 400;
            params_2.width = 400;
            params_3.width = 400;
            params_4.width = 400;
            params_5.width = 400;
            params_6.width = 400;
        }else if(ancho > 960 && ancho <= 1080){
            params_1.width = 450;
            params_2.width = 450;
            params_3.width = 450;
            params_4.width = 450;
            params_5.width = 450;
            params_6.width = 450;
        }else if(ancho > 1080 && ancho <= 1200){
            params_1.width = 500;
            params_2.width = 500;
            params_3.width = 500;
            params_4.width = 500;
            params_5.width = 500;
            params_6.width = 500;
        }else if(ancho > 1200 && ancho <= 1320){
            params_1.width = 550;
            params_2.width = 550;
            params_3.width = 550;
            params_4.width = 550;
            params_5.width = 550;
            params_6.width = 550;
        }else if(ancho > 1320 && ancho <= 1440){
            params_1.width = 600;
            params_2.width = 600;
            params_3.width = 600;
            params_4.width = 600;
            params_5.width = 600;
            params_6.width = 600;
        }else if(ancho > 1440){
            params_1.width = 600;
            params_2.width = 600;
            params_3.width = 600;
            params_4.width = 600;
            params_5.width = 600;
            params_6.width = 600;
        }*/

/*
        if(alto<= 800){
            params_1.height = 200;
            params_1.bottomMargin = 10;
            params_2.height = 200;
            params_2.bottomMargin = 10;
            params_3.height = 200;
            params_3.bottomMargin = 10;
            params_4.height = 200;
            params_4.bottomMargin = 10;
            params_5.height = 200;
            params_5.bottomMargin = 30;
            params_6.height = 200;
            params_6.bottomMargin = 30;
        }else if(alto > 800 && alto <= 1280){
            params_1.height = 300;
            params_1.bottomMargin = 20;
            params_2.height = 300;
            params_2.bottomMargin = 20;
            params_3.height = 300;
            params_3.bottomMargin = 20;
            params_4.height = 300;
            params_4.bottomMargin = 20;
            params_5.height = 300;
            params_5.bottomMargin = 50;
            params_6.height = 300;
            params_6.bottomMargin = 50;
        }else if(alto > 1080 && alto <= 1280){
            params_1.height = 350;
            params_1.bottomMargin = 20;
            params_2.height = 350;
            params_2.bottomMargin = 20;
            params_3.height = 350;
            params_3.bottomMargin = 20;
            params_4.height = 350;
            params_4.bottomMargin = 20;
            params_5.height = 350;
            params_5.bottomMargin = 50;
            params_6.height = 350;
            params_6.bottomMargin = 50;
        }else if(alto > 1280 && alto <= 1920){
            params_1.height = 400;
            params_1.bottomMargin = 30;
            params_2.height = 400;
            params_2.bottomMargin = 30;
            params_3.height = 400;
            params_3.bottomMargin = 30;
            params_4.height = 400;
            params_4.bottomMargin = 30;
            params_5.height = 400;
            params_5.bottomMargin = 50;
            params_6.height = 400;
            params_6.bottomMargin = 50;
        }else if(alto > 1920 && alto <= 2260){
            params_1.height = 520;
            params_1.bottomMargin = 30;
            params_2.height = 520;
            params_2.bottomMargin = 30;
            params_3.height = 520;
            params_3.bottomMargin = 30;
            params_4.height = 520;
            params_4.bottomMargin = 30;
            params_5.height = 520;
            params_5.bottomMargin = 70;
            params_6.height = 520;
            params_6.bottomMargin = 70;
        }else if(alto > 2260 && alto <= 2560) {
            params_1.height = 600;
            params_1.bottomMargin = 50;
            params_2.height = 600;
            params_2.bottomMargin = 50;
            params_3.height = 600;
            params_3.bottomMargin = 50;
            params_4.height = 600;
            params_4.bottomMargin = 50;
            params_5.height = 600;
            params_5.bottomMargin = 50;
            params_6.height = 600;
            params_6.bottomMargin = 50;
        }else if(alto > 2560) {
            params_1.height = 600;
            params_1.bottomMargin = 50;
            params_2.height = 600;
            params_2.bottomMargin = 50;
            params_3.height = 600;
            params_3.bottomMargin = 50;
            params_4.height = 600;
            params_4.bottomMargin = 50;
            params_5.height = 600;
            params_5.bottomMargin = 50;
            params_6.height = 600;
            params_6.bottomMargin = 50;
        }

        bt_beneficios.setLayoutParams(params_1);
        bt_beneficios.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_lactancia.setLayoutParams(params_2);
        bt_lactancia.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_extraccion.setLayoutParams(params_3);
        bt_extraccion.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_donacion.setLayoutParams(params_4);
        bt_donacion.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_higiene.setLayoutParams(params_5);
        bt_higiene.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_mitos.setLayoutParams(params_6);
        bt_mitos.setScaleType(ImageView.ScaleType.CENTER_CROP);*/
    }

    @Override
    public void onBackPressed(){
        super.onDestroy();
        System.exit(0);
    }
}