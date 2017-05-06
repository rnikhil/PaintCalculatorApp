//This is Paint Calculator App
package com.example.nikhilreddy.paintcalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double lengthofWall = 0;
    double heightofWall = 0;
    String selectColor;
    double squareFeet = 0;
    double totalGallons = 0;
    DecimalFormat gallon = new DecimalFormat("##,###.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText length = (EditText)findViewById(R.id.txtLength);
        final EditText height = (EditText)findViewById(R.id.txtHeight);
        final Spinner color = (Spinner)findViewById(R.id.spnColors);
        final Button calculate = (Button)findViewById(R.id.btnCost);
        final TextView result = (TextView)findViewById(R.id.txtResult);

        calculate.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {

                lengthofWall = Double.parseDouble(length.getText().toString());
                heightofWall = Double.parseDouble(height.getText().toString());
                squareFeet = lengthofWall * heightofWall;
                totalGallons = squareFeet / 250;

                selectColor = color.getSelectedItem().toString();

                result.setText(" Total Gallons needed for " +squareFeet+ " Feets of wall is " +gallon.format(totalGallons));


            }
        });
    }
}
