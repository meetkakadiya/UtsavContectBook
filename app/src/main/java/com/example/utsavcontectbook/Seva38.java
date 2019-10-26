package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva38 extends AppCompatActivity {
    Button s38_1,s38_2,s38_3,s38_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva38);

        s38_1 = findViewById(R.id.bt_s38_1);

        s38_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9601290045"));
                startActivity(intent);
            }
        });

        s38_2 = findViewById(R.id.bt_s38_2);

        s38_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8000000252"));
                startActivity(intent);
            }
        });

        s38_3 = findViewById(R.id.bt_s38_3);

        s38_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8630520428"));
                startActivity(intent);
            }
        });

        s38_4 = findViewById(R.id.bt_s38_4);

        s38_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9737752355 "));
                startActivity(intent);
            }
        });
    }
}
