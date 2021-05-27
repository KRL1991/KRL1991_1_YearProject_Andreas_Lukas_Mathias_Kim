package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Catalog extends AppCompatActivity { //Mathias

    // ImageView image1,image2,image3,image4,image5,image6,image7,image8,iamge9,image10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);
        ImageView image1 = findViewById(R.id.fag1med4glas);
        ImageView image2 = findViewById(R.id.fag2med8glas);
        ImageView image3 = findViewById(R.id.fag2med6glas);
        ImageView image4 = findViewById(R.id.dormed6glas);
        ImageView image5 = findViewById(R.id.doubledor_glas12);
        ImageView image6 = findViewById(R.id.skydedor_glas6);
        ImageView image7 = findViewById(R.id.fag3med12glas_enkeldor);
        ImageView image8 = findViewById(R.id.fag4med16glas_doubledor);
        ImageView image9 = findViewById(R.id.fag5med20glas_enkeldor);
        ImageView image10 = findViewById(R.id.fag6med24glass_enkeldor);

    image1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Catalog.this,ChosenWall.class);
            startActivity(i);

        }
    });
    image2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(Catalog.this,ChosenWall.class);
            startActivity(i);
        }
    });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
        image10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Catalog.this,ChosenWall.class);
                startActivity(i);
            }
        });
    }
}

