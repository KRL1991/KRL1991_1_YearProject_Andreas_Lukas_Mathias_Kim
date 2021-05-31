package com.example.x1_year_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InfoSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_site);



    Button btn = (Button) findViewById(R.id.ChosenWallButton);

        btn.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        Intent i = new Intent(InfoSite.this, Confirmation.class);
        startActivity(i);
    }
    });
}
}