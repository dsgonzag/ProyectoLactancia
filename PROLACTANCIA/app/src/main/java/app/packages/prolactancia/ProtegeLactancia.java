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

public class ProtegeLactancia extends AppCompatActivity implements  View.OnClickListener {

    TextView txt_titulo, txt_mensaje;
    ImageButton bt_atras, bt_home;
    ImageView representativa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.protege_lactancia);

        txt_titulo = findViewById(R.id.txt_titulo);
        String fuente1 = "fuentes/Comfortaa-Bold.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(getAssets(), fuente1);
        txt_titulo.setTypeface(tipo_fuente1);
        txt_titulo.setText("Protege tu lactancia");

        String fuente2 = "fuentes/futura.ttf";
        Typeface tipo_fuente2 = Typeface.createFromAsset(getAssets(), fuente2);
        txt_mensaje = findViewById(R.id.txt_mensaje);
        txt_mensaje.setTypeface(tipo_fuente2);
        txt_mensaje.setText("Tu leche es la mejor opción ya que favorece...\n" +
                "al sano crecimiento y desarrollo de tu bebé.\n");

        representativa = findViewById(R.id.img_representativa);

        bt_atras = findViewById(R.id.bt_atras);
        bt_atras.setOnClickListener(this);
        bt_home = findViewById(R.id.bt_home);
        bt_home.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_atras:
                Intent atras = new Intent(ProtegeLactancia.this, MenuFrecuenciaLactar.class);
                this.finish();
                startActivity(atras);
                break;
            case R.id.bt_home:
                Intent home = new Intent(ProtegeLactancia.this, MenuPrincipal.class);
                this.finish();
                startActivity(home);
                break;
            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(ProtegeLactancia.this, MenuFrecuenciaLactar.class);
        this.finish();
        startActivity(atras);
    }

}