package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ActivityC extends AppCompatActivity {
    private static final String TAG_C = "ACTIVITY C";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        setTitle("C");
        Log.d(TAG_C, "onCreate C");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG_C, "onResume C");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG_C, "onRestart C");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG_C, "onPause C");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG_C, "onStop C");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG_C, "onDestroy C");
    }
}