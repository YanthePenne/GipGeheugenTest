package com.example.yanth.gipapp;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    private TextView TimerValueTextview;
    private TextView RandomNumberTextview;
    private Integer TimerValueInt;
    private Integer AmountOfNumbers;
    private long  RandomNumber;
    private String TotalrandomNumber;
    private Integer Score;
    private CountDownTimer countDownTimer;
    private Random random;
    private Integer scndRandom;


    private long milliseconds;
    private boolean aBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initialize();

        if(aBoolean) {
            for (int i =0; i < AmountOfNumbers; i++)
            {
                if(TotalrandomNumber == null)
                {
                    RandomNumber = random.nextInt(10);
                    while(RandomNumber == 0)
                    {
                        RandomNumber = random.nextInt(10);
                    }
                    TotalrandomNumber = Long.toString(RandomNumber);
                }else{
                    RandomNumber = random.nextInt(10);
                    TotalrandomNumber = TotalrandomNumber + Long.toString(RandomNumber);
                }
            }

            RandomNumberTextview.setText(TotalrandomNumber);
            startTimer();
        }
    }
    public void startTimer(){
        countDownTimer = new CountDownTimer(milliseconds, 1000) {
            @Override
            public void onTick(long l) {
                milliseconds = l;
                TimerValueInt = TimerValueInt - 1;
                UpdateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
    public void UpdateTimer(){
        int seconds = (int)milliseconds / 1000;

        String tijdover;
        tijdover = "" + seconds;
        if(TimerValueInt <= 0) {
            RandomNumber = Long.parseLong(RandomNumberTextview.getText().toString());
            Intent intent = new Intent(this, Main3Activity.class);
            intent.putExtra("score", AmountOfNumbers);
            intent.putExtra("MainInt", RandomNumber);
            startActivity(intent);

        } else{
            TimerValueTextview.setText(tijdover);
        }

    }

    private void initialize(){
        AmountOfNumbers = getIntent().getIntExtra("score",0);
        TimerValueTextview = findViewById(R.id.TimeLeftTextview);
        RandomNumberTextview = findViewById(R.id.NumberDisplayTextview);
        aBoolean = getIntent().getBooleanExtra("boolean", true);
        random = new Random();
        if(AmountOfNumbers == 1)
        {
            TimerValueInt = getIntent().getIntExtra("score",0) + 1;
            milliseconds = TimerValueInt * 1000;

        }
        else{
            TimerValueInt = getIntent().getIntExtra("score",0);
            milliseconds = TimerValueInt * 1000;
        }


    }


}
