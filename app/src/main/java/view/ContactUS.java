package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.x1_year_project.R;

public class ContactUS extends AppCompatActivity { //Kim

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        //Her sættes textviews sammen med xml ID
        TextView phone = findViewById(R.id.ContactUsTextViewPhone);
        TextView email = findViewById(R.id.ContactUsTextViewEmail);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Her defineres at der er tale om telefon data
                Uri u = Uri.parse("tel:" + phone.getText().toString());

                // Her laves en Intent
                // Her sættes intent typen.
                Intent i = new Intent(Intent.ACTION_DIAL, u);

                try
                {
                    //Starter den indbyggede telefon app
                    startActivity(i);
                }
                catch (SecurityException s)
                {
                    //Viser en toast hvis der opstår fejl
                 Toast.makeText(getApplicationContext(),"Fejl",Toast.LENGTH_SHORT).show();
                }
            }

        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Her laves en ny intent som sender brugeren til en af telefonens indbyggede email funktioner.
                // EXTRA_EMAIL indeholder den email adresse som indeholdet skal sendes til.
                //intent.setType definere at det er: Multipurpose Internet Mail Extensions (MIME) der skal bruges.
                //intent.setData Uniform Resource Identifier (Uri) definere at der er tale om en email.
                //intent.putExtra(Intent.EXTRA_SUBJECT sætter emnet i emailen.
                //intent.putExtra(Intent.EXTRA_TEXT definere hvad der skal være i teksten af emailen.
                // startActivity(Intent.createChooser(intent,"Send Email")) Denne intent åbner for valg af email.
                Intent i = new Intent(Intent.ACTION_SENDTO);

                i.putExtra(Intent.EXTRA_EMAIL,new String[]{("kimx4706@edu.easj.dk")});
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_SUBJECT, "Forespørgsel på New-Yorker væg");
                i.putExtra(Intent.EXTRA_TEXT, "");
                startActivity(Intent.createChooser(i,"Send Email"));
            }
        });
    }
}