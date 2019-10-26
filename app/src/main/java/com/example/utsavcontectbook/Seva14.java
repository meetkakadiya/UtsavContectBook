package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva14 extends AppCompatActivity {

    Button s14_1,s14_2,s14_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva14);

        s14_1 = findViewById(R.id.bt_s14_1);

        s14_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9879000212"));
                startActivity(intent);
            }
        });

        s14_2 = findViewById(R.id.bt_s14_2);

        s14_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9099188111"));
                startActivity(intent);
            }
        });

        s14_3 =
                findViewById(R.id.bt_s14_3);

        s14_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:8000031919"));
                startActivity(intent);
            }
        });
        s14_3 =
                findViewById(R.id.bt_s14_3);

        s14_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9825543688"));
                startActivity(intent);
            }
        });
    }
}
