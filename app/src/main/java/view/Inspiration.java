package view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.x1_year_project.R;

public class Inspiration extends AppCompatActivity {
    /*
        Written by Andreas Ravn
        Opens "inspiration" xml activity.
        being called from MainActivity button1.
         */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiration);
    }
}