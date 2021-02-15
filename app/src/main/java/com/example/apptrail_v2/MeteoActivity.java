package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MeteoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meteo);
        ImageButton cloud = (ImageButton) findViewById(R.id.cloud);               // UTILIZZO findViewById PER ACCEDERE AD UNA RISORSA PASSANDO, COME PARAMETRO, L'IDENTIFICATORE
        ImageButton fullmoon =  (ImageButton) findViewById(R.id.fullmoon);
        ImageButton halfmoon =  (ImageButton) findViewById(R.id.halfmoon);


        // Definisco come deve variare l'int X in base al Button utilizzato

        cloud.setOnClickListener(new View.OnClickListener(){                      // UTILIZZO IL METODO setOnClickListener  PER CREARE UN'AZIONE RUNTIME PER l'ImageButton
            @Override
            public void onClick(View view) {
                CalcolatriceActivity0.iso = 3200;
                avanti1(view);
            }
        });

        fullmoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CalcolatriceActivity0.iso = 800;
                avanti1(view);
            }
        });

        halfmoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CalcolatriceActivity0.iso = 1600;
                avanti1(view);
            }
        });
    }

    //Definisco nuove metodo
    public void avanti1(View view)
    {
        Intent intent = new Intent(this, CalcolatriceActivity3.class);
        startActivity(intent);
    }
}
