package com.example.cuarto_programa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1, n2;
    private TextView res;
    private CheckBox ca1, ca2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.num);
        n2 = (EditText)findViewById(R.id.numero);
        res = (TextView)findViewById(R.id.resultado);
        ca1 = (CheckBox)findViewById(R.id.c1);
        ca2 = (CheckBox)findViewById(R.id.c2);
    }
    public void operar (View view){
        String v1 = n1.getText().toString();
        String v2 = n2.getText().toString();
        int num1 = Integer.parseInt(v1);
        int num2 = Integer.parseInt(v2);
        String resu=" ";
        if (ca1.isChecked() == true) {
            int suma = num1+num2;
            resu = " la suma es "+suma;
        }
        if(ca2.isChecked() == true) {
            int resta = num1-num2;
            resu = " la resta es "+ resta;
        }
        res.setText(resu);
    }
}