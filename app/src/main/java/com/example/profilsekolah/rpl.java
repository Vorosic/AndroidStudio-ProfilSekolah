package com.example.profilsekolah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class rpl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpl);
    }

    @Override
    public void onBackPressed() {
        // Create an Intent to launch MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        // Add any extra data to the intent if needed
        // intent.putExtra("key", value);
        // Start the MainActivity
        startActivity(intent);

        // Finish the current activity (optional)
        finish();
    }
}