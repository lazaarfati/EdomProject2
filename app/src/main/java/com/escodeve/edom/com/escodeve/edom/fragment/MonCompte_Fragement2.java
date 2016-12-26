package com.escodeve.edom.com.escodeve.edom.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

import com.escodeve.edom.R;
import com.escodeve.edom.com.escodeve.edom.adapter.CustomGridViewAdapter;


public class MonCompte_Fragement2  extends Fragment {
public MonCompte_Fragement2(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.moncompte_fragment2, container, false);

        return rootView;
    }
}
