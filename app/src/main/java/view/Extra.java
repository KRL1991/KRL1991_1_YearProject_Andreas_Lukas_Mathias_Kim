package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.x1_year_project.R;

import model.Basket;
import model.Wall;

public class Extra extends AppCompatActivity {


// Mathias og Kim
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);


        Button goToBasket = findViewById(R.id.ExtraButton);
        TextView extraPrice = findViewById(R.id.ExtraPriceTextView);
        EditText antalAkustikpaneler = findViewById(R.id.ExtraEditTextAkustikpanel);
        EditText antalSatinglas = findViewById(R.id.ExtraEditTextSatinglas);
        EditText antalVådrum = findViewById(R.id.ExtraEditTextVådrum);
        EditText antalLydglas = findViewById(R.id.ExtraEditTextLydglas);

        Basket opdateretBasket = new Basket();
        Wall opdateretWall = new Wall();

        for (int i = 0; i < Basket.getContent().size(); i++) {
            extraPrice.setText(Basket.getContent().get(i).getPrice());
        }


        Spinner extras = findViewById(R.id.spinnerExtra);
        String [] items = new String[] {"Vælg tilvalg","Rød","Sort","Messing"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item,items);
        adapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        extras.setAdapter(adapter);



        Button ExtraButtonUpdateMap = findViewById(R.id.ExtraButtonUpdateMap);
        ExtraButtonUpdateMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


        goToBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extra.this,ListOfChosenItems.class);



                startActivity(intent);
            }
        });
    }
}