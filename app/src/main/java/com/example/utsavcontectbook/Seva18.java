package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva18 extends AppCompatActivity {

    Button s18_1,s18_2,s18_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva18);

        s18_1 = findViewById(R.id.bt_s18_1);

        s18_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925207502"));
                startActivity(intent);
            }
        });

        s18_2 = findViewById(R.id.bt_s18_2);

        s18_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925205611"));
                startActivity(intent);
            }
        });

        s18_3 =
                findViewById(R.id.bt_s18_3);

        s18_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9558922124"));
                startActivity(intent);
            }
        });
    }
}
