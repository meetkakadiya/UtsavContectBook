package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva48 extends AppCompatActivity {

    Button s48_1,s48_2,s48_3,s48_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva48);

        s48_1 = findViewById(R.id.bt_s48_1);

        s48_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825671155"));
                startActivity(intent);
            }
        });

        s48_2 = findViewById(R.id.bt_s48_2);

        s48_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825314115"));
                startActivity(intent);
            }
        });

        s48_3 =
                findViewById(R.id.bt_s48_3);

        s48_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9320017374"));
                startActivity(intent);
            }
        });

        s48_4 =
                findViewById(R.id.bt_s48_4);

        s48_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });
    }
}
