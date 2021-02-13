package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class SudImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sud_image);

        ImageView sudImageStartrail = findViewById(R.id.SudImage_startrail);

        int imageResource = getResources().getIdentifier("@drawable/sud",null, this.getPackageName());
        sudImageStartrail.setImageResource(imageResource);
    }
}