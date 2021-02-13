package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class NordImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nord_image);

        ImageView nordImageStartrail = findViewById(R.id.NordImage_startrail);

        int imageResource = getResources().getIdentifier("@drawable/nord",null, this.getPackageName());
        nordImageStartrail.setImageResource(imageResource);
    }
}