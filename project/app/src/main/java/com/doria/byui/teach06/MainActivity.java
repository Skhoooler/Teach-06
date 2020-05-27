package com.doria.byui.teach06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onEvenButtonPress(View view){
        Thread even = new Thread(new countEven());
        even.start();
    }
    public void onOddButtonPress(View view){
        Thread odd = new Thread(new OddCount());
        odd.start();
    }

}
