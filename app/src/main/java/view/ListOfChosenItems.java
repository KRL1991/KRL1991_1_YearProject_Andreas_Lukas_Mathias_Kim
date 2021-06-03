package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.x1_year_project.R;

import java.util.ArrayList;

import model.Basket;

public class ListOfChosenItems extends AppCompatActivity {

    //Written by Kim
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price_wall);

        Button goToInfoSite = findViewById(R.id.ListOfChosenItemsButton);
        Button goToKatalog = findViewById(R.id.ListOfItemsButtonGoToCatalog);

        ListView listOfchosenItems = (ListView) findViewById(R.id.ChosenitemsListView);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <Basket.content.size() ; i++) {
            Log.d("Kim", Basket.content.get(i).getWallName());
            Bundle listdata = getIntent().getExtras();

            String string = "";
            String fullString = "";
            String heightData = listdata.getString("height");
            String widthData = listdata.getString("width");
            String priceData = listdata.getString("price");
            String wallName = listdata.getString("WallName");

            StringBuilder stringBuilder = new StringBuilder(string);

            stringBuilder.append(wallName).append(", ").append(priceData).append(", højde ").append(heightData).append(" cm , bredde ").append(widthData).append(" cm ,");
            fullString = stringBuilder.toString();

            if (listOfchosenItems != null) {
                list.add(fullString);
            }
            // Her skal løkken slutte.
        }




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

        goToKatalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListOfChosenItems.this,Catalog.class);
                startActivity(intent);
            }
        });
    }
}
