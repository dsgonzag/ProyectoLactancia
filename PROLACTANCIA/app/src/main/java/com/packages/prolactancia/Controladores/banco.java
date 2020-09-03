package com.packages.prolactancia.Controladores;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.packages.prolactancia.Maps;

import com.packages.prolactancia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link banco#newInstance} factory method to
 * create an instance of this fragment.
 */
public class banco extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public banco() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment banco.
     */
    // TODO: Rename and change types and number of parameters
    public static banco newInstance(String param1, String param2) {
        banco fragment = new banco();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_banco, container, false);

        ImageButton ir_mapa = view.findViewById(R.id.bt_buscar_centros);
        ir_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapa = new Intent(getActivity(), Maps.class);
                startActivity(mapa);
            }
        });

        redimensionar(view);
        return view;
    }


    public void redimensionar(View v){
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        int ancho = dm.widthPixels;
        int alto = dm.heightPixels;

        TextView t1 = v.findViewById(R.id.textView1);
        TextView t2 = v.findViewById(R.id.textView2);
        ImageView i1 = v.findViewById(R.id.img_fg_banco_1);
        ImageButton b1 = v.findViewById(R.id.bt_buscar_centros);

        ConstraintLayout.LayoutParams params_i1 = (ConstraintLayout.LayoutParams) i1.getLayoutParams();
        ConstraintLayout.LayoutParams params_b1 = (ConstraintLayout.LayoutParams) b1.getLayoutParams();

        String fuente1 = "fuentes/futura medium bt.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(this.getActivity().getAssets(),fuente1);
        t1.setTypeface(tipo_fuente1);
        t2.setTypeface(tipo_fuente1);

        /*if(ancho<= 480){
            params_rep.width = 100;
        }else if(ancho > 480 && ancho <= 720){
            params_rep.width = 150;
        }else if(ancho > 720 && ancho <= 1080){
            txt_titulo.setTextSize(18);
            params_rep.width = 250;
        }else if(ancho > 1080 && ancho <= 1440){
            params_rep.width = 350;
        }*/

        if(alto<= 800){
            t1.setTextSize(14);
            t2.setTextSize(14);
            params_i1.height = 200;
            params_b1.height = 100;
        }else if(alto > 800 && alto <= 1080){
            t1.setTextSize(15);
            t2.setTextSize(15);
            params_i1.height = 250;
            params_b1.height = 125;
        }else if(alto > 1080 && alto <= 1280){
            t1.setTextSize(16);
            t2.setTextSize(16);
            params_i1.height = 300;
            params_b1.height = 150;
        }else if(alto > 1280 && alto <= 1440){
            t1.setTextSize(16);
            t2.setTextSize(16);
            params_i1.height = 350;
            params_b1.height = 175;
        }else if(alto > 1440 && alto <= 1720){
            t1.setTextSize(17);
            t2.setTextSize(17);
            params_i1.height = 400;
            params_b1.height = 200;
        }else if(alto > 1720 && alto <= 2040){
            t1.setTextSize(17);
            t2.setTextSize(17);
            params_i1.height = 500;
            params_b1.height = 250;
        }else if(alto > 2040 && alto <= 2260){
            t1.setTextSize(18);
            t2.setTextSize(18);
            params_i1.height = 600;
            params_b1.height = 300;
        }else if(alto > 2260 && alto <= 2560){
            t1.setTextSize(19);
            t2.setTextSize(19);
            params_i1.height = 650;
            params_b1.height = 325;
        }else if(alto > 2560){
            t1.setTextSize(20);
            t2.setTextSize(20);
            params_i1.height = 700;
            params_b1.height = 350;
        }
        i1.setLayoutParams(params_i1);
    }
}