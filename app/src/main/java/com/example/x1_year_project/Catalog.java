package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Catalog extends AppCompatActivity implements View.OnClickListener {

    // Written by Andreas

    ImageView  skydedor_6glas,doubledor_glas12,fag1_glas4,fag2_glas6,fag2_glas8,
            fag3_glas12_med_enkledor,fag4_glas16_med_doubledor,fag5_glas20_med_enkledor,
            fag6_glas24_med_enkledor,glas6_dor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_katalog);


        fag1_glas4 = (ImageView) findViewById(R.id.fag1med4glas);
        fag2_glas6 = (ImageView) findViewById(R.id.fag2med6glas);
        fag2_glas8 = (ImageView) findViewById(R.id.fag2med8glas);
        fag3_glas12_med_enkledor = (ImageView) findViewById(R.id.fag3med12glas_enkeldor);
        fag4_glas16_med_doubledor = (ImageView) findViewById(R.id.fag4med16glas_doubledor);
        fag5_glas20_med_enkledor = (ImageView) findViewById(R.id.fag5med20glas_enkeldor);
        fag6_glas24_med_enkledor = (ImageView) findViewById(R.id.fag6med24glass_enkeldor);
        glas6_dor = (ImageView) findViewById(R.id.dormed6glas);
        doubledor_glas12 = (ImageView) findViewById(R.id.doubledor_glas12);
        skydedor_6glas = (ImageView) findViewById(R.id.skydedor_glas6);

        fag1_glas4.setOnClickListener(this);
        fag2_glas6.setOnClickListener(this);
        fag2_glas8.setOnClickListener(this);
        fag3_glas12_med_enkledor.setOnClickListener(this);
        fag4_glas16_med_doubledor.setOnClickListener(this);
        fag5_glas20_med_enkledor.setOnClickListener(this);
        fag6_glas24_med_enkledor.setOnClickListener(this);
        glas6_dor.setOnClickListener(this);
        doubledor_glas12.setOnClickListener(this);
        skydedor_6glas.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {
        Intent ChosenWall = new Intent(Catalog.this, ChosenWall.class);

        switch (view.getId()) {

            case R.id.fag1med4glas:
                ChosenWall.putExtra("name", "picture1");
                ChosenWall.putExtra("Width", "60");
                ChosenWall.putExtra("Height", "240");

                startActivity(ChosenWall);
                break;

            case R.id.fag2med8glas:
                ChosenWall.putExtra("name", "picture3");
                ChosenWall.putExtra("Width", "100");
                ChosenWall.putExtra("Height", "240");

                startActivity(ChosenWall);

                break;

            case R.id.fag2med6glas:
                ChosenWall.putExtra("name", "picture2");
                ChosenWall.putExtra("Width", "100");
                ChosenWall.putExtra("Height", "220");


                startActivity(ChosenWall);
                break;

            case R.id.dormed6glas:
                ChosenWall.putExtra("name", "picture8");
                ChosenWall.putExtra("Width", "100");
                ChosenWall.putExtra("Height", "220");

                startActivity(ChosenWall);
                break;

            case R.id.doubledor_glas12:
                ChosenWall.putExtra("name", "picture9");
                ChosenWall.putExtra("Width", "200");
                ChosenWall.putExtra("Height", "220");

                startActivity(ChosenWall);
                break;

            case R.id.skydedor_glas6:
                ChosenWall.putExtra("name", "picture10");
                ChosenWall.putExtra("Width", "100");
                ChosenWall.putExtra("Height", "220");

                startActivity(ChosenWall);
                break;

            case R.id.fag3med12glas_enkeldor:
                ChosenWall.putExtra("name", "picture4");
                ChosenWall.putExtra("Width", "150");
                ChosenWall.putExtra("Height", "240");

                startActivity(ChosenWall);
                break;
            case R.id.fag4med16glas_doubledor:
                ChosenWall.putExtra("name", "picture5");
                ChosenWall.putExtra("Width", "200");
                ChosenWall.putExtra("Height", "240");

                startActivity(ChosenWall);
                break;
            case R.id.fag5med20glas_enkeldor:
                ChosenWall.putExtra("name", "picture6");
                ChosenWall.putExtra("Width", "300");
                ChosenWall.putExtra("Height", "240");

                startActivity(ChosenWall);
                break;
            case R.id.fag6med24glass_enkeldor:
                ChosenWall.putExtra("name", "picture7");
                ChosenWall.putExtra("Width", "360");
                ChosenWall.putExtra("Height", "240");

                startActivity(ChosenWall);
                break;


        }
    }
}

