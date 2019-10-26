package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva71 extends AppCompatActivity {

    Button s71_1,s71_2, s71_3,s71_4,s71_5,s71_6,s71_7,s71_8,s71_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva22);

        s71_1 = findViewById(R.id.bt_s71_1);

        s71_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9662311468"));
                startActivity(intent);
            }
        });

        s71_2 = findViewById(R.id.bt_s71_2);

        s71_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9824142996"));
                startActivity(intent);
            }
        });

        s71_3 = findViewById(R.id.bt_s71_3);

        s71_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8140761134"));
                startActivity(intent);
            }
        });

        s71_4 = findViewById(R.id.bt_s71_4);

        s71_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8511657222"));
                startActivity(intent);
            }
        });

        s71_5 = findViewById(R.id.bt_s71_5);

        s71_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601841887"));
                startActivity(intent);
            }
        });

        s71_6 = findViewById(R.id.bt_s71_6);

        s71_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9016768102"));
                startActivity(intent);
            }
        });

        s71_7 = findViewById(R.id.bt_s71_7);

        s71_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9527025147"));
                startActivity(intent);
            }
        });

        s71_8 = findViewById(R.id.bt_s71_8);

        s71_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8140665242"));
                startActivity(intent);
            }
        });


    }
}
