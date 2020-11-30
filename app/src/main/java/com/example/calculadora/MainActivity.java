package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button suma;
    private Button resta;
    private Button div;
    private Button mult;
    //NNumeros
    private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button igual;
    private Button del;

    private TextView op;
    private TextView res;

    private EditText n1;
    private EditText n2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        res = findViewById(R.id.res);
        op = findViewById(R.id.op);

        //botones numeros
        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("0");
                }
                else{
                    n2.setText("0");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("1");
                }
                else{
                    n2.setText("1");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("2");
                }
                else{
                    n2.setText("2");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("3");
                }
                else{
                    n2.setText("3");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("4");
                }
                else{
                    n2.setText("4");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("5");
                }
                else{
                    n2.setText("5");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("6");
                }
                else{
                    n2.setText("6");
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("7");
                }
                else{
                    n2.setText("7");
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("8");
                }
                else{
                    n2.setText("8");
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().equals("")){
                    n1.setText("9");
                }
                else{
                    n2.setText("9");
                }
            }
        });

        /////////////////////////////

        suma = findViewById(R.id.suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText("+");
            }
        });

        resta = findViewById(R.id.resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText("-");
            }
        });
        mult = findViewById(R.id.mult);
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText("x");
            }
        });
        div = findViewById(R.id.div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op.setText("/");
            }
        });

        res = findViewById(R.id.res);
        igual = findViewById(R.id.igual);
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(op.getText().equals("+")){
                    int num1 = Integer.parseInt(n1.getText().toString());
                    int num2 = Integer.parseInt(n2.getText().toString());
                    int res_suma = suma(num1,num2);
                    res.setText(""+res_suma+"");
                }
                else if(op.getText().equals("-")){
                    int num1 = Integer.valueOf(n1.getText().toString());
                    int num2 = Integer.valueOf(n2.getText().toString());
                    int res_resta = resta(num1,num2);
                    res.setText(""+res_resta+"");
                }
                else if(op.getText().equals("x")){
                    int num1 = Integer.valueOf(n1.getText().toString());
                    int num2 = Integer.valueOf(n2.getText().toString());
                    int res_mult = mult(num1,num2);
                    res.setText(""+res_mult+"");
                }
                else if(op.getText().equals("/")){
                    float num1 = Integer.valueOf(n1.getText().toString());
                    float num2 = Integer.valueOf(n2.getText().toString());
                    float res_div = div(num1,num2);
                    res.setText(""+res_div+"");
                }
                else{

                }
            }
        });
        del = findViewById(R.id.del);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("");
                n1.setText("");
                n2.setText("");
                op.setText("");
            }
        });

    }

    //operaciones
    public int suma(int n1, int n2){
        int suma = n1+n2;
        return suma;
    }
    public int resta(int n1, int n2){
        int resta = n1-n2;
        return resta;
    }
    public int mult(int n1, int n2){
        int mult = n1*n2;
        return mult;
    }
    public float div(float n1, float n2){
        float div = n1/n2;
        return div;
    }


}