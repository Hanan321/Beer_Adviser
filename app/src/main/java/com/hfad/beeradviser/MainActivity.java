package com.hfad.beeradviser;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.Activity;
import java.util.List;

public class MainActivity extends Activity {

    final private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //This method (onClickFindBeer) refer to tne button
    public void onClickFindBeer(View view){

            //get reference to the TextView
            TextView brands = (TextView) findViewById(R.id.brands);

            //get reference to the Spinner
            Spinner color = (Spinner) findViewById(R.id.color);

            //Get the selected item in the spinner
            String beerType =String.valueOf(color.getSelectedItem());

            //Get recommendation from BeerExpert class
            List<String> brandList = expert.getBrands(beerType);
            StringBuilder brandsFormatted = new StringBuilder();
            for(String brand: brandList){
                brandsFormatted.append(brand).append('\n');
            }
            //display the beers
            brands.setText(brandsFormatted);

        }


    }











    /*findBeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView brands = (TextView) findViewById(R.id.brands);
                //brands.setText(beerTypes);//??Error
                String.valueOf(beerColors.getSelectedItem());
            }
        });*/


         //display the selected item
         /* brands.setText(beerType);*/


        //get reference to the Button
        //final Button findBeer = findViewById(R.id.find_beer);


        //git hub token!
        //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