package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva58 extends AppCompatActivity {

    Button s58_1,s58_2,s58_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva58);

        s58_1 = findViewById(R.id.bt_s58_1);

        s58_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925207502"));
                startActivity(intent);
            }
        });

        s58_2 = findViewById(R.id.bt_s58_2);

        s58_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825222217 "));
                startActivity(intent);
            }
        });

        s58_3 =
                findViewById(R.id.bt_s58_3);

        s58_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:  9998217374"));
                startActivity(intent);
            }
        });
    }
}
