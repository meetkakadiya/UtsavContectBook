package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva70 extends AppCompatActivity {

    Button s70_1,s70_2, s70_3,s70_4,s70_5,s70_6,s70_7,s70_8,s70_9,s70_10,s70_11,s70_12,s70_13,s70_14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva70);

        s70_1 = findViewById(R.id.bt_s70_1);

        s70_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9409451008"));
                startActivity(intent);
            }
        });

        s70_2 = findViewById(R.id.bt_s70_2);

        s70_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601851008"));
                startActivity(intent);
            }
        });

        s70_3 = findViewById(R.id.bt_s70_3);

        s70_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9426323400"));
                startActivity(intent);
            }
        });

        s70_4 = findViewById(R.id.bt_s70_4);

        s70_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9427852538"));
                startActivity(intent);
            }
        });

        s70_5 = findViewById(R.id.bt_s70_5);

        s70_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "));
                startActivity(intent);
            }
        });

        s70_6 = findViewById(R.id.bt_s70_6);

        s70_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9428747171 "));
                startActivity(intent);
            }
        });

        s70_7 = findViewById(R.id.bt_s70_7);

        s70_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9403673653"));
                startActivity(intent);
            }
        });

        s70_8 = findViewById(R.id.bt_s70_8);

        s70_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9924828040"));
                startActivity(intent);
            }
        });

        s70_9 = findViewById(R.id.bt_s70_9);

        s70_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9978013050"));
                startActivity(intent);
            }
        });

        s70_10 = findViewById(R.id.bt_s70_10);

        s70_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925807175"));
                startActivity(intent);
            }
        });

        s70_11 = findViewById(R.id.bt_s70_11);

        s70_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9106190450 "));
                startActivity(intent);
            }
        });

        s70_12 = findViewById(R.id.bt_s70_12);

        s70_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9662311468 "));
                startActivity(intent);
            }
        });

        s70_13 = findViewById(R.id.bt_s70_13);

        s70_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9016891825"));
                startActivity(intent);
            }
        });

        s70_14 = findViewById(R.id.bt_s70_14);

        s70_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9930557469 "));
                startActivity(intent);
            }
        });
    }
}
