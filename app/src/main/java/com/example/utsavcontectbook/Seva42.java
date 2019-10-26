package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva42 extends AppCompatActivity {

    Button s42_1,s42_2,s42_3,s42_4,s42_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva42);

        s42_1 = findViewById(R.id.bt_s42_1);

        s42_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        s42_2 = findViewById(R.id.bt_s42_2);

        s42_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601291605"));
                startActivity(intent);
            }
        });

        s42_3 =
                findViewById(R.id.bt_s42_3);

        s42_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9879976025"));
                startActivity(intent);
            }
        });

        s42_4 =
                findViewById(R.id.bt_s42_4);

        s42_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290015"));
                startActivity(intent);
            }
        });

        s42_5 =
                findViewById(R.id.bt_s42_5);

        s42_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9879484800"));
                startActivity(intent);
            }
        });
    }
}
