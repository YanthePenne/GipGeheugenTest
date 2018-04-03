package com.example.yanth.gipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    private String CorrectInt;
    private String UsersInt;
    private Intent gettyintent;
    private TextView CorrectTextview;
    private TextView UsersAnswerTextview;
    private Button TryAgainbutton;
    private Intent intent;
    private Integer score;
    private TextView ScoreTextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Initialize();
        CorrectTextview.setText(CorrectInt.toString());
        UsersAnswerTextview.setText(UsersInt.toString());
        score = score - 1;
        ScoreTextview.setText(score.toString());





        TryAgainbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
    }
    private void Initialize(){
        gettyintent = getIntent();
        CorrectInt = gettyintent.getStringExtra("MainInt");
        UsersInt = gettyintent.getStringExtra("UserInt");
        CorrectTextview = findViewById(R.id.UsersTexview);
        UsersAnswerTextview = findViewById(R.id.CorrectTextview);
        TryAgainbutton = findViewById(R.id.button10);
        intent = new Intent(this, MainActivity.class);
        score = gettyintent.getIntExtra("score", 0);
        ScoreTextview = findViewById(R.id.textView5);
    }
}
