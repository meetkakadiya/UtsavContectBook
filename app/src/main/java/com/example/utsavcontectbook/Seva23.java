package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva23 extends AppCompatActivity {

    Button s23_1, s23_2, s23_3,s23_4,s23_5,s23_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva23);

        s23_1 = findViewById(R.id.bt_s23_1);

        s23_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825314115"));
                startActivity(intent);
            }
        });

        s23_2 = findViewById(R.id.bt_s23_2);

        s23_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9428152308"));
                startActivity(intent);
            }
        });

        s23_3 = findViewById(R.id.bt_s23_3);

        s23_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9428594121"));
                startActivity(intent);
            }
        });
        s23_4 = findViewById(R.id.bt_s23_4);

        s23_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9925207503"));
                startActivity(intent);
            }
        });
        s23_5 = findViewById(R.id.bt_s23_5);

        s23_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9925207503"));
                startActivity(intent);
            }
        });
        s23_6 = findViewById(R.id.bt_s23_6);

        s23_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9925368719"));
                startActivity(intent);
            }
        });

    }
}
