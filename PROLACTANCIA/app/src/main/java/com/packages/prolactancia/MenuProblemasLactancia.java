package com.packages.prolactancia;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.packages.prolactancia.R;

public class MenuProblemasLactancia extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras,bt_home,bt_pechos_con,bt_dolor,bt_ductos_obs,bt_mastitis,bt_abceso,bt_madre_enf;
    TextView txt_titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_problemas_lactancia);

        /*txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Problemas en la Lactancia");*/

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);
        bt_pechos_con = findViewById(R.id.bt_pechos_con);
        bt_pechos_con.setOnClickListener(this);
        bt_dolor = findViewById(R.id.bt_dolor);
        bt_dolor.setOnClickListener(this);
        bt_ductos_obs = findViewById(R.id.bt_ductos_obs);
        bt_ductos_obs.setOnClickListener(this);
        bt_mastitis = findViewById(R.id.bt_mastitis);
        bt_mastitis.setOnClickListener(this);
        bt_abceso = findViewById(R.id.bt_abceso);
        bt_abceso.setOnClickListener(this);
        bt_madre_enf = findViewById(R.id.bt_madre_enf);
        bt_madre_enf.setOnClickListener(this);

        redimensionar();
    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                siguiente = new Intent(MenuProblemasLactancia.this, MenuLactancia.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_home:
                siguiente = new Intent(MenuProblemasLactancia.this, MenuPrincipal.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_pechos_con:
                siguiente = new Intent(MenuProblemasLactancia.this, PechosCongestionados.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_dolor:
                siguiente = new Intent(MenuProblemasLactancia.this, DolorGrietas.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_ductos_obs:
                siguiente = new Intent(MenuProblemasLactancia.this, DuctosObstruidos.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_mastitis:
                siguiente = new Intent(MenuProblemasLactancia.this, Mastitis.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_abceso:
                siguiente = new Intent(MenuProblemasLactancia.this, Abceso.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_madre_enf:
                siguiente = new Intent(MenuProblemasLactancia.this, MadreEnferma.class);
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


        RelativeLayout.LayoutParams params_1 = (RelativeLayout.LayoutParams) bt_pechos_con.getLayoutParams();
        RelativeLayout.LayoutParams params_2= (RelativeLayout.LayoutParams) bt_dolor.getLayoutParams();
        RelativeLayout.LayoutParams params_3 = (RelativeLayout.LayoutParams) bt_ductos_obs.getLayoutParams();
        RelativeLayout.LayoutParams params_4= (RelativeLayout.LayoutParams) bt_mastitis.getLayoutParams();
        RelativeLayout.LayoutParams params_5 = (RelativeLayout.LayoutParams) bt_abceso.getLayoutParams();
        RelativeLayout.LayoutParams params_6= (RelativeLayout.LayoutParams) bt_madre_enf.getLayoutParams();

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
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuProblemasLactancia.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}