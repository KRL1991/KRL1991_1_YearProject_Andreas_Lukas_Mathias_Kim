package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.x1_year_project.R;

import model.Basket;
import model.EmailContent;

public class Confirmation extends AppCompatActivity {//Kim

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Button goHome = findViewById(R.id.ConfirmationButton);


        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Confirmation.this, StartScreen.class);
                startActivity(intent);

                Basket.getContent().clear();
                EmailContent.getContent().clear();



            }
        });
    }
}