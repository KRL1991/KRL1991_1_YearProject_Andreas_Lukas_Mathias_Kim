package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.x1_year_project.R;

public class ListOfChosenItems extends AppCompatActivity {

    //Written by Kim
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_wall);

        Button goToInfoSite = findViewById(R.id.ListOfChosenItemsButton);

        goToInfoSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfChosenItems.this,InfoSite.class);
                startActivity(intent);
            }
        });
    }
}