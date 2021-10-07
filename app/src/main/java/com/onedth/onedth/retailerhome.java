package com.onedth.onedth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class retailerhome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailerhome);

        Button dth_button = findViewById(R.id.dth);
        Button mobile_button = findViewById(R.id.mobile);
        Button selfcare_button = findViewById(R.id.selfcare);

        dth_button.setOnClickListener(view -> {
            Intent i = new Intent(retailerhome.this,  dthhome.class);
            startActivity(i);
        });

        mobile_button.setOnClickListener(view -> {
            Intent i = new Intent(retailerhome.this,  mobilehome.class);
            startActivity(i);
        });

        selfcare_button.setOnClickListener(view -> {
            Intent i = new Intent(retailerhome.this,  selfcare.class);
            startActivity(i);
        });
    }
}