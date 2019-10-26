package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva34 extends AppCompatActivity {
    Button s34_1,s34_2,s34_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva34);

        s34_1 = findViewById(R.id.bt_s34_1);

        s34_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9124373141 "));
                startActivity(intent);
            }
        });

        s34_2 = findViewById(R.id.bt_s34_2);

        s34_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9426378511"));
                startActivity(intent);
            }
        });

        s34_3 = findViewById(R.id.bt_s34_3);

        s34_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825039241"));
                startActivity(intent);
            }
        });

    }
}
