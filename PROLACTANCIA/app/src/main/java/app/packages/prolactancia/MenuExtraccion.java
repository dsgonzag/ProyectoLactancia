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

public class MenuExtraccion extends AppCompatActivity implements View.OnClickListener {
    Intent siguiente;
    ImageButton bt_atras, bt_home, bt_estimulacion, bt_almacenamiento;
    TextView txt_titulo, txt_mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_extraccion);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(), fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Extracción");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(), fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("Aprender a extraer y almacenar...\n" +
                "la leche materna es necesaria para que otra persona pueda alimentar a su hijo o hija, cuando usted tenga que ausentarse.\n");

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);
        bt_estimulacion = findViewById(R.id.bt_estimulacion);
        bt_estimulacion.setOnClickListener(this);
        bt_almacenamiento = findViewById(R.id.bt_almacenamiento);
        bt_almacenamiento.setOnClickListener(this);

        //redimensionar();

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_atras:
                siguiente = new Intent(MenuExtraccion.this, MenuPrincipal.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_home:
                siguiente = new Intent(MenuExtraccion.this, MenuPrincipal.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_estimulacion:
                siguiente = new Intent(MenuExtraccion.this, EstimulacionExtraccion.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_almacenamiento:
                siguiente = new Intent(MenuExtraccion.this, AlmacenamientoTraslado.class);
                this.finish();
                startActivity(siguiente);
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MenuExtraccion.this, MenuPrincipal.class);
        this.finish();
        startActivity(atras);
    }
}