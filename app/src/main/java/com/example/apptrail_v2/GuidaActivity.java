package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GuidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guida);
    }

    public void nord(View view) {
        //Show image of nord startrail
        Intent intent = new Intent(this, NordImage.class);
        startActivity(intent);
    }
    public void est(View view){
        //show image of est startrail
        Intent intent = new Intent(this, EstImage.class);
        startActivity(intent);
    }
    public void sud(View view){
        //show image of sud startrail
        Intent intent = new Intent(this, SudImage.class);
        startActivity(intent);
    }
    public void ovest(View view){
        //show image of ovest startrail
        Intent intent = new Intent(this, OvestImage.class);
        startActivity(intent);
    }

    public void next1(View view){
        Intent intent = new Intent(this, Next1.class);
        startActivity(intent);
    }
}