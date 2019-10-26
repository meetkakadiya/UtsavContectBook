package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva9 extends AppCompatActivity {

    Button s9_1,s9_2,s9_3,s9_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva9);

        s9_1 = findViewById(R.id.bt_s9_1);

        s9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"));
                startActivity(intent);
            }
        });

        s9_2 = findViewById(R.id.bt_s9_2);

        s9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9824610582"));
                startActivity(intent);
            }
        });
        s9_3 = findViewById(R.id.bt_s9_3);

        s9_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898884558"));
                startActivity(intent);
            }
        });
        s9_4 = findViewById(R.id.bt_s9_4);

        s9_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9909949911"));
                startActivity(intent);
            }
        });

    }
}
