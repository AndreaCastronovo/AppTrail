package com.example.apptrail_v2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
public class CalcolatriceActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice2);
        Intent intent = this.getIntent();
        Double crop_factor = intent.getDoubleExtra(CalcolatriceActivity0.Crop,CalcolatriceActivity0.x);
        EditText text = (EditText) findViewById(R.id.edit);
        text.setText(String.valueOf(crop_factor));

        NumberPicker numberPicker = findViewById(R.id.NumberPicker);
        textView = findViewById(R.id.focale);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(500);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                textView.setText("LUNGHEZZA FOCALE SELEZIONATA ="+ newVal);
            }
        });
    }
}