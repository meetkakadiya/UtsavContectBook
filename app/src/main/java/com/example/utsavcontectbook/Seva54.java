package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva54 extends AppCompatActivity {

    Button s54_1,s54_2,s54_3,s54_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva54);

        s54_1 = findViewById(R.id.bt_s54_1);

        s54_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9913562020"));
                startActivity(intent);
            }
        });

        s54_2 = findViewById(R.id.bt_s54_2);

        s54_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825671155"));
                startActivity(intent);
            }
        });

        s54_3 =
                findViewById(R.id.bt_s54_3);

        s54_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9898935434"));
                startActivity(intent);
            }
        });
        s54_4 =
                findViewById(R.id.bt_s54_4);

        s54_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9824142996"));
                startActivity(intent);
            }
        });
    }
}
