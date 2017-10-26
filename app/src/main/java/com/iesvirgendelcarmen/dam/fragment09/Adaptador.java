package com.iesvirgendelcarmen.dam.fragment09;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matinal on 25/10/2017.
 */

public class Adaptador extends FragmentPagerAdapter {

    private List<Fragment> fragmentos;



        public Adaptador(FragmentManager fm, ArrayList<Fragment> fragmentos){
        super(fm);
        this.fragmentos = fragmentos;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentos.get(position);
    }

    @Override
    public int getCount() {
        return fragmentos.size();
    }
}
