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


    // Mathias, Kim og Lukas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);

        //Variabler som indeholder id på textview og edittext felterne
        Button goToBasket = findViewById(R.id.ExtraButton);
        TextView extraPrice = findViewById(R.id.ExtraPriceTextView);
        EditText antalAkustikpaneler = findViewById(R.id.ExtraEditTextAkustikpanel);
        EditText antalSatinglas = findViewById(R.id.ExtraEditTextSatinglas);
        EditText antalVådrum = findViewById(R.id.ExtraEditTextVådrum);
        EditText antalLydglas = findViewById(R.id.ExtraEditTextLydglas);
        Button ExtraButtonUpdatePrice = findViewById(R.id.ExtraButtonUpdatePrice);

        //Ny instans af Wall klassen.
        Wall updatedWallPrice = new Wall();

        //Fori loop som opdatere extraPrice Textviewet og opdatere prisen inde i Arraylistet Som ligger inde i Basket klassen
       for (int i = 0; i < Basket.getContent().size(); i++) {
            extraPrice.setText(Basket.getContent().get(i).getPrice());
            updatedWallPrice.setPrice(Basket.getContent().get(i).getPrice());
        }

        /*Her laver vi en spinner som indeholder et arrayet som hedder items
               vi forbinder spinneren og arrayet ved hjælp af adapteren.
               SetDropDownViewResource skifter udseendet på spinneren når er åben.*/
        Spinner extras = findViewById(R.id.spinnerExtra);
        String [] items = new String[] {"Vælg tilvalg","Rød","Sort","Messing"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.spinner_item,items);
        adapter.setDropDownViewResource(R.layout.spinner_item_dropdown);
        extras.setAdapter(adapter);


        /*Vi har sat en OnClickListener på ExtraButtonUpdatePrice, hvilket betyder når
        * knappen bliver trykket på ville alt koden som står i onClick blive kørt. */
        ExtraButtonUpdatePrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Jeg bruger Log.d for at finde ud af hvad der er inde iupdatedWallPrice
                Log.d("Mathias", updatedWallPrice.getPrice());
                String price = updatedWallPrice.getPrice();
                int priceBeforeExtra = Integer.parseInt(price);

                /* hvis brugeren ikke skriver noget i akustikplanelet tekst feltet
                   så bliver dataen ændret til 0 */
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

                //Prisen af tilægene bliver udregnet
                int numberOfPanelsInt = Integer.parseInt(numberOfPanels);
                int costOfPanels = numberOfPanelsInt * 318;


                int numberOfSatinGlassInt = Integer.parseInt(numberOfSatinGlass);
                int costOfSatinGlass = numberOfSatinGlassInt * 70;

                int numberOfWetRoomInt = Integer.parseInt(numberOfWetRoom);
                int costOfWetRoom = numberOfWetRoomInt * 480;

                int numberOfSoundGlassInt = Integer.parseInt(numberOfSoundGlass);
                int costOfSoundGlass = numberOfSoundGlassInt * 95;

                // Alle tillæg og væggens pris bliver lagt sammen
                int totalCost = priceBeforeExtra + costOfPanels + costOfSatinGlass +costOfWetRoom + costOfSoundGlass;

                String frameColor = extras.getSelectedItem().toString();


                // Den valgte væg får opdateret tilføjet de valgte tillæg
                for (int i = 0; i < Basket.getContent().size(); i++) {
                   Basket.getContent().get(i).setPrice((totalCost) + " kr");
                   Basket.getContent().get(i).setAcoutsicPanel(String.valueOf(numberOfPanelsInt));
                   Basket.getContent().get(i).setSatinGlass(String.valueOf(numberOfSatinGlassInt));
                   Basket.getContent().get(i).setWetRoom(String.valueOf(numberOfWetRoomInt));
                   Basket.getContent().get(i).setSoundGlass(String.valueOf(numberOfSoundGlassInt));

                   Basket.getContent().get(i).setFrameColor(frameColor);


                }
                //Viser den nye pris
                extraPrice.setText((totalCost) + " kr");

            }
        });

        // tager os videre til den næste activity
        goToBasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Extra.this,ListOfChosenItems.class);



                startActivity(intent);
            }
        });
    }
}