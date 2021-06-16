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
        setContentView(R.layout.activity_basket);

        Button goToInfoSite = findViewById(R.id.ListOfChosenItemsButton);
        Button goToKatalog = findViewById(R.id.ListOfItemsButtonGoToCatalog);

        ListView listOfchosenItems = (ListView) findViewById(R.id.ChosenitemsListView);
        ArrayList<String> list = new ArrayList<>();




//Løkke startes - basket arrayliste løbes igennem og returnere kurven. tjekker hvor mange elementer der er i (size).
        for (int i = 0; i <Basket.getContent().size() ; i++) {
            Log.d("Kim", Basket.getContent().get(i).getWallName());

            String string = "";
            String fullString = "";
            String wallName = Basket.getContent().get(i).getWallName();
            String priceData = Basket.getContent().get(i).getPrice();
            String heightData = Basket.getContent().get(i).getHeight();
            String widthData = Basket.getContent().get(i).getWidth();
            String acousticPanelData = Basket.getContent().get(i).getAcoutsicPanel();
            String satinGlassData = Basket.getContent().get(i).getSatinGlass();
            String wetRoomData = Basket.getContent().get(i).getWetRoom();
            String soundGlassData = Basket.getContent().get(i).getSoundGlass();
            double heightDataDouble = Integer.parseInt(heightData);
            double widthDataDouble = Integer.parseInt(widthData);
            double glassSizeHeightInt = (heightDataDouble/60);
            int actualGlassHeight = (int) (heightDataDouble/glassSizeHeightInt);
            double glassSizeWidthInt = (widthDataDouble/45);
            int actualGlassWidth = (int) (widthDataDouble/glassSizeWidthInt);


            StringBuilder stringBuilder = new StringBuilder(string);

            stringBuilder.append(wallName).append("")

                    .append(", højde ")
                    .append(heightData)
                    .append(" cm , bredde ")
                    .append(widthData).append(" cm , ")
                    .append(" glashøjde ")
                    .append(actualGlassHeight)
                    .append(", glasbredde ")
                    .append(actualGlassWidth)
                    .append(" , pris: ")
                    .append(priceData)
                    .append(" , akustikpaneler: ")
                    .append(acousticPanelData)
                    .append(" , satinglas: ")
                    .append(satinGlassData)
                    .append(" , vådrum: ")
                    .append(wetRoomData)
                    .append(" , lydglas: ")
                    .append(soundGlassData);



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
