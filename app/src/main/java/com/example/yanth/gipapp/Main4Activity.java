package com.example.yanth.gipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Main4Activity extends AppCompatActivity {
    private String MainInt;
    private Intent intent;
    private TextView CorrectTextview;
    private TextView UsersAnswerTextview;
    private Button nextButton;
    private Integer amountOfNumbers;
    private Intent ActivateIntent;
    private TextView scoreTextview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Initialize();



        UsersAnswerTextview.setText(MainInt);
        scoreTextview.setText(amountOfNumbers.toString());
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amountOfNumbers = amountOfNumbers + 1;
                ActivateIntent.putExtra("score", amountOfNumbers);
                startActivity(ActivateIntent);


            }
        });


    }
    private void Initialize(){
        intent = getIntent();
        MainInt = intent.getStringExtra("MainInt");
        UsersAnswerTextview = findViewById(R.id.UsersTexview);
        nextButton  = findViewById(R.id.button10);
        amountOfNumbers = intent.getIntExtra("score", 0);
        ActivateIntent = new Intent(this, Main2Activity.class);
        scoreTextview = findViewById(R.id.textView8);
    }
}
