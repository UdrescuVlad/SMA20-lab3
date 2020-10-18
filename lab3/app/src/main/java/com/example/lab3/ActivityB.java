package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityB extends AppCompatActivity {
    private static final String TAG_B = "ACTIVITY B";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        setTitle("B");
        Log.d(TAG_B, "onCreate B");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_B, "onResume B");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG_B, "onRestart B");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_B, "onPause B");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG_B, "onStop B");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG_B, "onDestroy B");
    }
}