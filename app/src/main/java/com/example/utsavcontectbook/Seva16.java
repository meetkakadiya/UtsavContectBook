package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva16 extends AppCompatActivity {

    Button s16_1,s16_2,s16_3,s16_4,s16_5,s16_6,s16_7,s16_8,s16_9,s16_10,s16_11,s16_12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva16);

        s16_1 = findViewById(R.id.bt_s16_1);

        s16_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898884558"));
                startActivity(intent);
            }
        });

        s16_2 = findViewById(R.id.bt_s16_2);

        s16_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 7203092602"));
                startActivity(intent);
            }
        });

        s16_3 = findViewById(R.id.bt_s16_3);

        s16_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9879612115"));
                startActivity(intent);
            }
        });
        s16_4 = findViewById(R.id.bt_s16_4);

        s16_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9909949911"));
                startActivity(intent);
            }
        });
        s16_5 = findViewById(R.id.bt_s16_5);

        s16_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898867388"));
                startActivity(intent);
            }
        });
        s16_6 = findViewById(R.id.bt_s16_6);

        s16_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601219602"));
                startActivity(intent);
            }
        });
        s16_7 = findViewById(R.id.bt_s16_7);

        s16_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8128686502"));
                startActivity(intent);
            }
        });
        s16_8 = findViewById(R.id.bt_s16_8);

        s16_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9909274801"));
                startActivity(intent);
            }
        });
        s16_9 = findViewById(R.id.bt_s16_9);

        s16_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9429089294"));
                startActivity(intent);
            }
        });
        s16_10 = findViewById(R.id.bt_s16_10);

        s16_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9879109719"));
                startActivity(intent);
            }
        });
        s16_11 = findViewById(R.id.bt_s16_11);

        s16_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9723177518"));
                startActivity(intent);
            }
        });
        s16_12 = findViewById(R.id.bt_s16_12);

        s16_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8460441212"));
                startActivity(intent);
            }
        });


    }
}
