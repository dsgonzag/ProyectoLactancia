package com.example.prolactancia.Controladores;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HigieneController extends FragmentPagerAdapter {
    int num_tabs;

    public HigieneController(@NonNull FragmentManager fm, int num_tabs) {
        super(fm);
        this.num_tabs = num_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new cuando();
            case 1: return new como();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return num_tabs;
    }
}
