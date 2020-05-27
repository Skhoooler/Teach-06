package com.doria.byui.teach06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

int duration = Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onEvenButtonPress(View view){
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
              countEven even = new countEven();
              even.run();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Context context = getApplicationContext();
                        CharSequence text = "Finished Evens";
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                });
            }
        });
        even.start();
    }
    public void onOddButtonPress(View view){
        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                OddCount odd = new OddCount();
                odd.run();

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Context context = getApplicationContext();
                        CharSequence text = "Finished Odds";
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                });
            }
        });
        odd.start();
    }
    }


