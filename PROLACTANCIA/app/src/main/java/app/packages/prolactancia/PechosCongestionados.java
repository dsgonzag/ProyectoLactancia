package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import app.packages.prolactancia.Controladores.PechosCongestionadosController;

import app.packages.prolactancia.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class PechosCongestionados extends AppCompatActivity implements  View.OnClickListener{

    TextView txt_titulo,txt_mensaje;
    TabLayout contenido;
    ViewPager vista_pagina;
    TabItem tab_informate,tab_aliviar_cong;
    PechosCongestionadosController pc_controlador;
    ImageButton bt_atras,bt_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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