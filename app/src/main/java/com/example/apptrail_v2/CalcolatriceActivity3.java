package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalcolatriceActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         int focale = CalcolatriceActivity2.focale;
         double crop = CalcolatriceActivity0.x;
         int result = (int) (500/(focale*crop));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice3);


        TextView diaframma1 = (TextView) findViewById(R.id.diaframma1);
        diaframma1.setText("F/"+String.valueOf(CalcolatriceActivity2.diaframma)+"."+String.valueOf(CalcolatriceActivity2.diaframma2));

        TextView diaframma2 = (TextView) findViewById(R.id.diaframma2);
        diaframma2.setText("F/"+String.valueOf(CalcolatriceActivity2.diaframma)+"."+String.valueOf(CalcolatriceActivity2.diaframma2));



        TextView focale1 = (TextView) findViewById(R.id.focale1);
        focale1.setText(String.valueOf(CalcolatriceActivity2.focale)+" mm");

        TextView focale2 = (TextView) findViewById(R.id.focale2);
        focale2.setText(String.valueOf(CalcolatriceActivity2.focale)+" mm");


        TextView tempo1 = (TextView) findViewById(R.id.tempo1);
        tempo1.setText(" 30s");

        TextView tempo2 = (TextView) findViewById(R.id.tempo2);
        tempo2.setText(String.valueOf(result)+"s");

        TextView iso1 = (TextView) findViewById(R.id.iso1);
        iso1.setText(String.valueOf(CalcolatriceActivity0.iso));

        TextView iso2 = (TextView) findViewById(R.id.iso2);
        iso2.setText(String.valueOf(CalcolatriceActivity0.iso));



    }

    // Metodo per tornare alla MainActivity
    public void home(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}