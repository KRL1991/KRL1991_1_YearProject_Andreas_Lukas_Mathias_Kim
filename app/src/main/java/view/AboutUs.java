package view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.x1_year_project.R;

public class AboutUs extends AppCompatActivity {
    /*
    Written by Andreas Ravn
    Opens "om os" xml activity.
    being called from MainActivity button2.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
    }
}