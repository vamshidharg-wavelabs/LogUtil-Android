package com.example.logutilexample;

import android.util.Log;

public class CustomClass {
    private static final String TAG = "MY_TESTING_TAGS";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
