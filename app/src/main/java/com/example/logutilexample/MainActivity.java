package com.example.logutilexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.logutillib.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("LogDebug class");
        CustomClass.d("CustomClass class");
    }
}