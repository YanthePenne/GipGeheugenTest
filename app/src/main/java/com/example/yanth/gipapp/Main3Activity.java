package com.example.yanth.gipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnDel;
    private Button btnCheck;
    private TextView textje;
    private String text;
    private Long MainInt;
    private String UserInt;
    private Intent intent;
    private Intent intent2;
    private Long checkvalue;
    private Integer AmountOfNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Initiaal();
        textje.setText("");
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = textje.getText().toString();
                textje.setText(text + "2");
            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                text = textje.getText().toString();
                textje.setText(text + "9");

            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                UserInt = textje.getText().toString();
                checkvalue = (long)UserInt.length();
                if(UserInt != "")
                {
                    if(checkvalue != 0)
                    {
                        text = textje.getText().toString();
                        text = text.substring(0, text.length() - 1);
                        textje.setText(text);
                        checkvalue = checkvalue - 1;
                    }else{

                    }
                }
                else{

                }


            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                UserInt = textje.getText().toString();
                if (UserInt != ""){
                    if (MainInt == Long.parseLong(UserInt))
                    {

                        intent.putExtra("UserInt", UserInt);
                        intent.putExtra("MainInt", MainInt.toString());
                        intent.putExtra("score", AmountOfNumbers);
                        startActivity(intent);
                    }else{

                        intent2.putExtra("UserInt", UserInt);
                        intent2.putExtra("MainInt", MainInt.toString());
                        intent2.putExtra("score", AmountOfNumbers);
                        startActivity(intent2);
                    }

                }
                else{
                    intent2.putExtra("UserInt", "0");
                    intent2.putExtra("MainInt", MainInt.toString());
                    intent2.putExtra("score", AmountOfNumbers);
                    startActivity(intent2);
                }
            }
        });
    }
    private void Initiaal()
    {
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnDel = findViewById(R.id.button_del);
        btnCheck = findViewById(R.id.button_check);
        textje = findViewById(R.id.textView);
        intent = new Intent(this, Main4Activity.class);
        intent2 = new Intent(this, Main5Activity.class);
        MainInt = getIntent().getLongExtra("MainInt", 0);
        AmountOfNumbers = getIntent().getIntExtra("score", 0);

    }
}
