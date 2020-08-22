package app.packages.prolactancia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import app.packages.prolactancia.R;

public class MenuPrincipal extends AppCompatActivity implements  View.OnClickListener{

    ImageButton bt_beneficios, bt_lactancia, bt_extraccion, bt_donacion, bt_higiene, bt_mitos;
    Intent siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

        bt_beneficios=findViewById(R.id.bt_beneficios);
        bt_beneficios.setOnClickListener(this);
        bt_lactancia=findViewById(R.id.bt_lactancia);
        bt_lactancia.setOnClickListener(this);
        bt_extraccion=findViewById(R.id.bt_extraccion);
        bt_donacion=findViewById(R.id.bt_donacion);
        bt_higiene=findViewById(R.id.bt_higiene);
        bt_higiene.setOnClickListener(this);
        bt_mitos=findViewById(R.id.bt_mitos);



    }

    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.bt_beneficios:
                //Toast.makeText (getApplicationContext (), "boton beneficios" , Toast.LENGTH_SHORT) .show ();
                siguiente = new Intent(MenuPrincipal.this, Beneficios.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_lactancia:
                siguiente = new Intent(MenuPrincipal.this, MenuLactancia.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_extraccion:

                break;
            case R.id.bt_donacion:

                break;
            case R.id.bt_higiene:
                siguiente = new Intent(MenuPrincipal.this, Higiene.class);
                this.finish();
                startActivity(siguiente);
                break;
            case R.id.bt_mitos:

                break;
            default: break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onDestroy();
        System.exit(0);
    }
}