package com.example.logutillib;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "MY_TESTING_LOGS";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
