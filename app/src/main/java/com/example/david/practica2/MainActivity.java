package com.example.david.practica2;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Capital,Tasa,Periodos;
    private TextView montInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Capital = (EditText)findViewById(R.id.edtxt1);
        Tasa = (EditText)findViewById(R.id.edtxt2);
        Periodos = (EditText)findViewById(R.id.edtxt3);
        montInt = (TextView)findViewById(R.id.txt4);

    }



    public void calculos(View view){

        String capital = Capital.getText().toString();
        String tasa = Tasa.getText().toString();
        String periodos = Periodos.getText().toString();

        double n1 = Double.parseDouble(capital);
        double n2 = Double.parseDouble(tasa);
        double n3 = Double.parseDouble(periodos);
        double monto = n1*Math.pow((1+n2/100), n3);
        double interes = monto - n1;

        String res = "";

        res = "El monto total es: " + String.format("%8.2f", monto) + "\n" + "\n" +
                "La cantidad de intereses a pagar es: " + String.format("%8.2f",interes);
        montInt.setText(res);


    }
}
