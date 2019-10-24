package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva53 extends AppCompatActivity {

    Button s53_1,s53_2,s53_3,s53_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva53);

        s53_1 = findViewById(R.id.bt_s53_1);

        s53_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9374995000"));
                startActivity(intent);
            }
        });

        s53_2 = findViewById(R.id.bt_s53_2);

        s53_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925207502"));
                startActivity(intent);
            }
        });

        s53_3 =
                findViewById(R.id.bt_s53_3);

        s53_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9925205611"));
                startActivity(intent);
            }
        });

        s53_4 =
                findViewById(R.id.bt_s53_4);

        s53_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9979202434"));
                startActivity(intent);
            }
        });
    }
}
