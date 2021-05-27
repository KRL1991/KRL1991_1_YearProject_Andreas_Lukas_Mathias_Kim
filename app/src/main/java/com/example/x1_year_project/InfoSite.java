package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class InfoSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_site);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent=new Intent(InfoSite.this,MainActivity.class);
            startActivity(intent);
            finish();
        }
    },0);
        }
}