package com.doria.byui.teach06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Context context = getApplicationContext();
int duration = Toast.LENGTH_SHORT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onEvenButtonPress(View view){
        Thread even = new Thread(new countEven());
        even.start();
        /*runOnUiThread(new Runnable() {
            @Override
            public void run() {
                CharSequence text = "Finished Evens";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });*/
    }
    public void onOddButtonPress(View view){
        Thread odd = new Thread(new OddCount());
        odd.start();
        /*runOnUiThread(new Runnable() {
            @Override
            public void run() {
                CharSequence text = "Finished Odds";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });*/
    }

}
