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

        //Her sætter vi vores TextView sammen med xml id'erne.
        TextView phone = findViewById(R.id.ContactUsTextViewPhone);
        TextView email = findViewById(R.id.ContactUsTextViewEmail);

        //Her sætter vi en setOnClickListener på phone TextViewet
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Her definere vi hvilken uri der er tale om, her er der tale om en telefon
                Uri u = Uri.parse("tel:" + phone.getText().toString());

                //Intent i tager os hen til opkaldsskærmen
                Intent i = new Intent(Intent.ACTION_DIAL, u);
                startActivity(i);

            }

        });
        //Her sætter vi en setOnClickListener på email TextViewet
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Her laver vi en ny intent
                Intent i = new Intent(Intent.ACTION_SENDTO);


                // EXTRA_EMAIL indeholder den email adresse som indeholdet skal sendes til.
                //intent.setType definere at det er: Multipurpose Internet Mail Extensions (MIME) der skal bruges.
                //intent.setData Uniform Resource Identifier (Uri) definere at der er tale om en email.
                //intent.putExtra(Intent.EXTRA_SUBJECT sætter emnet i emailen.
                //intent.putExtra(Intent.EXTRA_TEXT definere hvad der skal være i teksten af emailen. (Brugeren skal selv skrive det i dette tilfælde)
                // startActivity(Intent.createChooser(intent,"Send Email")) Denne intent åbner for valg af email.
                i.putExtra(Intent.EXTRA_EMAIL,new String[]{("kimx4706@edu.easj.dk")});
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_SUBJECT, "Spørgsmål til New-Yorker");
                i.putExtra(Intent.EXTRA_TEXT, "");
                startActivity(Intent.createChooser(i,"Send Email"));
            }
        });
    }
}