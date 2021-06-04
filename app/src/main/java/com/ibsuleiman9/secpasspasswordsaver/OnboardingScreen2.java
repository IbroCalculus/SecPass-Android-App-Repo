package com.ibsuleiman9.secpasspasswordsaver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnboardingScreen2 extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addFragment(new Step.Builder().setTitle("SECPASS")
                .setContent("This is a lightweight password saver application")
                .setBackgroundColor(Color.parseColor("#6200EE")) // int background color
                .setDrawable(R.drawable.onbaording_img_1) // int top drawable
                .setSummary("")
                .build());

        addFragment(new Step.Builder().setTitle("SECPASS")
                .setContent("It stores passwords for your various social media accounts.")
                .setBackgroundColor(Color.parseColor("#6200EE")) // int background color
                .setDrawable(R.drawable.onbaording_img_2) // int top drawable
                .build());

        addFragment(new Step.Builder().setTitle("SECPASS")
                .setContent("All data are saved locally on your device, please do not forget your PIN")
                .setBackgroundColor(Color.parseColor("#6200EE")) // int background color
                .setDrawable(R.drawable.onbaording_img_3) // int top drawable
                .build());
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void finishTutorial() {
        Intent intent = new Intent(getApplicationContext(), PinSetup.class);
        startActivity(intent);
    }
}