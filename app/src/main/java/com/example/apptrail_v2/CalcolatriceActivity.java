package com.example.apptrail_v2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class CalcolatriceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice);


        ImageButton canon = (ImageButton) findViewById(R.id.canon);               // UTILIZZO findViewById PER ACCEDERE AD UNA RISORSA PASSANDO, COME PARAMETRO, L'IDENTIFICATORE
        ImageButton nikon =  (ImageButton) findViewById(R.id.nikon);
        ImageButton sony =  (ImageButton) findViewById(R.id.sony);


        // Definisco come deve variare l'int X in base al Button utilizzato

        canon.setOnClickListener(new View.OnClickListener(){                      // UTILIZZO IL METODO setOnClickListener  PER CREARE UN'AZIONE RUNTIME PER l'ImageButton
            @Override
            public void onClick(View view) {
                CalcolatriceActivity0.x = 1.6;
                calcolatrice2(view,CalcolatriceActivity0.x);
            }
        });

        nikon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CalcolatriceActivity0.x = 1.5;
                calcolatrice2(view,CalcolatriceActivity0.x);
            }
        });

        sony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                CalcolatriceActivity0.x = 1.5;
                calcolatrice2(view,CalcolatriceActivity0.x);
            }
        });
    }

    //Definisco nuove metodo
    public void calcolatrice2(View view, Double x)
    {
        Intent ic = new Intent(this, CalcolatriceActivity2.class);
        ic.putExtra(CalcolatriceActivity0.Crop, CalcolatriceActivity0.x);
        startActivity(ic);
    }
}