package com.example.utsavcontectbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seva5 extends AppCompatActivity {

    Button s5_1,s5_2,s5_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seva5);

        s5_1 = findViewById(R.id.bt_s5_1);

        s5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:9099188101"));
                startActivity(intent);
            }
        });


    }
}
