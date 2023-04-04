package com.example.conversordevalores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bCalcularDolar;

    Button bCalcularReal;
    EditText idReal;
    EditText idDolar;
    EditText idResultadoDolar;

    EditText idResultadoReal;

    double calculoConversaoDolar = 0;
    double calculoConversaoReal= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCalcularDolar=findViewById(R.id.bCalcularDolar);
        bCalcularReal=findViewById(R.id.bCalcularReal);
        idReal=findViewById(R.id.idReal);
        idDolar=findViewById(R.id.idDolar);
        idResultadoDolar=findViewById(R.id.idResultadoDolar);
        idResultadoReal=findViewById(R.id.idResultadoReal);





        bCalcularDolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorReal = idReal.getText().toString();
                double idValorReal = Double.parseDouble(valorReal);

                String valorDolar = idDolar.getText().toString();
                double idValorDolar = Double.parseDouble(valorDolar);

                calculoConversaoDolar = idValorReal/idValorDolar;

                idResultadoDolar.setText(String.valueOf("US$"+calculoConversaoDolar));


            }
        });

        bCalcularReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valorReal = idReal.getText().toString();
                double idValorReal = Double.parseDouble(valorReal);

                String valorDolar = idDolar.getText().toString();
                double idValorDolar = Double.parseDouble(valorDolar);

                calculoConversaoReal=idValorDolar*idValorReal;

                idResultadoReal.setText(String.valueOf("R$"+calculoConversaoReal));

            }
        });
    }
}