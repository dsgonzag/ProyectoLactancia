package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
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

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuFrecuenciaLactar.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}