package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva25 extends AppCompatActivity {

    Button s25_1, s25_2, s25_3,s25_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva25);

        s25_1 = findViewById(R.id.bt_s25_1);

        s25_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898884558"));
                startActivity(intent);
            }
        });

        s25_2 = findViewById(R.id.bt_s25_2);

        s25_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9909949911"));
                startActivity(intent);
            }
        });

        s25_3 = findViewById(R.id.bt_s25_3);

        s25_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9662311468"));
                startActivity(intent);
            }
        });

        s25_4 = findViewById(R.id.bt_s25_4);

        s25_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9725482872"));
                startActivity(intent);
            }
        });


    }
}
