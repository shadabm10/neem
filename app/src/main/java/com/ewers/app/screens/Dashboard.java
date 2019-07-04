package com.ewers.app.screens;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ewers.app.R;
import com.ewers.app.adapters.Rv_form_Adapter;

import java.util.ArrayList;
import java.util.List;

import modal.Album;

public class Dashboard extends AppCompatActivity {

    RecyclerView rv_form;
    Rv_form_Adapter adapter;

    List<Album> albums_arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        rv_form = findViewById(R.id.rv_form);

        albums_arr = new ArrayList<>();
        albums_arr.add(new Album("Incident Form",1));
        albums_arr.add(new Album("Radicalisation Form",2));
        albums_arr.add(new Album("Sexual Violence Form",3));
        albums_arr.add(new Album("Radicalisation Form",4));
        albums_arr.add(new Album("Incident Form",5));


        GridLayoutManager mLayoutManager = new GridLayoutManager(this, 3);
        rv_form.setLayoutManager(mLayoutManager);
        adapter = new Rv_form_Adapter(Dashboard.this,albums_arr);
        rv_form.setAdapter(adapter);



    }
}