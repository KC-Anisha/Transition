package com.example.akc.transition;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // First Slide
        addFragment(new Step.Builder().setTitle("")
                .setContent("")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.img4) // int top drawable
                .setSummary("")
                .build());

        // Second Slide
        addFragment(new Step.Builder().setTitle("This is header 1")
                .setContent("This is content for the first slide")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.img1) // int top drawable
                .setSummary("This is summary")
                .build());

        // Third Slide
        addFragment(new Step.Builder().setTitle("This is header 2")
                .setContent("This is content for second slide")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.img2) // int top drawable
                .setSummary("This is summary")
                .build());

        // Fourth Slide
        addFragment(new Step.Builder().setTitle("This is header 3")
                .setContent("This is content for third slide")
                .setBackgroundColor(Color.parseColor("#FF0957")) // int background color
                .setDrawable(R.drawable.img3) // int top drawable
                .setSummary("This is summary")
                .build());
    }

    @Override
    public void finishTutorial() {
        Intent enterAppHome = new Intent(OnBoardActivity.this, HomeActivity.class);
        startActivity(enterAppHome);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }

    @Override
    public void currentFragmentPosition(int position) {
    }
}
