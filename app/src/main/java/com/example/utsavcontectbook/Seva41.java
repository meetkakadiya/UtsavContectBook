package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva41 extends AppCompatActivity {

    Button s41_1,s41_2,s41_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva41);

        s41_1 = findViewById(R.id.bt_s41_1);

        s41_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9825583765"));
                startActivity(intent);
            }
        });

        s41_2 = findViewById(R.id.bt_s41_2);

        s41_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 8630520428"));
                startActivity(intent);
            }
        });

        s41_3 = findViewById(R.id.bt_s41_3);

        s41_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: 9428152308"));
                startActivity(intent);
            }
        });
    }
}
