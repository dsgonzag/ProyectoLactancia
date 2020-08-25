package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import app.packages.prolactancia.Controladores.BeneficiosController;

import app.packages.prolactancia.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Beneficios extends AppCompatActivity implements View.OnClickListener{

    TextView txt_titulo,txt_mensaje;
    TabLayout contenido;
    ViewPager vista_pagina;
    TabItem tab_madre,tab_hijo;
    BeneficiosController b_controlador;
    ImageButton bt_atras,bt_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beneficios);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Beneficios");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(),fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("La lactancia materna...\n" +
                "Tiene grandes beneficios para la salud de la madre y el lactante.\n");

        contenido =  findViewById(R.id.contenido);
        vista_pagina = findViewById(R.id.vista_contenido);
        tab_madre = findViewById(R.id.tab_madre);
        tab_hijo = findViewById(R.id.tab_hijo);

        b_controlador = new BeneficiosController(getSupportFragmentManager(),contenido.getTabCount());
        vista_pagina.setAdapter(b_controlador);
        contenido.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vista_pagina.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    b_controlador.notifyDataSetChanged();
                }
                if (tab.getPosition()==1){
                    b_controlador.notifyDataSetChanged();
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

        Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();

        //RelativeLayout.LayoutParams params_alim = (RelativeLayout.LayoutParams) bt_alimentacion.getLayoutParams();
        //RelativeLayout.LayoutParams params_prob= (RelativeLayout.LayoutParams) bt_problemas_lact.getLayoutParams();
        RelativeLayout.LayoutParams params_cont = (RelativeLayout.LayoutParams) contenido.getLayoutParams();
        RelativeLayout.LayoutParams params_vp= (RelativeLayout.LayoutParams) vista_pagina.getLayoutParams();

        /*if(ancho< 720){
            params_cont.width = 450;
            params_vp.width = 450;
        }else if(ancho >= 720 && ancho <= 1080){
            params_cont.width = 650;
            params_vp.width = 650;
        }else if(ancho > 1080 && ancho <= 2560){
            params_cont.width = 650;
            params_vp.width = 650;
        }*/

        if(alto<= 800){
            params_vp.height = 450;
        }else if(alto > 800 && alto <= 1200){
            params_vp.height = 650;
        }else if(alto > 1200 && alto <= 2400){
            params_vp.height = 800;
        }
        /*bt_alimentacion.setLayoutParams(params_alim);
        bt_alimentacion.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_problemas_lact.setLayoutParams(params_prob);
        bt_problemas_lact.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_succion.setLayoutParams(params_succ);
        bt_succion.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_frecuencia_lact.setLayoutParams(params_frec);
        bt_frecuencia_lact.setScaleType(ImageView.ScaleType.CENTER_CROP);*/
        contenido.setLayoutParams(params_cont);
        vista_pagina.setLayoutParams(params_vp);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(Beneficios.this, MenuPrincipal.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(Beneficios.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(Beneficios.this, MenuPrincipal.class);
        this.finish();
        startActivity(atras);
    }
}