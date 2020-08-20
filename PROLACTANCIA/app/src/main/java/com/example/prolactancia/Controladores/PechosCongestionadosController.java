package com.example.prolactancia.Controladores;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PechosCongestionadosController extends FragmentPagerAdapter {
    int num_tabs;

    public PechosCongestionadosController(@NonNull FragmentManager fm, int num_tabs) {
        super(fm);
        this.num_tabs = num_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new informate();
            case 1: return new aliviar_cong();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return num_tabs;
    }
}
