package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva3 extends AppCompatActivity {

    Button s3_1,s3_2,s3_3,s3_4,s3_5,s3_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva3);

        s3_1 = findViewById(R.id.bt_s3_1);

        s3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        s3_2 = findViewById(R.id.bt_s3_2);

        s3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898884558"));
                startActivity(intent);
            }
        });

        s3_3 = findViewById(R.id.bt_s3_3);

        s3_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9409451008"));
                startActivity(intent);
            }
        });


        s3_4 = findViewById(R.id.bt_s3_4);

        s3_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9427242383"));
                startActivity(intent);
            }
        });


        s3_5 = findViewById(R.id.bt_s3_5);

        s3_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290525"));
                startActivity(intent);
            }
        });


        s3_6 = findViewById(R.id.bt_s3_6);

        s3_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9687893339"));
                startActivity(intent);
            }
        });
    }
}
