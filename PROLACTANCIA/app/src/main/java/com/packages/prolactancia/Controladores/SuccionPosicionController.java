package com.packages.prolactancia.Controladores;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SuccionPosicionController extends FragmentPagerAdapter {
    int num_tabs;

    public SuccionPosicionController(@NonNull FragmentManager fm, int num_tabs) {
        super(fm);
        this.num_tabs = num_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new agarre_sp();
            case 1: return new forma_sp();
            case 2: return new cesarea_sp();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return num_tabs;
    }
}
