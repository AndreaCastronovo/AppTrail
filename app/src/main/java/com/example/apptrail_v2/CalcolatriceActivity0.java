package com.example.apptrail_v2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class CalcolatriceActivity0 extends AppCompatActivity {
    public static String Crop = "com.AppTrail.CROP";
    public static Double x = 1.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice0);
    }
    public void calcolatrice(View view)
    {
        Intent intent = new Intent(this, CalcolatriceActivity.class);
        startActivity(intent);
    }
    public void calco(View view)
    {
        Intent ic = new Intent(this, CalcolatriceActivity2.class);
        ic.putExtra(Crop, this.x);
        startActivity(ic);
    }
}