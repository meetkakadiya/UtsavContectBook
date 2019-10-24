package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva30 extends AppCompatActivity {
    Button s30_1,s30_2,s30_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva30);
        s30_1 = findViewById(R.id.bt_s30_1);

        s30_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9824610582"));
                startActivity(intent);
            }
        });

        s30_2 = findViewById(R.id.bt_s30_2);

        s30_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8469007877"));
                startActivity(intent);
            }
        });

        s30_3 = findViewById(R.id.bt_s30_3);

        s30_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8999066032"));
                startActivity(intent);
            }
        });
    }
}
