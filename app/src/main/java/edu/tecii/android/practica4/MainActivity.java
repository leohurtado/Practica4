package edu.tecii.android.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txt100, txt50, txt20, txt5, txt2, txt1, txt_50, txt_20, txt_10, txtnum;
    Button btnconv;
    double num, b100, b50, b20, m5 , m2, m1, c50, c20, c10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum = (EditText)findViewById(R.id.txtcant);
        txt1 = (EditText)findViewById(R.id.txt1);
        txt2 = (EditText)findViewById(R.id.txt2);
        txt5 = (EditText)findViewById(R.id.txt5);
        txt20 = (EditText)findViewById(R.id.txt20);
        txt50 = (EditText)findViewById(R.id.txt50);
        txt100 = (EditText)findViewById(R.id.txt100);
        txt_10 = (EditText)findViewById(R.id.txt_10);
        txt_20 = (EditText)findViewById(R.id.txt_20);
        txt_50 = (EditText)findViewById(R.id.txt_50);
        btnconv = (Button)findViewById(R.id.btncal);
    }
    public void calcular(View v){
        num = Double.parseDouble(txtnum.getText().toString());
        double aux, aux1, aux2, aux3, aux4, aux5, aux6, aux7, aux8;
        aux = num%100;
        b100 = (num-aux)/100;
        aux1 = aux%50;
        b50 = (aux-aux1)/50;
        aux2 = aux1%20;
        b20 = (aux1-aux2)/20;
        aux3 = aux2%5;
        m5 = (aux2-aux3)/5;
        aux4 = aux3%2;
        m2 = (aux3-aux4)/2;
        aux5 = aux4%1;
        m1 = aux4-aux5;
        aux6 = (aux5*100);
        aux7 = aux6%50;
        c50 = (aux6-aux7)/50;
        aux8 = aux7%20;
        c20 = (aux7-aux8)/20;
        c10 = (aux8/10)+0.0000000001;
        txt100.setText(b100+"");
        txt50.setText(b50+"");
        txt20.setText(b20+"");
        txt5.setText(m5+"");
        txt2.setText(m2+"");
        txt1.setText(m1+"");
        txt_50.setText(c50+"");
        txt_20.setText(c20+"");
        txt_10.setText(c10+"");
    }
}