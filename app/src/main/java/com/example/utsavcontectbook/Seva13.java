package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva13 extends AppCompatActivity {

    Button s13_1,s13_2,s13_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva13);

        s13_1 = findViewById(R.id.bt_s13_1);

        s13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9427242383"));
                startActivity(intent);
            }
        });

        s13_2 = findViewById(R.id.bt_s13_2);

        s13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: "));
                startActivity(intent);
            }
        });

        s13_3 =
                findViewById(R.id.bt_s13_3);

        s13_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9227600791"));
                startActivity(intent);
            }
        });
    }
}
