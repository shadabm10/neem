package com.ewers.app.screens;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ewers.app.R;

import java.util.Objects;

public class DashboardSuccess extends AppCompatActivity {
    LinearLayout ll_menu_detail;
    TextView text_top, text_main, text_bottom, tv_progress_no;
    View menu_layout, progress_layout, view1, view2, view3, view4, view5;
    ImageView iv_back_to_dashboard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_success);


        initialisation();
        function();


    }


    private void initialisation() {
        menu_layout = findViewById(R.id.menu_layout);
        ll_menu_detail = menu_layout.findViewById(R.id.ll_menu_detail);
        text_top = menu_layout.findViewById(R.id.text_top);
        text_main = menu_layout.findViewById(R.id.text_main);
        text_bottom = menu_layout.findViewById(R.id.text_bottom);

        progress_layout = findViewById(R.id.progress_layout);
        view1 = progress_layout.findViewById(R.id.view1);
        view2 = progress_layout.findViewById(R.id.view2);
        view3 = progress_layout.findViewById(R.id.view3);
        view4 = progress_layout.findViewById(R.id.view4);
        view5 = progress_layout.findViewById(R.id.view5);
        tv_progress_no = progress_layout.findViewById(R.id.tv_progress_no);


        iv_back_to_dashboard = findViewById(R.id.iv_back_to_dashboard);




    }

    private void function() {
        ll_menu_detail.setVisibility(View.GONE);
        text_top.setText("FORM");
        text_main.setText(getIntent().getStringExtra("name"));
        text_bottom.setText("January 16,2019 | 7:00 AM");

        view1.setVisibility(View.VISIBLE);
        view2.setVisibility(View.VISIBLE);
        view3.setVisibility(View.VISIBLE);
        view4.setVisibility(View.VISIBLE);
        view5.setVisibility(View.VISIBLE);
        tv_progress_no.setText("5/5");


        iv_back_to_dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardSuccess.this, Dashboard.class);
                startActivity(intent);
            }
        });





    }




}
