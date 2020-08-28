package app.packages.prolactancia;

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

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import app.packages.prolactancia.Controladores.SuccionPosicionController;

public class SuccionPosicion extends AppCompatActivity implements  View.OnClickListener{

    TextView txt_titulo,txt_mensaje;
    TabLayout contenido;
    ViewPager vista_pagina;
    TabItem tab_agarre,tab_forma, tab_cesarea;
    SuccionPosicionController sp_controlador;
    ImageButton bt_atras,bt_home;
    ImageView representativa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.succion_posicion);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Succión y posiciones correctas");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(),fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("La madre y su bebé...\n" +
                "deben estar cómodos.\nDar de lactar no debe doler\n");

        contenido =  findViewById(R.id.contenido);
        vista_pagina = findViewById(R.id.vista_contenido);
        representativa = findViewById(R.id.img_representativa);
        tab_agarre = findViewById(R.id.tab_agarre);
        tab_forma = findViewById(R.id.tab_forma);
        tab_cesarea = findViewById(R.id.tab_cesarea);

        sp_controlador = new SuccionPosicionController(getSupportFragmentManager(),contenido.getTabCount());
        vista_pagina.setAdapter(sp_controlador);
        contenido.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vista_pagina.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    sp_controlador.notifyDataSetChanged();
                }
                if (tab.getPosition()==1){
                    sp_controlador.notifyDataSetChanged();
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

        //Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();

        RelativeLayout.LayoutParams params_rep = (RelativeLayout.LayoutParams) representativa.getLayoutParams();
        RelativeLayout.LayoutParams params_men= (RelativeLayout.LayoutParams) txt_mensaje.getLayoutParams();
        RelativeLayout.LayoutParams params_cont = (RelativeLayout.LayoutParams) contenido.getLayoutParams();
        RelativeLayout.LayoutParams params_vp= (RelativeLayout.LayoutParams) vista_pagina.getLayoutParams();

        if(ancho<= 480){
            params_rep.width = 100;
        }else if(ancho > 480 && ancho <= 720){
            params_rep.width = 150;
        }else if(ancho > 720 && ancho <= 1080){
            params_rep.width = 250;
        }else if(ancho > 1080 && ancho <= 1440){
            params_rep.width = 350;
        }

        if(alto<= 800){
            params_vp.height = 400;
        }else if(alto > 800 && alto <= 1280){
            txt_mensaje.setTextSize(15);
            params_vp.height = 650;
        }else if(alto > 1280 && alto <= 1440){
            txt_mensaje.setTextSize(20);
            params_vp.height = 800;
        }else if(alto > 1400 && alto <= 1720){
            txt_mensaje.setTextSize(21);
            params_vp.height = 1000;
        }else if(alto > 1720 && alto <= 2040){
            txt_mensaje.setTextSize(22);
            params_vp.height = 1200;
        }else if(alto > 2040 && alto <= 2560){
            params_vp.height = 1500;
        }

        //contenido.setLayoutParams(params_cont);
        representativa.setLayoutParams(params_rep);
        vista_pagina.setLayoutParams(params_vp);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(SuccionPosicion.this, MenuLactancia.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(SuccionPosicion.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(SuccionPosicion.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}