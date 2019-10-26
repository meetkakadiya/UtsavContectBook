package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva20 extends AppCompatActivity {

    Button s20_1,s20_2,s20_3,s20_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva20);

        s20_1 = findViewById(R.id.bt_s20_1);

        s20_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9925205611"));
                startActivity(intent);
            }
        });

        s20_2 = findViewById(R.id.bt_s20_2);

        s20_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9979202434"));
                startActivity(intent);
            }
        });
        s20_3 = findViewById(R.id.bt_s20_3);

        s20_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290016"));
                startActivity(intent);
            }
        });
        s20_4 = findViewById(R.id.bt_s20_4);

        s20_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9601290067"));
                startActivity(intent);
            }
        });


    }
}
