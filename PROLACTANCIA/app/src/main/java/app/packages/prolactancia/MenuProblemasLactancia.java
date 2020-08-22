package app.packages.prolactancia;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

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

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuProblemasLactancia.this, MenuLactancia.class);
        this.finish();
        startActivity(atras);
    }
}