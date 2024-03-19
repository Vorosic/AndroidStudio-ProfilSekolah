package com.example.profilsekolah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout RPL = findViewById(R.id.rpl);
        LinearLayout TKJ = findViewById(R.id.tkj);
        LinearLayout AKL = findViewById(R.id.akl);

        RPL.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, rpl.class));
                finish();
            }
        });
    }
}