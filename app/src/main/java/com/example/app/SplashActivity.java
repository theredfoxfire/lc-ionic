package com.example.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // langsung pindah ke MainActivity atau activity lain
        // begitu memasuki splash screen ini
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
