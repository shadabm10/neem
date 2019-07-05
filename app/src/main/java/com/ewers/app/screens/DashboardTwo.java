package com.ewers.app.screens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ewers.app.R;

public class DashboardTwo extends AppCompatActivity {
    LinearLayout ll_menu_detail;
    TextView text_top, text_main, text_bottom, tv_progress_no, tv_prev, tv_next;
    View menu_layout, progress_layout, view1, view2, view3, view4, view5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_two);


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


        tv_prev = findViewById(R.id.tv_prev);
        tv_next = findViewById(R.id.tv_next);

    }

    private void function() {
        ll_menu_detail.setVisibility(View.GONE);
        text_top.setText("FORM");
        text_main.setText(getIntent().getStringExtra("name"));
        text_bottom.setText("January 16,2019 | 7:00 AM");

        view1.setVisibility(View.VISIBLE);
        view2.setVisibility(View.VISIBLE);
        view3.setVisibility(View.GONE);
        view4.setVisibility(View.GONE);
        view5.setVisibility(View.GONE);
        tv_progress_no.setText("2/5");

        tv_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardTwo.this, DashboardThree.class);
                intent.putExtra("name",getIntent().getStringExtra("name"));
                startActivity(intent);
            }
        });



    }


}
