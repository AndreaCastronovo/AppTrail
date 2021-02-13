package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Next1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next1);

        ImageView PolarStarImage = findViewById(R.id.PolarImage_startrail);

        int imageResource = getResources().getIdentifier("@drawable/polar_star",null, this.getPackageName());
        PolarStarImage.setImageResource(imageResource);
    }

    public void next2(View view){
        Intent intent = new Intent(this, Next2.class);
        startActivity(intent);
    }
}