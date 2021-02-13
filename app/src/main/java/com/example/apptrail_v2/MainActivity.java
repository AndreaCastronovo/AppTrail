package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guida(View view)
    {
        Intent intent = new Intent(this, GuidaActivity.class);
        startActivity(intent);
    }

    public void calcolatrice0(View view)
    {
        Intent intent = new Intent(this, CalcolatriceActivity0.class);
        startActivity(intent);
    }
}