package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Next3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next3);

        TextView text_cavalletto = findViewById(R.id.string_linkto_cavalletto);
        text_cavalletto.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text_intervallometro = findViewById(R.id.string_linkto_intervallometro);
        text_intervallometro.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void home(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}