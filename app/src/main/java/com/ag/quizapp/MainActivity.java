package com.ag.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button opt1,opt2,opt3,opt4;
    TextView score;
//    public static final String shared_pref="sharedprefs";
//    public static final String text="TEXT";
//    private String TEXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        opt1=findViewById(R.id.option1);
        opt2=findViewById(R.id.option2);
        opt3=findViewById(R.id.option3);
        opt4=findViewById(R.id.option4);
        score=findViewById(R.id.score);


        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
                opt3.setBackgroundColor(Color.GREEN);
                text();
                Thread thread=new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(3000);
                        }
                        catch (Exception e){
                            Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(MainActivity.this,Que2.class);
                            int x=12;
                            String z=score.getText().toString();
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
                Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
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
                            Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(MainActivity.this,Que2.class);
                            String z=score.getText().toString();
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
                Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
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
                            Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(MainActivity.this,Que2.class);
                            String z=score.getText().toString();
                            intent.putExtra("key",z);
                            startActivity(intent);
                            finish();

                        }
                    }
                };
                thread.start();
            }

        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                opt4.setBackgroundColor(Color.RED);
                Vibrator vibrator=(Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(1000);

                Thread thread=new Thread(){
                    @Override
                    public void run() {
                        try {
                            sleep(3000);
                        }
                        catch (Exception e){
                            Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                        }
                        finally {
                            Intent intent=new Intent(MainActivity.this,Que2.class);
                            String z=score.getText().toString();
                            intent.putExtra("key",z);
                            startActivity(intent);
                            finish();

                        }
                    }
                };
                thread.start();
            }
        });
//        save();
//        load();
    }

    public void text(){
        String t=score.getText().toString();
        int x=Integer.parseInt(t);
        int y=x+1;
        score.setText(""+y);
    }
//    public void save(){
//        SharedPreferences sharedPreferences=getSharedPreferences(shared_pref,MODE_PRIVATE);
//        SharedPreferences.Editor editor=sharedPreferences.edit();
//        editor.putString(text,score.getText().toString());
//        editor.apply();
//    }
//    public void load(){
//        SharedPreferences sharedPreferences= getSharedPreferences(shared_pref,MODE_PRIVATE);
//        TEXT=sharedPreferences.getString(text,"");
//        score.setText(TEXT);
//
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        save();
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        save();
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        save();
//    }
}