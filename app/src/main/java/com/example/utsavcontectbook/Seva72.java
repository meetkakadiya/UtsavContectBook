package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva72 extends AppCompatActivity {

    Button s72_1,s72_2,s72_3,s72_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva57);

        s72_1 = findViewById(R.id.bt_s72_1);

        s72_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8000693000"));
                startActivity(intent);
            }
        });

        s72_2 = findViewById(R.id.bt_s72_2);

        s72_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9374533734"));
                startActivity(intent);
            }
        });


    }
}
