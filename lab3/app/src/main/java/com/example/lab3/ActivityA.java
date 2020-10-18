package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityA extends AppCompatActivity {
    private static final String TAG_A = "ACTIVITY A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        setTitle("A");
        Log.d(TAG_A, "onCreate A");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_A, "onResume A");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG_A, "onRestart A");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_A, "onPause A");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG_A, "onStop A");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG_A, "onDestroy A");
    }
}