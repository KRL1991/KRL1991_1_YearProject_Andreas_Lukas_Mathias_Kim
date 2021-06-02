package view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.x1_year_project.R;

import model.Basket;
import model.Wall;

public class ChosenWall extends AppCompatActivity {

    //Written by Kim and Andreas

    EditText ChosenWallHeightEditText, ChosenWallWidthEditText,ChosenWallNameWallEditText;

    TextView PriceTextView;

    ImageView imageView3;

    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_wall);

        Button goToPrice = findViewById(R.id.ChosenWallButton);

        ChosenWallHeightEditText = (EditText) findViewById(R.id.ChosenWallHeightEditText);
        ChosenWallWidthEditText = (EditText) findViewById(R.id.ChosenWallWidthEditText);
        ChosenWallNameWallEditText = (EditText) findViewById(R.id.ChosenWallNameWallEditText);
        PriceTextView = (TextView) findViewById(R.id.ChosenWallPriceTextView);

        imageView3 = (ImageView) findViewById(R.id.imageView3);

//Andreas - data from catalog to ChosenWall
        bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            String Height = bundle.getString("Height");
            String Width = bundle.getString("Width");
            String WallName = bundle.getString("WallName");

            setUp(name, Height, Width, WallName);
        }


        goToPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Wall selectedWall = new Wall();
                selectedWall.setWallName(ChosenWallNameWallEditText.getText().toString());
                selectedWall.setHeight(ChosenWallHeightEditText.getText().toString());
                selectedWall.setWidth(ChosenWallWidthEditText.getText().toString());
                selectedWall.setPrice(PriceTextView.getText().toString());
                Basket.content.add(selectedWall);

                Intent intent = new Intent(ChosenWall.this, Extra.class);
                intent.putExtra("height", selectedWall.getHeight());
                intent.putExtra("width", selectedWall.getWidth());
                intent.putExtra("price", selectedWall.getPrice());
                intent.putExtra("WallName", selectedWall.getWallName());
                startActivity(intent);
            }
        });

    }

    private void setUp(String name, String Height, String Width, String WallName) {
        if (name.equals("picture1")) {

            imageView3.setImageResource(R.drawable.fag1_glas4);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);




        } else if (name.equals("picture2")) {
            imageView3.setImageResource(R.drawable.fag2_glas6);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture3")) {
            imageView3.setImageResource(R.drawable.fag2_glas8);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture4")) {
            imageView3.setImageResource(R.drawable.fag3_glas12_med_enkeldor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture5")) {
            imageView3.setImageResource(R.drawable.fag4_glas16_med_doubledor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture6")) {
            imageView3.setImageResource(R.drawable.fag5_glas20_med_enkeldor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture7")) {
            imageView3.setImageResource(R.drawable.fag6_glas24_med_enkeldor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture8")) {
            imageView3.setImageResource(R.drawable.glas6_dor);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture9")) {
            imageView3.setImageResource(R.drawable.doubledor_glas12);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);

        } else if (name.equals("picture10")) {
            imageView3.setImageResource(R.drawable.skydedor_6glas);
            ChosenWallWidthEditText.setText(Width);
            ChosenWallHeightEditText.setText(Height);
            ChosenWallNameWallEditText.setText(WallName);
        }
    }
}






