package com.packages.prolactancia.Controladores;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class EstimulacionExtraccionController extends FragmentPagerAdapter {
    int num_tabs;

    public EstimulacionExtraccionController(@NonNull FragmentManager fm, int num_tabs) {
        super(fm);
        this.num_tabs = num_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new extraccion_manual();
            case 1: return new seis_pasos();
            case 2: return new extractor_leche();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return num_tabs;
    }
}