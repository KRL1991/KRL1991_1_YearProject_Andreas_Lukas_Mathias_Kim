package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class ChosenWall extends AppCompatActivity {

    //Written by Kim and Andreas

    EditText ChosenWallHeightEditText, ChosenWallWidthEditText;

    ImageView imageView3;

    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_wall);

        Button goToPrice = findViewById(R.id.ChosenWallButton);

        /*Spinner extras = findViewById(R.id.ChosenWallSpinner);
        String [] items = new String[] {"Vælg tilvalg","Hello","Hello2","Hello3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,items);
        extras.setAdapter(adapter);*/


        ChosenWallHeightEditText = (EditText) findViewById(R.id.ChosenWallHeightEditText);
        ChosenWallWidthEditText = (EditText) findViewById(R.id.ChosenWallWidthEditText);

        imageView3 = (ImageView) findViewById(R.id.imageView3);


        bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            String Height = bundle.getString("Height");
            String Width = bundle.getString("Width");

            setUp(name, Height, Width);
        }

        goToPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChosenWall.this, ListOfChosenItems.class);
                startActivity(intent);
            }
        });

    }

    private void setUp(String name, String Height, String Width) {
        if (name.equals("picture1")) {

            imageView3.setImageResource(R.drawable.fag1_glas4);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);


        } else if (name.equals("picture2")) {
            imageView3.setImageResource(R.drawable.fag2_glas6);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture3")) {
            imageView3.setImageResource(R.drawable.fag2_glas8);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture4")) {
            imageView3.setImageResource(R.drawable.fag3_glas12_med_enkeldor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture5")) {
            imageView3.setImageResource(R.drawable.fag4_glas16_med_doubledor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture6")) {
            imageView3.setImageResource(R.drawable.fag5_glas20_med_enkeldor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture7")) {
            imageView3.setImageResource(R.drawable.fag6_glas24_med_enkeldor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture8")) {
            imageView3.setImageResource(R.drawable.glas6_dor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture9")) {
            imageView3.setImageResource(R.drawable.doubledor_glas12);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);

        } else if (name.equals("picture10")) {
            imageView3.setImageResource(R.drawable.skydedor_6glas);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
        }
    }
}






