package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva41 extends AppCompatActivity {

    Button s41_1,s41_2,s41_3,s41_4,s41_5,s41_6,s41_7,s41_8,s41_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva41);

        s41_1 = findViewById(R.id.bt_s41_1);

        s41_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        s41_2 = findViewById(R.id.bt_s41_2);

        s41_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8630520428"));
                startActivity(intent);
            }
        });

        s41_3 = findViewById(R.id.bt_s41_3);

        s41_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9712895517"));
                startActivity(intent);
            }
        });

        s41_4 = findViewById(R.id.bt_s41_4);

        s41_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9428152308"));
                startActivity(intent);
            }
        });

        s41_5 = findViewById(R.id.bt_s41_5);

        s41_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9586835656"));
                startActivity(intent);
            }
        });

        s41_6 = findViewById(R.id.bt_s41_6);

        s41_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925217737"));
                startActivity(intent);
            }
        });

        s41_7 = findViewById(R.id.bt_s41_7);

        s41_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9879688235"));
                startActivity(intent);
            }
        });

        s41_8 = findViewById(R.id.bt_s41_8);

        s41_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9726575789"));
                startActivity(intent);
            }
        });

        s41_9 = findViewById(R.id.bt_s41_9);

        s41_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8469918181"));
                startActivity(intent);
            }
        });

    }
}
