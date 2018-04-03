package com.example.yanth.gipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private boolean bool1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClick(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("bool", true);
        intent.putExtra("score", 1);
        startActivity(intent);
    }
}
