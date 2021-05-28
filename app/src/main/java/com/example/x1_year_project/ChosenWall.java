package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChosenWall extends AppCompatActivity {

    //Written by Kim
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_wall);

        Button goToPrice = findViewById(R.id.InfoSite);

        goToPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChosenWall.this,PriceWall.class);
                startActivity(intent);
            }
        });
    }
}