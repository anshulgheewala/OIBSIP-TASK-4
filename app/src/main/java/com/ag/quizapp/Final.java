package com.ag.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final extends AppCompatActivity {
    TextView score;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        score=findViewById(R.id.score);
        button=findViewById(R.id.btn);

        getSupportActionBar().hide();
        Intent intent = getIntent();
        String s = intent.getStringExtra("key");
        score.setText("Your Total Score: "+s+"/10");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Final.this,MainActivity.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}