package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.x1_year_project.R;


public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        /*
        Written by Andreas Ravn
           Starts by making the Button connect with the id of button "Katalog" which is btncatalog.
           Then makes it so when clicked upon it connects with "Catalog.java" which opens the xml-file.
           Intent is used to go to a new Activity.
           All 3 areas is doing the same just for 3 different buttons.
        */

    Button button = (Button) findViewById(R.id.btncatalog);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(StartScreen.this, Catalog.class));
        }
    });

    Button button1 = (Button) findViewById(R.id.btninspiration);
    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
          startActivity(new Intent(StartScreen.this, Inspiration.class));
        }
    });

    Button button2 = (Button) findViewById(R.id.btnaboutus);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(StartScreen.this, AboutUs.class));
        }
    });

    Button button3 = (Button) findViewById(R.id.btnContactUs);
    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(StartScreen.this,ContactUS.class));
        }
    });

    }
}
/*
- Andreas Ravn
Alternetive code:
    public void onClick(View v) {
            Intent intent = new Intent (MainActivity.this, Button.class));
            startActivity(intent);
        }
    });
 */
