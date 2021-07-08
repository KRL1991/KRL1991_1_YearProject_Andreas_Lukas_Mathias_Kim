package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;




import com.example.x1_year_project.R;

import java.util.ArrayList;
import java.util.List;

import model.Basket;
import model.EmailContent;
import model.SendEmail;

public class InfoSite extends AppCompatActivity {

    EditText navn, telefon, userEmail, kommentar;

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

        //Variabler som indeholder id på edittext felterne
        navn = findViewById(R.id.editTextTextPersonName);
        telefon = findViewById(R.id.editTextPhone);
        userEmail = findViewById(R.id.editTextTextEmailAddress);
        kommentar = findViewById(R.id.editTextTextMultiLine);

        // Arrayliste som indeholder email data (strings)
        ArrayList<String> emailContent = new ArrayList<>();

         //Her laves en knap med tilhørende ID
        Button btn = (Button) findViewById(R.id.ChosenWallButton);


        //Knap med onClickListner. Koden som står i denne metode vil blive kørt når knappen trykkes på.
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){

                // Her hentes data fra edittextfelterne og de gemmes i strings.
                String name = navn.getText().toString();
                String telephone = telefon.getText().toString();
                String customerEmail = userEmail.getText().toString();
                String comments= kommentar.getText().toString();

               //Her defineres to strings som ikke indeholder noget.
              // Stringbuilderen appender alle appends ned i den tomme string.
                String emptyString = "";
                String fullString = "";

                //Her laves et stringbuilder objekt kaldet email
               // som bruger empty string til at "store" den string den laver.
                StringBuilder email = new StringBuilder(emptyString);

                // Her appendes data fra de konstruerede strings.
                email
                        .append("Navn: " +name +  "\n")
                        .append("Telefon: "+ telephone + "\n")
                        .append("Email: " +customerEmail +"\n")
                        .append("Kommentar: " +comments+ "\n\n");

                //Her er et forloop som går igennem vores Basket(klasse).content(array)
               // og henter data fra vores Basket ,som indeholder et array, som har type Wall.

            for (int i = 0; i < Basket.getContent().size() ; i++) {

                //Her logges om denne handling rent faktisk sker -
                // dette kan man se ved hjælp af Logcat terminalen.
                Log.d("Kim", Basket.getContent().get(i).getWallName());

                //Her hentes data fra content arraylisten.
                String wallName = Basket.getContent().get(i).getWallName();
                String priceData = Basket.getContent().get(i).getPrice();
                String heightData = Basket.getContent().get(i).getHeight();
                String widthData = Basket.getContent().get(i).getWidth();
                String acousticPanel = Basket.getContent().get(i).getAcoutsicPanel();
                String satinGlass = Basket.getContent().get(i).getSatinGlass();
                String wetRoom = Basket.getContent().get(i).getWetRoom();
                String soundGlass = Basket.getContent().get(i).getSoundGlass();
                String frameColor = Basket.getContent().get(i).getFrameColor();

                        //Her appendes dataen som er blevet hentet fra arrayet.
                        email
                                .append("Navn: " + wallName + "\n")
                                .append("Pris: " + priceData + " kr" + "\n")
                                .append("Højde: " + heightData + " cm" + "\n")
                                .append("Bredde: " + widthData + " cm" + "\n\n")
                                .append("Ekstra:\n")
                                .append(" Antal Akustikpaneler: "+acousticPanel +"\n")
                                .append(" Antal Satin glas: "+satinGlass +"\n")
                                .append(" Antal Vådrumspaneler: "+ wetRoom +"\n")
                                .append(" Antal Lydglas: "+ soundGlass+"\n")
                                .append(" Farve på ramme: "+ frameColor+"\n")
                                .append("\n\n");

                // Her laves fyldes den tomme string kaldet fullString
                // med al dataen fra Stringbuilderen som hedder email.
                //Herefter tilføjges fullString til emailcontent-arrayet.
                fullString = email.toString();
                emailContent.add(fullString);
            }

            // Her laves en ny intent som sender brugeren til en af telefonens indbyggede email funktioner.
            // EXTRA_EMAIL indeholder den email adresse som indeholdet skal sendes til.
            //intent.setType definere at det er: Multipurpose Internet Mail Extensions (MIME) der skal bruges.
            //intent.setData Uniform Resource Identifier (Uri) definere at der er tale om en email.
            //intent.putExtra(Intent.EXTRA_SUBJECT sætter emnet i emailen.
            //intent.putExtra(Intent.EXTRA_TEXT definere hvad der skal være i teksten af emailen.
            // startActivity(Intent.createChooser(intent,"Send Email")) Denne intent åbner for valg af email.
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{("")});
            intent.setType("message/rfc822");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra(Intent.EXTRA_SUBJECT, "Forespørgsel på New-Yorker væg");
            intent.putExtra(Intent.EXTRA_TEXT, fullString);
            startActivity(Intent.createChooser(intent,"Send Email"));

    }


        });

}
}
