package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva27 extends AppCompatActivity {

    Button s27_1,s27_2,s27_3,s27_4,s27_5,s27_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva27);

        s27_1 = findViewById(R.id.bt_s27_1);

        s27_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9898884558"));
                startActivity(intent);
            }
        });

        s27_2 = findViewById(R.id.bt_s27_2);

        s27_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9409451008"));
                startActivity(intent);
            }
        });

        s27_3 = findViewById(R.id.bt_s27_3);

        s27_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 7203092602"));
                startActivity(intent);
            }
        });

        s27_4 = findViewById(R.id.bt_s27_4);

        s27_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825243259"));
                startActivity(intent);
            }
        });

        s27_5 = findViewById(R.id.bt_s27_5);

        s27_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825821501"));
                startActivity(intent);
            }
        });

        s27_6 = findViewById(R.id.bt_s27_6);

        s27_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290525"));
                startActivity(intent);
            }
        });
    }
}
