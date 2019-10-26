package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva26 extends AppCompatActivity {

    Button s26_1,s26_2,s26_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva26);

        s26_1 = findViewById(R.id.bt_s26_1);

        s26_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9662311468"));
                startActivity(intent);
            }
        });

        s26_2 = findViewById(R.id.bt_s26_2);

        s26_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290988"));
                startActivity(intent);
            }
        });

        s26_3 = findViewById(R.id.bt_s26_3);

        s26_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9558776347"));
                startActivity(intent);
            }
        });
    }
}
