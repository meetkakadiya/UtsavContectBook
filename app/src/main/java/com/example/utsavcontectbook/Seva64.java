package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva64 extends AppCompatActivity {

    Button  s65_1,s65_2, s65_3,s65_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva64);

        s65_1 = findViewById(R.id.bt_s64_1);

        s65_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        s65_2 = findViewById(R.id.bt_s64_2);

        s65_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9979202434"));
                startActivity(intent);
            }
        });

        s65_3 = findViewById(R.id.bt_s64_3);

        s65_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8306543926"));
                startActivity(intent);
            }
        });


    }
}
