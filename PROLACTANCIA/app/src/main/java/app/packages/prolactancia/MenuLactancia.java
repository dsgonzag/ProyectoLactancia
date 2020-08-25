package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

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

import app.packages.prolactancia.R;

public class MenuLactancia extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras,bt_home,bt_alimentacion,bt_problemas_lact,bt_succion,bt_frecuencia_lact;
    TextView txt_titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();

        RelativeLayout.LayoutParams params_alim = (RelativeLayout.LayoutParams) bt_alimentacion.getLayoutParams();
        RelativeLayout.LayoutParams params_prob= (RelativeLayout.LayoutParams) bt_problemas_lact.getLayoutParams();
        RelativeLayout.LayoutParams params_succ = (RelativeLayout.LayoutParams) bt_succion.getLayoutParams();
        RelativeLayout.LayoutParams params_frec= (RelativeLayout.LayoutParams) bt_frecuencia_lact.getLayoutParams();

        if(ancho<= 720){
            //xxxxxxxx
        }else if(ancho > 720 && ancho <= 1080){
            params_alim.width = 500;
            params_prob.width = 500;
            params_succ.width = 500;
            params_frec.width = 500;
        }

        if(alto<= 1200){
            //xxxxxxxxx
        }else if(alto > 1200 && alto <= 2400){
            params_alim.height = 500;
            params_alim.bottomMargin = 100;
            params_prob.height = 500;
            params_prob.bottomMargin = 100;
            params_succ.height = 500;
            params_succ.bottomMargin = 400;
            params_frec.height = 500;
            params_frec.bottomMargin = 400;
        }
        bt_alimentacion.setLayoutParams(params_alim);
        bt_alimentacion.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_problemas_lact.setLayoutParams(params_prob);
        bt_problemas_lact.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_succion.setLayoutParams(params_succ);
        bt_succion.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_frecuencia_lact.setLayoutParams(params_frec);
        bt_frecuencia_lact.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}