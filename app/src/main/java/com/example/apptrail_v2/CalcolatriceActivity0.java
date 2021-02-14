package com.example.apptrail_v2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class CalcolatriceActivity0 extends AppCompatActivity {

//    DEFINISCO 2 VARIABILI, UNA PER LA 'KEY' E UNA PER LA 'VALUE'
    public static String Crop = "com.AppTrail.CROP";
    public static Double x = 1.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice0);

        // UTILIZZO findViewById PER ACCEDERE AD UNA RISORSA PASSANDO, COME PARAMETRO, L'IDENTIFICATORE
        ImageButton full = (ImageButton) findViewById(R.id.full_frame);
        full.setOnClickListener(new View.OnClickListener(){   // UTILIZZO IL METODO setOnClickListener  PER CREARE UN'AZIONE RUNTIME PER l'ImageButton
            @Override
            public void onClick(View view) {                 // Utilizzo il metodo  onClick per definire cosa accadra' quando il bottone verra' utilizzato
                x = 1.0;
                calcolo(view,CalcolatriceActivity0.x);       // RICHIAMO IL METODO calcolo AL QUALE PASSARE, oltre alla VIEW ( perche' il button e' una View), il valore di x precedentemente sovrascritto
            }
        });
    }

    // In base a quale dei 2 BUTTON verra' utilizzato, verra' chiamato uno dei 2 METODI
    public void calcolatrice(View view)
    {
        Intent intent = new Intent(this, CalcolatriceActivity.class);           // Creo un nuovo Intent (OGGETTO CHE COLLEGA 2 COMPONENTI) per iniziare una nuova Activity
        startActivity(intent);                                                                 // Il metodo startActivity() permette di lanciare la nuova Activity
    }

    // In questo caso devo passare informazioni aggiuntive alla nuova Activity
    public void calcolo(View view, Double x)
    {
        Intent intent = new Intent(this, CalcolatriceActivity2.class);
        intent.putExtra(Crop, x);
        startActivity(intent);
    }
}