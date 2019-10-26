package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva45 extends AppCompatActivity {

    Button s45_1,s45_2,s45_3,s45_4,s45_5,s45_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva45);

        s45_1 = findViewById(R.id.bt_s45_1);

        s45_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8141519415"));
                startActivity(intent);
            }
        });

        s45_2 = findViewById(R.id.bt_s45_2);

        s45_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9979876300"));
                startActivity(intent);
            }
        });

        s45_4 =
                findViewById(R.id.bt_s45_4);

        s45_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9033686809"));
                startActivity(intent);
            }
        });

        s45_5 =
                findViewById(R.id.bt_s45_5);

        s45_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9925233144"));
                startActivity(intent);
            }
        });
    }
}
