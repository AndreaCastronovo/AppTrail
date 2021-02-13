package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class OvestImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovest_image);

        ImageView ovestImageStartrail = findViewById(R.id.OvestImage_startrail);

        int imageResource = getResources().getIdentifier("@drawable/ovest",null, this.getPackageName());
        ovestImageStartrail.setImageResource(imageResource);
    }
}