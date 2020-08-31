package app.packages.prolactancia;

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
import android.widget.Toast;

public class MenuFrecuenciaLactar extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras,bt_home,bt_frecuencia,bt_pecho,bt_duerme,bt_aumentar,bt_protege;
    TextView txt_titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_frecuencia_lactar);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Frecuencia de lactar");

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

        RelativeLayout.LayoutParams params_1 = (RelativeLayout.LayoutParams) bt_frecuencia.getLayoutParams();
        RelativeLayout.LayoutParams params_2= (RelativeLayout.LayoutParams) bt_pecho.getLayoutParams();
        RelativeLayout.LayoutParams params_3 = (RelativeLayout.LayoutParams) bt_duerme.getLayoutParams();
        RelativeLayout.LayoutParams params_4= (RelativeLayout.LayoutParams) bt_aumentar.getLayoutParams();
        RelativeLayout.LayoutParams params_5 = (RelativeLayout.LayoutParams) bt_protege.getLayoutParams();
        //RelativeLayout.LayoutParams params_6= (RelativeLayout.LayoutParams) bt_madre_enf.getLayoutParams();

        RelativeLayout.LayoutParams params_7 = (RelativeLayout.LayoutParams) bt_atras.getLayoutParams();
        RelativeLayout.LayoutParams params_8= (RelativeLayout.LayoutParams) bt_home.getLayoutParams();

        if(ancho<= 480){
            txt_titulo.setPadding(5,15,5,5);
            txt_titulo.setTextSize(20);
            params_1.width = 200;
            params_2.width = 200;
            params_3.width = 200;
            params_4.width = 200;
            params_5.width = 200;
            //params_6.width = 200;
            //params_7.width = 200;
            //params_8.width = 200;
        }else if(ancho > 480 && ancho <= 600){
            txt_titulo.setPadding(5,15,5,5);
            txt_titulo.setTextSize(20);
            params_1.width = 250;
            params_2.width = 250;
            params_3.width = 250;
            params_4.width = 250;
            params_5.width = 250;
            //params_6.width = 250;
            //params_7.width = 125;
            //params_8.width = 125;
        }else if(ancho > 600 && ancho <= 720){
            txt_titulo.setPadding(5,15,5,5);
            txt_titulo.setTextSize(24);
            params_1.width = 300;
            params_2.width = 300;
            params_3.width = 300;
            params_4.width = 300;
            params_5.width = 300;
            //params_6.width = 300;
            //params_7.width = 150;
            //params_8.width = 150;
        }else if(ancho > 720 && ancho <= 840){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(24);
            params_1.width = 350;
            params_2.width = 350;
            params_3.width = 350;
            params_4.width = 350;
            params_5.width = 350;
            //params_6.width = 350;
            //params_7.width = 175;
            //params_8.width = 175;
        }else if(ancho > 840 && ancho <= 960){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(26);
            params_1.width = 400;
            params_2.width = 400;
            params_3.width = 400;
            params_4.width = 400;
            params_5.width = 400;
            //params_6.width = 400;
            //params_7.width = 200;
            //params_8.width = 200;
        }else if(ancho > 960 && ancho <= 1080){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(28);
            params_1.width = 450;
            params_2.width = 450;
            params_3.width = 450;
            params_4.width = 450;
            params_5.width = 450;
            //params_6.width = 450;
            params_7.width = 220;
            params_8.width = 220;
        }else if(ancho > 1080 && ancho <= 1200){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(28);
            params_1.width = 500;
            params_2.width = 500;
            params_3.width = 500;
            params_4.width = 500;
            params_5.width = 500;
            //params_6.width = 500;
            params_7.width = 240;
            params_8.width = 240;
        }else if(ancho > 1200 && ancho <= 1320){
            txt_titulo.setPadding(5,10,5,5);
            txt_titulo.setTextSize(28);
            params_1.width = 550;
            params_2.width = 550;
            params_3.width = 550;
            params_4.width = 550;
            params_5.width = 550;
            //params_6.width = 550;
            params_7.width = 260;
            params_8.width = 260;
        }else if(ancho > 1320 && ancho <= 1440){
            txt_titulo.setPadding(5,5,5,5);
            txt_titulo.setTextSize(30);
            params_1.width = 600;
            params_2.width = 600;
            params_3.width = 600;
            params_4.width = 600;
            params_5.width = 600;
            //params_6.width = 600;
            params_7.width = 275;
            params_8.width = 275;
        }


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
            params_5.bottomMargin = 10;
            //params_6.height = 200;
            //params_6.bottomMargin = 10;
            //params_7.height = 200;
            //params_8.height = 200;
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
            params_5.bottomMargin = 20;
            //params_6.height = 300;
            //params_6.bottomMargin = 20;
            //params_7.height = 300;
            //params_8.height = 300;
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
            params_5.bottomMargin = 30;
            //params_6.height = 400;
            ///params_6.bottomMargin = 30;
            //params_7.height = 400;
            //params_8.height = 400;
        }else if(alto > 1920 && alto <= 2160){
            params_1.height = 550;
            params_1.bottomMargin = 20;
            params_2.height = 550;
            params_2.bottomMargin = 20;
            params_3.height = 550;
            params_3.bottomMargin = 20;
            params_4.height = 550;
            params_4.bottomMargin = 20;
            params_5.height = 550;
            params_5.bottomMargin = 40;
            //params_6.height = 550;
            //params_6.bottomMargin = 40;
            params_7.height = 220;
            params_8.height = 220;
        }else if(alto > 2160 && alto <= 2560) {
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
            //params_6.height = 600;
            //params_6.bottomMargin = 50;
            params_7.height = 275;
            params_8.height = 275;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuFrecuenciaLactar.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}