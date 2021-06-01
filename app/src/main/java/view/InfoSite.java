package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.x1_year_project.R;

public class InfoSite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_site);

        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
        //create a list of items for the spinner.
        String[] items = new String[]{"XL-Byg", "Bygma", "Stark"};
        //create an adapter to describe how the items are displayed, adapters are used in several places in android.
        //There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item, items);
        adapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        //set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);





    Button btn = (Button) findViewById(R.id.ChosenWallButton);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){
        Intent i = new Intent(InfoSite.this, Confirmation.class);
        startActivity(i);
    }
    });
}
}