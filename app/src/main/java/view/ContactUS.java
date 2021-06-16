package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.x1_year_project.R;

public class ContactUS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        TextView phone = findViewById(R.id.ContactUsTextViewPhone);
        TextView email = findViewById(R.id.ContactUsTextViewEmail);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri u = Uri.parse("tel:" + phone.getText().toString());

                // Create the intent and set the data for the
                // intent as the phone number.
                Intent i = new Intent(Intent.ACTION_DIAL, u);

                try
                {
                    // Launch the Phone app's dialer with a phone
                    // number to dial a call.
                    startActivity(i);
                }
                catch (SecurityException s)
                {
                    // show() method display the toast with
                    // exception message.
                 Toast.makeText(getApplicationContext(),"Fejl",Toast.LENGTH_SHORT).show();
                }
            }

        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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