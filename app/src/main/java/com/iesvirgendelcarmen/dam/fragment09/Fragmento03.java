package com.iesvirgendelcarmen.dam.fragment09;

import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by matinal on 26/10/2017.
 */

public class Fragmento03 extends ListFragment {
    int tipoLista = (int) (Math.random() * 3);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmento03, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        switch (tipoLista) {
            case 0:
                setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Contenido.pintores));
                break;
            case 1:
                setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Contenido.escultores));
                break;
            case 2:
                setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Contenido.arquitectos));
                break;
        }

    }
}