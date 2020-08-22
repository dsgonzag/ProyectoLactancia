package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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
                Toast.makeText (getApplicationContext (), "boton succión" , Toast.LENGTH_SHORT) .show ();
                break;
            case R.id.bt_frecuencia_lact:
                Toast.makeText (getApplicationContext (), "boton frecuencia" , Toast.LENGTH_SHORT) .show ();
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
}