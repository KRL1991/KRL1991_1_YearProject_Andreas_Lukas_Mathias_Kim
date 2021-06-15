package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.x1_year_project.R;

import exceptions.WallHeightOverThresholdException;
import exceptions.WallWidthUnderThresholdException;
import model.Basket;
import model.Wall;
import model.WallPriceList;

public class ChosenWall extends AppCompatActivity {

    //Written by Kim and Andreas

    EditText ChosenWallHeightEditText, ChosenWallWidthEditText,ChosenWallNameWallEditText;

    TextView ChosenWallPriceTextView;

    ImageView imageViewPicture;
    ImageView imageViewName;
    ImageView imageViewMeasure;

    Bundle bundle;

    WallHeightOverThresholdException wallHeightOverThresholdException =
            new WallHeightOverThresholdException("Højde skal være under 251 cm");

    WallWidthUnderThresholdException wallWidthUnderThresholdException =
            new WallWidthUnderThresholdException("Bredde skal være over 10 cm");

 /*   Context context = getApplicationContext();
    CharSequence text = "Fejl, Højde skal være under 251 cm";
    int duration = Toast.LENGTH_SHORT;

    Toast toast = Toast.makeText(context, text, duration);*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_wall);

        Button goToPrice = findViewById(R.id.ChosenWallButton);

        ChosenWallHeightEditText = (EditText) findViewById(R.id.ChosenWallHeightEditText);
        ChosenWallWidthEditText = (EditText) findViewById(R.id.ChosenWallWidthEditText);
        ChosenWallNameWallEditText = (EditText) findViewById(R.id.ChosenWallNameWallEditText);
        ChosenWallPriceTextView = (TextView) findViewById(R.id.ChosenWallPriceTextView);
        imageViewPicture = (ImageView) findViewById(R.id.imageViewPicture);
        imageViewMeasure = (ImageView) findViewById(R.id.imageViewMeasure);
        imageViewName = (ImageView) findViewById(R.id.imageViewName);

        //Kim
        //Clears the EditTextview when doubleclicked.


        ChosenWallHeightEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus)
                ChosenWallHeightEditText.setText("");
            }
        });

       ChosenWallWidthEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
           @Override
           public void onFocusChange(View v, boolean hasFocus) {
               if(hasFocus)
               ChosenWallWidthEditText.setText("");
           }
       });
       ChosenWallNameWallEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
           @Override
           public void onFocusChange(View v, boolean hasFocus) {
               if (hasFocus)
               ChosenWallNameWallEditText.setText("");
           }
       });


//Andreas - data from catalog to ChosenWall
        bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            String height = bundle.getString("Height");
            String width = bundle.getString("Width");
            String wallName = bundle.getString("WallName");
            String price = bundle.getString("Price");

            setUp(name, height, width, wallName,price);
        }

        //Kim and Mathias
        goToPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Her laves et nyt objekt af Wall. Værdierne bliver her sat ud fra tekstfelterne.
                Wall selectedWall = new Wall();
                selectedWall.setWallName(ChosenWallNameWallEditText.getText().toString());
                selectedWall.setHeight(ChosenWallHeightEditText.getText().toString());
                selectedWall.setWidth(ChosenWallWidthEditText.getText().toString());
                selectedWall.setPrice(ChosenWallPriceTextView.getText().toString());
                //Tilføjer den valgte væg til kurven.
                Basket.getContent().add(selectedWall);

                //Exception for wallOverthreshold som bliver kastet når den indtastede højde er over 251 cm

                try {
                  if (Integer.parseInt(selectedWall.getHeight()) >  251) {
                      throw wallHeightOverThresholdException;
                  }


               } catch (WallHeightOverThresholdException e) {
                    Toast.makeText(getApplicationContext(),"Højde må max være 250 cm",Toast.LENGTH_SHORT).show();


               }
                //Exception for WallWidthUnderThreshold som bliver kastet når den indtastede bredde er under 9 cm
               try {
                    if (Integer.parseInt(selectedWall.getWidth()) < 9){
                    throw wallWidthUnderThresholdException;
                    }

                } catch (WallWidthUnderThresholdException e) {
                    Toast.makeText(getApplicationContext(),"Bredde skal være over 10 cm",Toast.LENGTH_SHORT).show();


                }

                Intent intent = new Intent(ChosenWall.this, Extra.class);

                startActivity(intent);
            }
        });



    }

    private void setUp(String name, String height, String width, String wallName, String price) {
        if (name.equals("picture1")) {

            imageViewPicture.setImageResource(R.drawable.picturenew1);
            imageViewName.setImageResource(R.drawable.picturename1);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure1);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);




        } else if (name.equals("picture2")) {
            imageViewPicture.setImageResource(R.drawable.picturenew2);
            imageViewName.setImageResource(R.drawable.picturename2);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure2);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);


        } else if (name.equals("picture3")) {
            imageViewPicture.setImageResource(R.drawable.picturenew3);
            imageViewName.setImageResource(R.drawable.picturename3);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure3);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture4")) {
            imageViewPicture.setImageResource(R.drawable.picturenew4);
            imageViewName.setImageResource(R.drawable.picturename4);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure4);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture5")) {
            imageViewPicture.setImageResource(R.drawable.picturenew5);
            imageViewName.setImageResource(R.drawable.picturename5);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure5);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture6")) {
            imageViewPicture.setImageResource(R.drawable.picturenew6);
            imageViewName.setImageResource(R.drawable.picturename6);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure6);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture7")) {
            imageViewPicture.setImageResource(R.drawable.picturenew7);
            imageViewName.setImageResource(R.drawable.picturename7);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure7);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture8")) {
            imageViewPicture.setImageResource(R.drawable.picturenew8);
            imageViewName.setImageResource(R.drawable.picturename8);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure8);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture9")) {
            imageViewPicture.setImageResource(R.drawable.picturenew9);
            imageViewName.setImageResource(R.drawable.picturename9);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure9);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        } else if (name.equals("picture10")) {
            imageViewPicture.setImageResource(R.drawable.picturenew10);
            imageViewName.setImageResource(R.drawable.picturename10);
            imageViewMeasure.setImageResource(R.drawable.picturemeasure10);
            ChosenWallWidthEditText.setText(width);
            ChosenWallHeightEditText.setText(height);
            ChosenWallNameWallEditText.setText(wallName);
            ChosenWallPriceTextView.setText(price);

        }


    }

}






