package com.example.apptrail_v2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
public class CalcolatriceActivity2 extends AppCompatActivity {
    //DICHIARO LE 3 TEXTVIEW PER I PICKER
    TextView textView;
    TextView textView2;
    TextView textView3;

    //DICHIARO LE VARIABILI FOCALE E DIAFRAMMA, DA UTILIZZARE NEL CALCOLO FINALE
    public static int diaframma,focale,diaframma2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice2);
        Intent intent = this.getIntent();
        Double crop_factor = intent.getDoubleExtra(CalcolatriceActivity0.Crop,CalcolatriceActivity0.x);




//              TEST PER VEDERE VALORE X




        //PRIMO PICKER PER LUNGHEZZA FOCALE -------------------------------------------------------------------------------------------
        NumberPicker numberPicker = findViewById(R.id.NumberPicker);

        //TESTO PER VISUALIZZARE LUNGHEZZA FOCALE = mm
        textView = findViewById(R.id.focale);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(350);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                textView.setText("LUNGHEZZA FOCALE SELEZIONATA = "+ newVal +" mm");
                focale = numberPicker.getValue();  //ATTRAVERSO QUESTO METODO SALVO IL VALORE FOCALE SCELTO DALL'UTENTE

            }
        });

        //FINE-----------------------------------------------------------------------------------------------------------------------

        //SECONDO PICKER PER APERTURA DIAFRAMMA -------------------------------------------------------------------------------------
        NumberPicker numberPicker2 = findViewById(R.id.NumberPicker2);
        NumberPicker numberPicker3 = findViewById(R.id.NumberPicker3);

        //TESTO PER VISUALIZZARE APERTURA DIAFRAMMA
        textView2 = findViewById(R.id.diaframma);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(500);
        numberPicker2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal2, int newVal2) {
                textView2.setText("APERTURA MINIMA DIAFRAMMA = F/"+newVal2);
                diaframma = numberPicker2.getValue();  //ATTRAVERSO QUESTO METODO SALVO IL VALORE SCELTO DALL'UTENTE
            }
        });
        //TESTO PER VISUALIZZARE PARTE DECIMANE  DIAFRAMMA
        textView3 = findViewById(R.id.diaframma2);
        numberPicker3.setMinValue(0);
        numberPicker3.setMaxValue(9);
        numberPicker3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal2, int newVal2) {
                textView3.setText(" . "+newVal2);
                diaframma2 = numberPicker3.getValue();  //ATTRAVERSO QUESTO METODO SALVO IL VALORE SCELTO DALL'UTENTE
            }
        });


        //FINE  --------------------------------------------------------------------------------------------------------------------------
    }
    // Definisco metodo per passare alla nuova Activity (CalcolatriceActivity3)
    public void avanti(View view)
    {
        Intent intent = new Intent(this, CalcolatriceActivity3.class);
        startActivity(intent);
    }
}