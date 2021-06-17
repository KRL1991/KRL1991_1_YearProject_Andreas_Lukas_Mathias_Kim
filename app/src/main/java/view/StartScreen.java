package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.x1_year_project.R;


public class StartScreen extends AppCompatActivity { // Andreas og Kim

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

     /* Her laver vi en knap som har id'et btncatalog som vil føre os hen til kataloget.
       Vi sætter en OnClickListener på knappen hvilket vil sige at når knappen bliver
       trykket vil koden i onClick metoden blive kørt*/
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

/* Man kan også skrive intent på denne måde
- Andreas Ravn
Alternetive code:
    public void onClick(View v) {
            Intent intent = new Intent (MainActivity.this, Button.class));
            startActivity(intent);
        }
    });
 */
