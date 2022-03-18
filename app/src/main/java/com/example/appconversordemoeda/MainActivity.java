package com.example.appconversordemoeda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt_resultado;
    EditText edt_valor;
    Button btn_converter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_resultado = findViewById(R.id.txt_result);
        edt_valor = findViewById(R.id.edt_valor);
        btn_converter = findViewById(R.id.btn_converter);

        btn_converter.setOnClickListener(view -> {
            double valorEuros = Double.parseDouble(edt_valor.getText().toString());
            double valorDolares = valorEuros * 0.80;
            txt_resultado.setText(String.valueOf(valorDolares));
        });
    }

    /*
    public void calcular(View view){
        double valorEuros = Double.parseDouble(edt_valor.getText().toString());
        double valorDolares = valorEuros * 0.80;
        txt_resultado.setText(String.valueOf(valorDolares));
    }
    */


}