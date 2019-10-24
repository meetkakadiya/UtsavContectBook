package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva22 extends AppCompatActivity {

    Button s22_1,s22_2, s22_3,s22_4,s22_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva22);

        s22_1 = findViewById(R.id.bt_s22_1);

        s22_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825314115"));
                startActivity(intent);
            }
        });

        s22_2 = findViewById(R.id.bt_s22_2);

        s22_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825222217"));
                startActivity(intent);
            }
        });

        s22_3 = findViewById(R.id.bt_s22_3);

        s22_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        s22_4 = findViewById(R.id.bt_s22_4);

        s22_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9320017374"));
                startActivity(intent);
            }
        });

        s22_5 = findViewById(R.id.bt_s22_5);

        s22_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825821501"));
                startActivity(intent);
            }
        });
    }
}
