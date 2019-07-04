package com.ewers.app.screens;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.ewers.app.R;

public class SplashScreen extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);



        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);


                        Intent i =new Intent(SplashScreen.this,LoginScreen.class);
                        i.putExtra("value","no");
                        startActivity(i);
                        finish();


                } catch (Exception e) {
                    e.getLocalizedMessage();
                }
            }
        });
        thread.start();

    }

}