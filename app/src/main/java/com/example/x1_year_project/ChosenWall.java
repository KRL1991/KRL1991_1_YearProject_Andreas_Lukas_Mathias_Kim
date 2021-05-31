package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChosenWall extends AppCompatActivity {

    //Written by Kim and Andreas

    ImageView imageView3;

    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_wall);

        Button goToPrice = findViewById(R.id.ChosenWallButton);

        imageView3 = (ImageView) findViewById(R.id.imageView3);

        bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            setUp(name);
        }

        goToPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChosenWall.this, ListOfChosenItems.class);
                startActivity(intent);
            }
        });

    }

    private void setUp(String name) {
        if (name.equals("picture1")) {

            imageView3.setImageResource(R.drawable.fag1_glas4);

        } else if (name.equals("picture2")) {
            imageView3.setImageResource(R.drawable.fag2_glas6);

        } else if (name.equals("picture3")) {
            imageView3.setImageResource(R.drawable.fag2_glas8);

        } else if (name.equals("picture4")) {
            imageView3.setImageResource(R.drawable.fag3_glas12_med_enkeldor);

        } else if (name.equals("picture5")) {
            imageView3.setImageResource(R.drawable.fag4_glas16_med_doubledor);

        } else if (name.equals("picture6")) {
            imageView3.setImageResource(R.drawable.fag5_glas20_med_enkeldor);

        } else if (name.equals("picture7")) {
            imageView3.setImageResource(R.drawable.fag6_glas24_med_enkeldor);

        } else if (name.equals("picture8")) {
            imageView3.setImageResource(R.drawable.glas6_dor);

        } else if (name.equals("picture9")) {
            imageView3.setImageResource(R.drawable.doubledor_glas12);

        } else if (name.equals("picture10")) {
            imageView3.setImageResource(R.drawable.skydedor_6glas);

        }
    }
}






