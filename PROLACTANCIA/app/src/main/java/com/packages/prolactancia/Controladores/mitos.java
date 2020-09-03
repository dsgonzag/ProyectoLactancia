package com.packages.prolactancia.Controladores;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.packages.prolactancia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mitos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mitos extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public mitos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment mitos.
     */
    // TODO: Rename and change types and number of parameters
    public static mitos newInstance(String param1, String param2) {
        mitos fragment = new mitos();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mitos, container, false);

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
        TextView t3 = v.findViewById(R.id.textView3);
        TextView t4 = v.findViewById(R.id.textView4);
        TextView t5 = v.findViewById(R.id.textView5);
        TextView t6 = v.findViewById(R.id.textView6);
        TextView t7 = v.findViewById(R.id.textView7);
        TextView t8 = v.findViewById(R.id.textView8);

        String fuente1 = "fuentes/futura medium bt.ttf";
        Typeface tipo_fuente1 = Typeface.createFromAsset(this.getActivity().getAssets(),fuente1);
        t1.setTypeface(tipo_fuente1);
        t2.setTypeface(tipo_fuente1);
        t3.setTypeface(tipo_fuente1);
        t4.setTypeface(tipo_fuente1);
        t5.setTypeface(tipo_fuente1);
        t6.setTypeface(tipo_fuente1);
        t7.setTypeface(tipo_fuente1);
        t8.setTypeface(tipo_fuente1);

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
            t3.setTextSize(14);
            t4.setTextSize(14);
            t5.setTextSize(14);
            t6.setTextSize(14);
            t7.setTextSize(14);
            t8.setTextSize(14);
        }else if(alto > 800 && alto <= 1080){
            t1.setTextSize(15);
            t2.setTextSize(15);
            t3.setTextSize(15);
            t4.setTextSize(15);
            t5.setTextSize(15);
            t6.setTextSize(15);
            t7.setTextSize(15);
            t8.setTextSize(15);
        }else if(alto > 1080 && alto <= 1280){
            t1.setTextSize(16);
            t2.setTextSize(16);
            t3.setTextSize(16);
            t4.setTextSize(16);
            t5.setTextSize(16);
            t6.setTextSize(16);
            t7.setTextSize(16);
            t8.setTextSize(16);
        }else if(alto > 1280 && alto <= 1440){
            t1.setTextSize(16);
            t2.setTextSize(16);
            t3.setTextSize(16);
            t4.setTextSize(16);
            t5.setTextSize(16);
            t6.setTextSize(16);
            t7.setTextSize(16);
            t8.setTextSize(16);
        }else if(alto > 1440 && alto <= 1720){
            t1.setTextSize(17);
            t2.setTextSize(17);
            t3.setTextSize(17);
            t4.setTextSize(17);
            t5.setTextSize(17);
            t6.setTextSize(17);
            t7.setTextSize(17);
            t8.setTextSize(17);
        }else if(alto > 1720 && alto <= 2040){
            t1.setTextSize(17);
            t2.setTextSize(17);
            t3.setTextSize(17);
            t4.setTextSize(17);
            t5.setTextSize(17);
            t6.setTextSize(17);
            t7.setTextSize(17);
            t8.setTextSize(17);
        }else if(alto > 2040 && alto <= 2260){
            t1.setTextSize(18);
            t2.setTextSize(18);
            t3.setTextSize(18);
            t4.setTextSize(18);
            t5.setTextSize(18);
            t6.setTextSize(18);
            t7.setTextSize(18);
            t8.setTextSize(18);
        }else if(alto > 2260 && alto <= 2560){
            t1.setTextSize(19);
            t2.setTextSize(19);
            t3.setTextSize(19);
            t4.setTextSize(19);
            t5.setTextSize(19);
            t6.setTextSize(19);
            t7.setTextSize(19);
            t8.setTextSize(19);
        }else if(alto > 2560){
            t1.setTextSize(20);
            t2.setTextSize(20);
            t3.setTextSize(20);
            t4.setTextSize(20);
            t5.setTextSize(20);
            t6.setTextSize(20);
            t7.setTextSize(20);
            t8.setTextSize(20);
        }
    }
}