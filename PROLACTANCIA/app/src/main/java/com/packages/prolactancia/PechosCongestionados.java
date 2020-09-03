package com.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

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

import com.packages.prolactancia.Controladores.PechosCongestionadosController;

import com.packages.prolactancia.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class PechosCongestionados extends AppCompatActivity implements  View.OnClickListener{

    TextView txt_titulo,txt_mensaje;
    TabLayout contenido;
    ViewPager vista_pagina;
    TabItem tab_informate,tab_aliviar_cong;
    PechosCongestionadosController pc_controlador;
    ImageButton bt_atras,bt_home;
    ImageView representativa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pechos_congestionados);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Pechos congestionados");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(),fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("Cuando sus pechos...\n" +
                "estan demasiados llenos de leche se ponen duros y le duelen. Eso quiere decir que tiene los pechos congestionados.\n");

        contenido =  findViewById(R.id.contenido);
        vista_pagina = findViewById(R.id.vista_contenido);
        representativa = findViewById(R.id.img_representativa);
        tab_informate = findViewById(R.id.tab_informate);
        tab_aliviar_cong = findViewById(R.id.tab_aliviar_cong);

        pc_controlador = new PechosCongestionadosController(getSupportFragmentManager(),contenido.getTabCount());
        vista_pagina.setAdapter(pc_controlador);
        contenido.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vista_pagina.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    pc_controlador.notifyDataSetChanged();
                }
                if (tab.getPosition()==1){
                    pc_controlador.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        vista_pagina.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(contenido));

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
        RelativeLayout.LayoutParams params_2= (RelativeLayout.LayoutParams) vista_pagina.getLayoutParams();
        //RelativeLayout.LayoutParams params_3 = (RelativeLayout.LayoutParams) bt_duerme.getLayoutParams();
        //RelativeLayout.LayoutParams params_4= (RelativeLayout.LayoutParams) bt_aumentar.getLayoutParams();
        //RelativeLayout.LayoutParams params_5 = (RelativeLayout.LayoutParams) bt_protege.getLayoutParams();
        //RelativeLayout.LayoutParams params_6= (RelativeLayout.LayoutParams) bt_madre_enf.getLayoutParams();

        RelativeLayout.LayoutParams params_7 = (RelativeLayout.LayoutParams) bt_atras.getLayoutParams();
        RelativeLayout.LayoutParams params_8= (RelativeLayout.LayoutParams) bt_home.getLayoutParams();

        if(ancho<= 480){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(18);
            txt_mensaje.setTextSize(13);
            params_1.width = 100;
        }else if(ancho > 480 && ancho <= 600){
            txt_titulo.setPadding(5,0,5,5);
            txt_titulo.setTextSize(18);
            txt_mensaje.setTextSize(14);
            params_1.width = 150;
        }else if(ancho > 600 && ancho <= 720){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(20);
            txt_mensaje.setTextSize(16);
            params_1.width = 200;
        }else if(ancho > 720 && ancho <= 840){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(20);
            txt_mensaje.setTextSize(16);
            params_1.width = 250;
        }else if(ancho > 840 && ancho <= 960){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(20);
            txt_mensaje.setTextSize(14);
            params_1.width = 300;
        }else if(ancho > 960 && ancho <= 1080){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(20);
            txt_mensaje.setTextSize(14);
            params_1.width = 350;

            params_7.width = 220;
            params_8.width = 220;
        }else if(ancho > 1080 && ancho <= 1200){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(30);
            txt_mensaje.setTextSize(21);
            params_1.width = 400;

            params_7.width = 240;
            params_8.width = 240;
        }else if(ancho > 1200 && ancho <= 1320){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(30);
            txt_mensaje.setTextSize(20);
            params_1.width = 450;

            params_7.width = 260;
            params_8.width = 260;
        }else if(ancho > 1320 && ancho <= 1440){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(32);
            txt_mensaje.setTextSize(20);
            params_1.width = 500;

            params_7.width = 275;
            params_8.width = 275;
        }else if(ancho > 1440){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(32);
            txt_mensaje.setTextSize(20);
            params_1.width = 500;

            params_7.width = 275;
            params_8.width = 275;
        }


        if(alto<= 800){
            params_1.height = 100;
            params_2.height = 400;
        }else if(alto > 800 && alto <= 1280){
            params_1.height = 200;
            params_2.height = 600;
        }else if(alto > 1280 && alto <= 1800){
            params_1.height = 220;
            params_2.height = 900;
        }else if(alto > 1800 && alto <= 1920){
            params_1.height = 220;
            params_2.height = 1000;
        }else if(alto > 1920 && alto <= 2160){
            params_1.height = 250;
            params_2.height = 1150;

            params_7.height = 220;
            params_8.height = 220;
        }else if(alto > 2160 && alto <= 2560) {
            params_1.height = 300;
            params_2.height = 1300;

            params_7.height = 275;
            params_8.height = 275;
        }else if(alto > 2560) {
            params_1.height = 300;
            params_2.height = 1300;

            params_7.height = 275;
            params_8.height = 275;
        }
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(PechosCongestionados.this, MenuProblemasLactancia.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(PechosCongestionados.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(PechosCongestionados.this, MenuProblemasLactancia.class);
        this.finish();
        startActivity(atras);
    }
}