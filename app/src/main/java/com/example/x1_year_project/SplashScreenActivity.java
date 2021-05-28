package com.example.x1_year_project;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

// written by Kim
public class SplashScreenActivity extends AppCompatActivity {

    //Handler creates a new thread which handles this function.
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

// A new thread is created and is set to manage postDelay.
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Here a new Intent is created which takes ud from splashscreen to MainActivity.
                // Finnish is added to make sure that you cant use the back button on the phone
                // to return to the splashscreen.
                Intent intent=new Intent(SplashScreenActivity.this, StartScreen.class);
                startActivity(intent);
                finish();
            }
            //This controls the time of the splashscreen.
        },3000);
    }
}