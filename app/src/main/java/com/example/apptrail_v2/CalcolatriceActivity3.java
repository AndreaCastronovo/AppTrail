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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice3);
        //      TEST PER VEDERE VALORE X


        //TEST PER VEDERE I VALORI
        EditText text = (EditText) findViewById(R.id.edit2);
        text.setText(String.valueOf(CalcolatriceActivity0.x));

        TextView text2 = (TextView) findViewById(R.id.ostrica);
        text2.setText(String.valueOf(CalcolatriceActivity0.x));



    }

    // Metodo per tornare alla MainActivity
    public void home(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}