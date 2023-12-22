package com.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnEqaul,btnMinas,btnMulti,btnC,btnPlus,btnD,btn0;
TextView textView1, textView2,textView3;
String option ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 =findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1ID);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqaul=findViewById(R.id.btnEqual);
        btnMinas=findViewById(R.id.btnMinas);
        btnMulti=findViewById(R.id.btnMulti);
        btnC=findViewById(R.id.btnC);
        textView1=findViewById(R.id.tv1);
        textView2=findViewById(R.id.tv2);
        textView3=findViewById(R.id.tv3);
        btnD = findViewById(R.id.btnDivison);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "1");
                }else {
                    textView3.setText(textView3.getText()+"1");
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "2");
                }else {
                    textView3.setText(textView3.getText()+"2");
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "3");
                }else {
                    textView3.setText(textView3.getText()+"3");
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "4");
                }else {
                    textView3.setText(textView3.getText()+"4");
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "5");
                }else {
                    textView3.setText(textView3.getText()+"5");
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "6");
                }else {
                    textView3.setText(textView3.getText()+"6");
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "7");
                }else {
                    textView3.setText(textView3.getText()+"7");
                }


            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "8");
                }else {
                    textView3.setText(textView3.getText()+"8");
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "9");
                }else {
                    textView3.setText(textView3.getText()+"9");
                }


            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().toString().isEmpty()){
                    textView1.setText(textView1.getText() + "0");
                }else {
                    textView3.setText(textView3.getText()+"0");
                }
            }
        });


        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                option = "D";
                textView2.setText("/");
            }
        });
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option = "Mu";
                textView2.setText("*");
            }
        });
        btnMinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                option = "Mi";
                textView2.setText("-");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                option = "P";
                textView2.setText("+");
            }
        });

        btnEqaul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (option == "P"){

                 String fValue = textView1.getText().toString();
                    double fN = Double.parseDouble(fValue);
                 String sValue = textView3.getText().toString();
                 double sN = Double.parseDouble(sValue);
                 double eQ = fN + sN;
                 textView3.setText(textView3.getText()+"="+ eQ);
                }if (option == "Mi"){
                    String fValue = textView1.getText().toString();
                    double fN = Double.parseDouble(fValue);
                    String sValue = textView3.getText().toString();
                    double sN = Double.parseDouble(sValue);
                    double eQ = fN - sN;
                    textView3.setText(textView3.getText()+"="+ eQ);
                }if (option == "Mu"){
                    String fValue = textView1.getText().toString();
                    double fN = Double.parseDouble(fValue);
                    String sValue = textView3.getText().toString();
                    double sN = Double.parseDouble(sValue);
                    double eQ = fN * sN;
                    textView3.setText(textView3.getText()+"="+ eQ);
                }if (option == "D"){
                    String fValue = textView1.getText().toString();
                    double fN = Double.parseDouble(fValue);
                    String sValue = textView3.getText().toString();
                    double sN = Double.parseDouble(sValue);
                    double eQ = fN / sN;
                    textView3.setText(textView3.getText()+"="+ eQ);
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("");
                textView2.setText("");
                textView3.setText("");
                option= "";
            }
        });




    }
}