package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.x1_year_project.R;

import java.util.ArrayList;

public class ListOfChosenItems extends AppCompatActivity {

    //Written by Kim
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_wall);

        Button goToInfoSite = findViewById(R.id.ListOfChosenItemsButton);

        ListView listOfchosenItems = (ListView) findViewById(R.id.ChosenitemsListView);
        ArrayList<String> list = new ArrayList<>();
        Bundle listdata = getIntent().getExtras();

        String string ="";
        String fullString = "";
        String heightData = listdata.getString("height");
        String widthData = listdata.getString("width");
        String priceData = listdata.getString("price");

        StringBuilder stringBuilder = new StringBuilder(string);

        stringBuilder.append(priceData).append(", højde ").append(heightData).append(" cm , bredde ").append(widthData).append(" cm ,");
        fullString = stringBuilder.toString();

        list.add(fullString);





        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list);
        listOfchosenItems.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        goToInfoSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfChosenItems.this,InfoSite.class);
                startActivity(intent);
            }
        });
    }
}