package view;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.x1_year_project.R;


public class SplashScreenActivity extends AppCompatActivity {// Kim

    //Her instanisere vi handler
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
       /* Her laver vi en ny thread som vi benytter til at håndtere et delay.
          Vi bruger en handler thread som er skabt og er afhæning af main thread */
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Når handleren har vist vores splashscreen så går vi videre til næste activity ved hjælp
                 af intenten vi laver. Finish metodern gør at man ikke kan gå tilbage til splashscreenen*/
                Intent intent=new Intent(SplashScreenActivity.this, StartScreen.class);
                startActivity(intent);
                finish();
            }
            //Det her betyder at splashscreenen bliver vist i 3 sekunder.
        },3000);

    }
}
