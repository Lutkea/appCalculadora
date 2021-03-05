package com.example.appcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tValor1;
    TextView tValor2;
    TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSomar = (Button) findViewById(R.id.btSomar);
        Button btSubtrair = (Button) findViewById(R.id.btSubtrair);
        Button btDividir = (Button) findViewById(R.id.btDividir);
        Button btMultiplicar = (Button) findViewById(R.id.btMultiplicar);

        btSomar.setOnClickListener(onClickSomar());
        btSubtrair.setOnClickListener(onClickSubtrair());
        btDividir.setOnClickListener(onClickDividir());
        btMultiplicar.setOnClickListener(onClickMultiplicar());

    }

    private View.OnClickListener onClickSomar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tValor1 = (TextView) findViewById(R.id.valor1);
                tValor2 = (TextView) findViewById(R.id.valor2);
                tResultado = (TextView) findViewById(R.id.txResultado);
                float valor1 = Float.parseFloat(tValor1.getText().toString());
                float valor2 = Float.parseFloat(tValor2.getText().toString());
                tResultado.setText(String.valueOf(valor1+valor2));
            }
        };
    }
    private View.OnClickListener onClickSubtrair() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                TextView tValor1 = (TextView) findViewById((R.id.valor1));
                TextView tValor2 = (TextView) findViewById((R.id.valor2));
                tResultado = (TextView) findViewById((R.id.txResultado));

                float valor1 = Float.parseFloat(tValor1.getText().toString());
                float valor2 = Float.parseFloat(tValor2.getText().toString());

                tResultado.setText((String.valueOf(valor1-valor2)));
            }
        };
    }
    private View.OnClickListener onClickDividir() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tValor1 = (TextView) findViewById(R.id.valor1);
                tValor2 = (TextView) findViewById(R.id.valor2);
                tResultado = (TextView) findViewById(R.id.txResultado);

                float valor1 = Float.parseFloat(tValor1.getText().toString());
                float valor2 = Float.parseFloat(tValor2.getText().toString());

                tResultado.setText((String.valueOf(valor1/valor2)));
            }
        };
    }private View.OnClickListener onClickMultiplicar() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tValor1 = (TextView) findViewById(R.id.valor1);
                tValor2 = (TextView) findViewById(R.id.valor2);
                tResultado = (TextView) findViewById(R.id.txResultado);

                float valor1 = Float.parseFloat(tValor1.getText().toString());
                float valor2 = Float.parseFloat(tValor2.getText().toString());

                tResultado.setText((String.valueOf(valor1*valor2)));
            }
        };
    }
}