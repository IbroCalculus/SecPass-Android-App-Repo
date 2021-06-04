package com.ibsuleiman9.secpasspasswordsaver;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PinSetup extends AppCompatActivity {
    Button btn_PIN_Setup_Proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_setup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn_PIN_Setup_Proceed = findViewById(R.id.btn_PIN_Setup_Proceed);
        btn_PIN_Setup_Proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PinSignIn.class);
                startActivity(intent);
            }
        });
    }
}