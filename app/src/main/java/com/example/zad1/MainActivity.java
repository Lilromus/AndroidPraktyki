package com.example.zad1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText wyplataInput = findViewById(R.id.wyplataInput);
        EditText stawkaInput = findViewById(R.id.podatekInput);
        Button obliczButton = findViewById(R.id.obliczButton);
        TextView resultText = findViewById(R.id.resultText);


        obliczButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String wyplataText = wyplataInput.getText().toString();
                String stawkaText = stawkaInput.getText().toString();


                if (wyplataText.isEmpty() || stawkaText.isEmpty()) {
                    resultText.setText("Proszę wypełnić oba pola.");
                    return;
                }


                double wyplata = Double.parseDouble(wyplataText);
                double stawka = Double.parseDouble(stawkaText);


                double podatek = (wyplata * stawka) / 100;

                resultText.setText("Twoja kwota podatku to: " + podatek + " PLN");
            }
        });
    }
}
