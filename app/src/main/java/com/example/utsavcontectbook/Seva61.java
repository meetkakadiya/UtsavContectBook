package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva61 extends AppCompatActivity {

    Button s61_1,s61_2,s61_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva61);

        s61_1 = findViewById(R.id.bt_s61_1);

        s61_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925207502"));
                startActivity(intent);
            }
        });

        s61_2 = findViewById(R.id.bt_s61_2);

        s61_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925205611"));
                startActivity(intent);
            }
        });

        s61_3 = findViewById(R.id.bt_s61_3);

        s61_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9558922124"));
                startActivity(intent);
            }
        });
    }
}
