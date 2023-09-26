package com.example.guessnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView res;
EditText num;
Button submit,reset;
static int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res=(TextView) findViewById(R.id.res);
        num=(EditText) findViewById(R.id.num);
        submit=(Button) findViewById(R.id.guess);
        reset=(Button) findViewById(R.id.reset);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random z=new Random();
                int n=z.nextInt(100);
                a=n;
                num.setText("");
            }
        });



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num2=num.getText().toString();
                int num1=Integer.parseInt(num2);
                if(num1==a){
                    res.setText("You Guess The Right Number");
                }
                else if(num1>a){
                    res.setText("You Guess The Big Number");
                }
                else{
                        res.setText("You Guess The Small Number");
                    }
                }
        });


    }
}