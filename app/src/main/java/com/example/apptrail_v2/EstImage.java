package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class EstImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_est_image);

        ImageView estImageStartrail = findViewById(R.id.EstImage_startrail);

        int imageResource = getResources().getIdentifier("@drawable/est",null, this.getPackageName());
        estImageStartrail.setImageResource(imageResource);
    }
}