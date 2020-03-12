package com.example.whph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Aloitus sivu
 * @author Jonne
 * @version 1.4
 */
public class Start extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        button = findViewById(R.id.listClicked);
        button = findViewById(R.id.stopwatchClicked);
    }

    /**
     * Aloitus sivujen nappien toiminnat (Siirtyy uusiin aktiviteetteihin)
     * @author Jonne
     * @version 1.1
     */
    public void listClicked(View view) {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
    }

    public void stopwatchClicked(View view) {
        Intent intentStopwatch = new Intent(this, StopWatch.class);
        startActivity(intentStopwatch);
    }

    public void supportClicked(View view) {
        Intent intentSupport = new Intent(this, Support.class);
        startActivity(intentSupport);
    }
}
