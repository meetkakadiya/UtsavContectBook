package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vayvasthapan extends AppCompatActivity {

    Button btn_v1,btn_v2,btn_v3,btn_v4,btn_v5,btn_v6,btn_v7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vayvastha);

        btn_v1 = findViewById(R.id.bt_v_1);

        btn_v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9374995000"));
                startActivity(intent);
            }
        });

        btn_v2 = findViewById(R.id.bt_v_2);

        btn_v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925207502"));
                startActivity(intent);
            }
        });

        btn_v3 = findViewById(R.id.bt_v_3);

        btn_v3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290009"));
                startActivity(intent);
            }
        });

        btn_v4 = findViewById(R.id.bt_v_4);

        btn_v4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925205611"));
                startActivity(intent);
            }
        });

        btn_v5 = findViewById(R.id.bt_v_5);

        btn_v5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9979202434"));
                startActivity(intent);
            }
        });

        btn_v6 = findViewById(R.id.bt_v_6);

        btn_v6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        btn_v7 = findViewById(R.id.bt_v_7);

        btn_v7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9427242383"));
                startActivity(intent);
            }
        });
    }
}
