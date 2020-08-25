package app.packages.prolactancia;

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

import androidx.appcompat.app.AppCompatActivity;

import app.packages.prolactancia.R;

public class MenuProblemasLactancia extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras,bt_home,bt_pechos_con,bt_dolor,bt_ductos_obs,bt_mastitis,bt_abceso,bt_madre_enf;
    TextView txt_titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_problemas_lactancia);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(),fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Problemas en la Lactancia");

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

        Toast.makeText (getApplicationContext (), "ancho: " +ancho + " alto: "+alto , Toast.LENGTH_SHORT) .show ();

        RelativeLayout.LayoutParams params_pec = (RelativeLayout.LayoutParams) bt_pechos_con.getLayoutParams();
        RelativeLayout.LayoutParams params_dol= (RelativeLayout.LayoutParams) bt_dolor.getLayoutParams();
        RelativeLayout.LayoutParams params_obs = (RelativeLayout.LayoutParams) bt_ductos_obs.getLayoutParams();
        RelativeLayout.LayoutParams params_mas= (RelativeLayout.LayoutParams) bt_mastitis.getLayoutParams();
        RelativeLayout.LayoutParams params_abc = (RelativeLayout.LayoutParams) bt_abceso.getLayoutParams();
        RelativeLayout.LayoutParams params_enf= (RelativeLayout.LayoutParams) bt_madre_enf.getLayoutParams();

        if(ancho<= 720){
            txt_titulo.setTextSize(20);
            params_pec.width = 200;
            params_dol.width = 200;
            params_obs.width = 200;
            params_mas.width = 200;
            params_abc.width = 200;
            params_enf.width = 200;
        }else if(ancho > 720 && ancho <= 1080){
            params_pec.width = 500;
            params_dol.width = 500;
            params_obs.width = 500;
            params_mas.width = 500;
            params_abc.width = 500;
            params_enf.width = 500;
        }

        if(alto<= 1200){
            params_pec.height = 200;
            params_pec.bottomMargin = 0;
            params_dol.height = 200;
            params_dol.bottomMargin = 0;
            params_obs.height = 200;
            params_obs.bottomMargin = 0;
            params_mas.height = 200;
            params_mas.bottomMargin = 0;
            params_abc.height = 200;
            params_abc.bottomMargin = 30;
            params_enf.height = 200;
            params_enf.bottomMargin = 30;
        }else if(alto > 1200 && alto <= 2400){
            params_pec.height = 500;
            params_pec.bottomMargin = 100;
            params_dol.height = 500;
            params_dol.bottomMargin = 100;
            params_obs.height = 500;
            params_obs.bottomMargin = 400;
            params_mas.height = 500;
            params_mas.bottomMargin = 400;
            params_abc.height = 500;
            params_abc.bottomMargin = 400;
            params_enf.height = 500;
            params_enf.bottomMargin = 400;
        }
        bt_pechos_con.setLayoutParams(params_pec);
        bt_pechos_con.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_dolor.setLayoutParams(params_dol);
        bt_dolor.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_ductos_obs.setLayoutParams(params_obs);
        bt_ductos_obs.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_mastitis.setLayoutParams(params_mas);
        bt_mastitis.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_abceso.setLayoutParams(params_abc);
        bt_abceso.setScaleType(ImageView.ScaleType.CENTER_CROP);
        bt_madre_enf.setLayoutParams(params_enf);
        bt_madre_enf.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuProblemasLactancia.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}