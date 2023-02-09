package com.ag.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Que7 extends AppCompatActivity {
    TextView score2;
    Button opt1, opt2, opt3, opt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que7);
        score2 = findViewById(R.id.scoring);
        opt1=findViewById(R.id.option1);
        opt2=findViewById(R.id.option2);
        opt3=findViewById(R.id.option3);
        opt4=findViewById(R.id.option4);
        getSupportActionBar().hide();
        Intent intent = getIntent();
        String s = intent.getStringExtra("key");
        score2.setText(s);

        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Que7.this, "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
                opt4.setBackgroundColor(Color.GREEN);
                text();
                Thread thread=new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(3000);
                        }
                        catch (Exception e){
                            Toast.makeText(Que7.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(Que7.this,Que8.class);
                            int x=12;
                            String z=score2.getText().toString();
                            intent.putExtra("key",z);
                            startActivity(intent);
                            finish();

                        }
                    }
                };
                thread.start();
            }
        });

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Que7.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                opt1.setBackgroundColor(Color.RED);
                Vibrator vibrator=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);

                Thread thread=new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(3000);
                        }
                        catch (Exception e){
                            Toast.makeText(Que7.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(Que7.this,Que8.class);
                            String z=score2.getText().toString();
                            intent.putExtra("key",z);
                            startActivity(intent);
                            finish();

                        }
                    }
                };
                thread.start();
            }
        });

        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Que7.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                opt3.setBackgroundColor(Color.RED);
                Vibrator vibrator=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);

                Thread thread=new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(3000);
                        }
                        catch (Exception e){
                            Toast.makeText(Que7.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(Que7.this,Que8.class);
                            String z=score2.getText().toString();
                            intent.putExtra("key",z);
                            startActivity(intent);
                            finish();

                        }
                    }
                };
                thread.start();
            }
        });

        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Que7.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                opt2.setBackgroundColor(Color.RED);
                Vibrator vibrator=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);

                Thread thread=new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(3000);
                        }
                        catch (Exception e){
                            Toast.makeText(Que7.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(Que7.this,Que8.class);
                            String z=score2.getText().toString();
                            intent.putExtra("key",z);
                            startActivity(intent);
                            finish();

                        }
                    }
                };
                thread.start();
            }
        });
    }
    public void text(){
        String t=score2.getText().toString();
        int x=Integer.parseInt(t);
        int y=x+1;
        score2.setText(""+y);
    }
}