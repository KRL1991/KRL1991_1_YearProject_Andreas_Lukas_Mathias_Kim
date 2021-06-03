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

public class Extra extends AppCompatActivity {


// Mathias og Kim
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        // A new bundle which gets the data from listData bundle.
        Bundle listDataExtra = getIntent().getExtras();
        String heightData = listDataExtra.getString("height");
        String widthData = listDataExtra.getString("width");
        String priceData = listDataExtra.getString("price");
        String wallName = listDataExtra.getString("WallName");

        Button goToBasket = findViewById(R.id.ExtraButton);
        TextView extraPrice = findViewById(R.id.ExtraPriceTextView);

        String extraPriceData;
        extraPriceData = priceData;
        extraPrice.setText(extraPriceData);



        Spinner extras = findViewById(R.id.spinnerExtra);
        String [] items = new String[] {"Vælg tilvalg","Rød","Sort","Messing"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item,items);
        adapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        extras.setAdapter(adapter);


        goToBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extra.this,ListOfChosenItems.class);

                // The intent combines the Strings and the keys.
                intent.putExtra("height",heightData);
                intent.putExtra("width", widthData);
                intent.putExtra("price", priceData);
                intent.putExtra("WallName",wallName);

                startActivity(intent);
            }
        });
    }
}