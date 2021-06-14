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

        navn = findViewById(R.id.editTextTextPersonName);
        telefon = findViewById(R.id.editTextPhone);
        userEmail = findViewById(R.id.editTextTextEmailAddress);
        kommentar = findViewById(R.id.editTextTextMultiLine);

        ArrayList<String> emailContent = new ArrayList<>();

        Button btn = (Button) findViewById(R.id.ChosenWallButton);

        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v){

         //  Intent i = new Intent(InfoSite.this, Confirmation.class);

                String name = navn.getText().toString();
                String telephone = telefon.getText().toString();
                String customerEmail = userEmail.getText().toString();
                String comments= kommentar.getText().toString();

                for (int i1 = 0; i1 < Basket.getContent().size() ; i1++) {
                    Log.d("Kim", Basket.getContent().get(i1).getWallName());
                    String wallName = Basket.getContent().get(i1).getWallName();
                    String priceData = Basket.getContent().get(i1).getPrice();
                    String heightData = Basket.getContent().get(i1).getHeight();
                    String widthData = Basket.getContent().get(i1).getWidth();

                 /*   EmailContent emailContent1 = new EmailContent();
                    emailContent1.setNavn(navn.getText().toString());
                    emailContent1.setTelefonnummer(telefon.getText().toString());
                    emailContent1.setKommentar(kommentar.getText().toString());
                    EmailContent.getContent().add(emailContent1);*/


                String emptyString = "";
                String fullString = "";
                StringBuilder email = new StringBuilder(emptyString);

                email
                        .append("Navn: " +name +  "\n")
                        .append("Telefon: "+ telephone + "\n")
                        .append("Email: " +customerEmail +"\n")
                        .append("Kommentar: " +comments+ "\n\n")
                        .append(wallName)
                        .append(", ")
                        .append(priceData)
                        .append(", ")
                        .append(heightData)
                        .append(" cm, ")
                        .append(widthData)
                        .append(" cm");

                fullString = email.toString();
                emailContent.add(fullString);

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{("kimx4706@edu.easj.dk")});
                intent.setType("message/rfc822");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Forespørgsel på New-Yorker væg");
                intent.putExtra(Intent.EXTRA_TEXT, emailContent.get(i1));
                startActivity(Intent.createChooser(intent,"Send Email"));


                }
                //  startActivity(i);
    }
    });
}
}