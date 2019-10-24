package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva29 extends AppCompatActivity {
    Button s29_1,s29_2,s29_3,s29_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva29);
        s29_1 = findViewById(R.id.bt_s29_1);

        s29_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898884558"));
                startActivity(intent);
            }
        });

        s29_2 = findViewById(R.id.bt_s29_2);

        s29_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9601851008"));
                startActivity(intent);
            }
        });

        s29_3 = findViewById(R.id.bt_s29_3);

        s29_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9408396791"));
                startActivity(intent);
            }
        });

        s29_4 = findViewById(R.id.bt_s29_4);

        s29_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9409451008"));
                startActivity(intent);
            }
        });
    }
}
