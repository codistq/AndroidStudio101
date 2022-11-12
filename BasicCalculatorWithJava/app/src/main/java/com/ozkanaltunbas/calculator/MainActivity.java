package com.ozkanaltunbas.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1text;
    EditText number2text;
    TextView resulttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         number1text = findViewById(R.id.text1);
         number2text = findViewById(R.id.text2);
         resulttext = findViewById(R.id.result);


    }
    public void topla(View view){
        if(number1text.getText().toString().matches("") ||number2text.getText().toString().matches("") ){
            resulttext.setText("Please enter a value ! ");
        }else{

            int result;
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            result = num1+num2;
            resulttext.setText("Result:"+result);
        }

    }
    public void cikar(View view){
        if(number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resulttext.setText("Please enter a value ! ");
        }else{

            int result;
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            result = num1-num2;
            resulttext.setText("RESULT :"+result);
        }

    }
    public void carp(View view){
        if(number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resulttext.setText("Please enter a value ! ");
        }else {
            int result;
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            result = num1 * num2;
            resulttext.setText("RESULT :" + result);
        }

    }
    public void bol(View view){
        if(number1text.getText().toString().matches("") || number2text.getText().toString().matches("")){
            resulttext.setText("Please enter a value ! ");
        }else {
            int result;
            int num1 = Integer.parseInt(number1text.getText().toString());
            int num2 = Integer.parseInt(number2text.getText().toString());
            if (num2 == 0) {
                resulttext.setText("SECOND NUMBER CAN NOT BE '0' !");
            } else {
                result = num1 / num2;
                resulttext.setText("RESULT :" + result);
            }
        }

    }
}