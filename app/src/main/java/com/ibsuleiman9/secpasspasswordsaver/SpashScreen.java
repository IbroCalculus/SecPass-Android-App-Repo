package com.ibsuleiman9.secpasspasswordsaver;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SpashScreen extends AppCompatActivity {
    Animation slide_left, slide_right, slide_down, fade_in;
    ImageView splash_logo, splash_line_img1, splash_line_img2;
    TextView tv_Splash_text;
    Button btn_Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        splash_logo = findViewById(R.id.splash_logo);
        splash_line_img1 = findViewById(R.id.splash_line_img1);
        splash_line_img2 = findViewById(R.id.splash_line_img2);
        tv_Splash_text = findViewById(R.id.tv_Splash_text);
        btn_Next = findViewById(R.id.btn_Next);


        slide_left = AnimationUtils.loadAnimation(this, R.anim.slide_left);
        slide_right = AnimationUtils.loadAnimation(this, R.anim.slide_right);
        slide_down = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        splash_line_img1.setAnimation(slide_left);
        splash_line_img2.setAnimation(slide_right);
        splash_logo.setAnimation(slide_down);
        tv_Splash_text.setAnimation(fade_in);


        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OnboardingScreen2.class);
                startActivity(intent);
            }
        });


    }
}