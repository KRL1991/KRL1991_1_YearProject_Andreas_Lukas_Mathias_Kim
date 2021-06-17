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
import model.Wall;

public class ListOfChosenItems extends AppCompatActivity { // Kim og Mathias


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);

        Button goToInfoSite = findViewById(R.id.ListOfChosenItemsButton);
        Button goToKatalog = findViewById(R.id.ListOfItemsButtonGoToCatalog);

        //Der bliver lavet et listview og dette kobles sammen med xml idet
        ListView listOfchosenItems = (ListView) findViewById(R.id.ChosenitemsListView);
        //Her laver vi en ny arraylist som tager String som parameter
        ArrayList<String> list = new ArrayList<>();

        Intent intent = getIntent();
        Wall wall = (Wall) intent.getSerializableExtra("væg");


        String wallName = wall.getWallName();
        String priceData = wall.getPrice();
        String heightData = wall.getHeight();
        String widthData = wall.getWidth();
        String acousticPanelData = wall.getAcoutsicPanel();
        String satinGlassData = wall.getSatinGlass();
        String wetRoomData = wall.getWetRoom();
        String soundGlassData = wall.getSoundGlass();
        String frameColor = wall.getFrameColor();

        for (int i = 0; i < Basket.getContent().size(); i++) {


            //Her defineres to strings som ikke indeholder noget.
            String string = "";
            String fullString = "";


            Log.d("Kim", wall.getPrice());
            Log.d("Kim", priceData);


            //Her udregnes glashøjde og glasbredde
            double heightDataDouble = Integer.parseInt(heightData);
            double widthDataDouble = Integer.parseInt(widthData);
            double glassSizeHeightInt = (heightDataDouble / 60);
            int actualGlassHeight = (int) (heightDataDouble / glassSizeHeightInt);
            double glassSizeWidthInt = (widthDataDouble / 45);
            int actualGlassWidth = (int) (widthDataDouble / glassSizeWidthInt);


            /*Her laves et stringbuilder objekt kaldet stringbuilder
              som bruger string til at "store" den string den laver.*/
            StringBuilder stringBuilder = new StringBuilder(string);

            //Her appendes alt det data som skal med ind i vores listview
            stringBuilder
                    .append("Navn: ")
                    .append(wallName + "\n")
                    .append("Højde: ")
                    .append(heightData + " cm\n")
                    .append("Bredde: ")
                    .append(widthData + " cm\n")
                    .append("Glashøjde: ")
                    .append(actualGlassHeight + " cm\n")
                    .append("Glasbredde: ")
                    .append(actualGlassWidth + " cm\n")
                    .append("Pris: ")
                    .append(priceData + " kr\n\n")
                    .append("Ekstra: \n")
                    .append("Akustikpaneler: ")
                    .append(acousticPanelData + "\n")
                    .append("Satinglas: ")
                    .append(satinGlassData + "\n")
                    .append("Vådrum: ")
                    .append(wetRoomData + "\n")
                    .append("Lydglas: ")
                    .append(soundGlassData + "\n")
                    .append("Farve: ")
                    .append(frameColor)
                    .append("\n\n");


            //her ligges stringBuilder som har alt dataen ind i fullString Stringen.
            fullString = stringBuilder.toString();

            // if (listOfchosenItems != null) {
            list.add(fullString);
            // }
            // Her skal løkken slutte.
            }


            final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
            listOfchosenItems.setAdapter(adapter);
            adapter.notifyDataSetChanged();

            goToInfoSite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ListOfChosenItems.this, InfoSite.class);
                    startActivity(intent);


                }
            });

            goToKatalog.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(ListOfChosenItems.this, Catalog.class);

                    startActivity(intent);
                }
            });
        }
    }

