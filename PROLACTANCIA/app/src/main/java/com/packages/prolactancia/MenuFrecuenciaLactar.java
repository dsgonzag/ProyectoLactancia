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

public class MenuFrecuenciaLactar extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras,bt_home,bt_frecuencia,bt_pecho,bt_duerme,bt_aumentar,bt_protege;
    TextView txt_titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_frecuencia_lactar);

        /*txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Frecuencia de lactar");*/

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);
        bt_frecuencia = findViewById(R.id.bt_frecuencia);
        bt_frecuencia.setOnClickListener(this);
        bt_pecho = findViewById(R.id.bt_pecho);
        bt_pecho.setOnClickListener(this);
        bt_duerme = findViewById(R.id.bt_duerme);
        bt_duerme.setOnClickListener(this);
        bt_aumentar = findViewById(R.id.bt_aumentar);
        bt_aumentar.setOnClickListener(this);
        bt_protege = findViewById(R.id.bt_protege);
        bt_protege.setOnClickListener(this);

        redimensionar();
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                siguiente = new Intent(MenuFrecuenciaLactar.this, MenuLactancia.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_home:
                siguiente = new Intent(MenuFrecuenciaLactar.this, MenuPrincipal.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_frecuencia:
                siguiente = new Intent(MenuFrecuenciaLactar.this, FrecuenciaSuccion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_pecho:
                siguiente = new Intent(MenuFrecuenciaLactar.this, SoloPecho.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_duerme:
                siguiente = new Intent(MenuFrecuenciaLactar.this, DuermeSuelta.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_aumentar:
                siguiente = new Intent(MenuFrecuenciaLactar.this, AumentarProduccion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_protege:
                siguiente = new Intent(MenuFrecuenciaLactar.this, ProtegeLactancia.class);
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


        RelativeLayout.LayoutParams params_1 = (RelativeLayout.LayoutParams) bt_frecuencia.getLayoutParams();
        RelativeLayout.LayoutParams params_2= (RelativeLayout.LayoutParams) bt_pecho.getLayoutParams();
        RelativeLayout.LayoutParams params_3 = (RelativeLayout.LayoutParams) bt_duerme.getLayoutParams();
        RelativeLayout.LayoutParams params_4= (RelativeLayout.LayoutParams) bt_aumentar.getLayoutParams();
        RelativeLayout.LayoutParams params_5 = (RelativeLayout.LayoutParams) bt_protege.getLayoutParams();
        //RelativeLayout.LayoutParams params_6= (RelativeLayout.LayoutParams) bt_madre_enf.getLayoutParams();

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

        /*params_6.width = ancho_bt;
        params_6.height = alto_bt;
        params_6.bottomMargin = margin_b;*/
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuFrecuenciaLactar.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}