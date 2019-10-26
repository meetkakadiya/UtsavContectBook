package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva43 extends AppCompatActivity {

    Button s43_1,s43_2,s43_3,s43_4,s43_5,s43_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva43);

        s43_1 = findViewById(R.id.bt_s43_1);

        s43_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898884558"));
                startActivity(intent);
            }
        });

        s43_2 = findViewById(R.id.bt_s43_2);

        s43_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9879612115"));
                startActivity(intent);
            }
        });

        s43_3 =
                findViewById(R.id.bt_s43_3);

        s43_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9723177518"));
                startActivity(intent);
            }
        });

        s43_4 =
                findViewById(R.id.bt_s43_4);

        s43_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9909949911"));
                startActivity(intent);
            }
        });

        s43_5 =
                findViewById(R.id.bt_s43_5);

        s43_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9662311468"));
                startActivity(intent);
            }
        });

        s43_6 =
                findViewById(R.id.bt_s43_6);

        s43_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9913562020"));
                startActivity(intent);
            }
        });
    }
}
