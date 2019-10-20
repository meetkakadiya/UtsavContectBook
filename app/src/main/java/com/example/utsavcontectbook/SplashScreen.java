package com.example.utsavcontectbook;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (ContextCompat.checkSelfPermission(SplashScreen.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(SplashScreen.this, new String[]{Manifest.permission.CALL_PHONE}, 100);
                }
            }
        }, SPLASH_DISPLAY_LENGTH);
    }

    private void openHome() {
        /* Create an Intent that will start the Menu-Activity.*/
        Intent mainIntent = new Intent(SplashScreen.this, HomeActivity.class);
        SplashScreen.this.startActivity(mainIntent);
        SplashScreen.this.finish();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case 100: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    openHome();
                } else {
                    Toast.makeText(SplashScreen.this, "You have must allow to Call from the Application.", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }
}
