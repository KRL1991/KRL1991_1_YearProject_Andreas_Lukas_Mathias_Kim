package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    int acousticPrice = 318;
    int satinGlassPrice = 70;
    int wetRoom = 480;
    int soundGlass = 95;


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

        //antalAkustikpaneler.setText("");

        Wall updatedWallPrice = new Wall();

        for (int i = 0; i < Basket.getContent().size(); i++) {
            extraPrice.setText(Basket.getContent().get(i).getPrice());
            updatedWallPrice.setPrice(Basket.getContent().get(i).getPrice());
        }


        Spinner extras = findViewById(R.id.spinnerExtra);
        String [] items = new String[] {"Vælg tilvalg","Rød","Sort","Messing"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item,items);
        adapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        extras.setAdapter(adapter);

        Button ExtraButtonUpdatePrice = findViewById(R.id.ExtraButtonUpdatePrice);

        ExtraButtonUpdatePrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Mathias", updatedWallPrice.getPrice());
                String price = updatedWallPrice.getPrice();
                int priceBeforeExtra = Integer.parseInt(price);

                String numberOfPanels = antalAkustikpaneler.getText().toString();
                if (numberOfPanels.equals("")) {
                    numberOfPanels = "0";
                    Log.d("Mathias1", "Akustikpaneler bliver sat til 0");
                }

                String numberOfSatinGlass = antalSatinglas.getText().toString();
                if (numberOfSatinGlass.equals("")) {
                    numberOfSatinGlass = "0";
                    Log.d("Mathias1", "Satinglass bliver sat til 0");
                }

                String numberOfWetRoom = antalVådrum.getText().toString();
                if (numberOfWetRoom.equals("")){
                    numberOfWetRoom = "0";
                    Log.d("Mathias1", " Wetroom bliver sat til 0");
                }

                String numberOfSoundGlass = antalLydglas.getText().toString();
                if (numberOfSoundGlass.equals("")){
                    numberOfSoundGlass = "0";
                    Log.d("Mathias1", "Soundglass bliver sat til 0");
                }

                int numberOfPanelsInt = Integer.parseInt(numberOfPanels);
                int costOfPanels = numberOfPanelsInt * 318;

                int numberOfSatinGlassInt = Integer.parseInt(numberOfSatinGlass);
                int costOfSatinGlass = numberOfSatinGlassInt * 70;

                int numberOfWetRoomInt = Integer.parseInt(numberOfWetRoom);
                int costOfWetRoom = numberOfWetRoomInt * 480;

                int numberOfSoundGlassInt = Integer.parseInt(numberOfSoundGlass);
                int costOfSoundGlass = numberOfSoundGlassInt * 95;

                int totalCost = priceBeforeExtra + costOfPanels + costOfSatinGlass +costOfWetRoom + costOfSoundGlass;

                String frameColor = extras.getSelectedItem().toString();



                for (int i = 0; i < Basket.getContent().size(); i++) {
                   Basket.getContent().get(i).setPrice((totalCost) + " kr");
                   Basket.getContent().get(i).setAcoutsicPanel(String.valueOf(numberOfPanelsInt));
                   Basket.getContent().get(i).setSatinGlass(String.valueOf(numberOfSatinGlassInt));
                   Basket.getContent().get(i).setWetRoom(String.valueOf(numberOfWetRoomInt));
                   Basket.getContent().get(i).setSoundGlass(String.valueOf(numberOfSoundGlassInt));
                   Basket.getContent().get(i).setFrameColor(frameColor);


                }

                extraPrice.setText((totalCost) + " kr");

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