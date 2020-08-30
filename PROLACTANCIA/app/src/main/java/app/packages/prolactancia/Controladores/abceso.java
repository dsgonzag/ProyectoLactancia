package app.packages.prolactancia.Controladores;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import app.packages.prolactancia.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link abceso#newInstance} factory method to
 * create an instance of this fragment.
 */
public class abceso extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public abceso() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment abceso.
     */
    // TODO: Rename and change types and number of parameters
    public static abceso newInstance(String param1, String param2) {
        abceso fragment = new abceso();
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
        View view = inflater.inflate(R.layout.fragment_abceso, container, false);

        redimensionar(view);
        return view;
    }

    public void redimensionar(View v){
        DisplayMetrics dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        int ancho = dm.widthPixels;
        int alto = dm.heightPixels;

        TextView t1 = v.findViewById(R.id.textView1);
        ImageView i1 = v.findViewById(R.id.img_abceso_info);
        TextView t3 = v.findViewById(R.id.textView3);
        TextView t4 = v.findViewById(R.id.textView4);

        ConstraintLayout.LayoutParams params_i1 = (ConstraintLayout.LayoutParams) i1.getLayoutParams();

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
            t1.setTextSize(13);
            params_i1.height = 150;
            t3.setTextSize(13);
            t4.setTextSize(13);
        }else if(alto > 800 && alto <= 1280){
            t1.setTextSize(14);
            params_i1.height = 200;
            t3.setTextSize(14);
            t4.setTextSize(14);
        }else if(alto > 1280 && alto <= 1440){
            t1.setTextSize(15);
            params_i1.height = 250;
            t3.setTextSize(15);
            t4.setTextSize(15);
        }else if(alto > 1440 && alto <= 1720){
            t1.setTextSize(16);
            params_i1.height = 300;
            t3.setTextSize(16);
            t4.setTextSize(16);
        }else if(alto > 1720 && alto <= 2040){
            t1.setTextSize(18);
            params_i1.height = 400;
            t3.setTextSize(18);
            t4.setTextSize(18);
        }else if(alto > 2040 && alto <= 2560){
            t1.setTextSize(20);
            params_i1.height = 600;
            t3.setTextSize(20);
            t4.setTextSize(20);
        }
         i1.setLayoutParams(params_i1);

    }
}