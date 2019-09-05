package com.example.conversormoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etDolar;
    private EditText etEuro;
    private EditText etCambioA;

    private RadioButton cbDolarAEuro;
    private RadioButton cbEuroADolar;

    //VALOR ACTUAL 4/09/2019
    private final double euroDolar = 1.10;
    private final double dolarEuro = 0.91;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDolar = (EditText) findViewById(R.id.editText);
        etEuro = (EditText) findViewById(R.id.editText2);
        etCambioA = (EditText) findViewById(R.id.editText3);
        cbDolarAEuro = (RadioButton) findViewById(R.id.radioButton2);
        cbEuroADolar = (RadioButton) findViewById(R.id.radioButton);
    }

    public void convertir(View view) {
        double etDolar = Double.parseDouble(this.etDolar.getText().toString());
        double etEuro = Double.parseDouble(this.etEuro.getText().toString());

        double precio = 0;

        if (cbDolarAEuro.isChecked()) {
            precio = etDolar * dolarEuro;
        }
        else{
            precio = etEuro * euroDolar;
        }

        etCambioA.setText(precio+"");

        Toast.makeText(this, "Valor convertido", Toast.LENGTH_SHORT).show();
    }
}
