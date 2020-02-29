package com.example.akc.transition;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000; //Only keep logo up for some time
    private Button learnMore = findViewById(R.id.learnMoreButton); //Just giving the button a name

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        // Show logo for a bit then move on if the user doesn't want to learn more
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(StartPage.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);


        // If the user wants to learn more and clicks the learn more button - we give them
        // more info on the app
        learnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLearningMore();
            }
        });
    }

    // Start the learning more activities
    public void openLearningMore() {
        Intent startLearning = new Intent(this, FirstLearnMore.class);
        startActivity(startLearning);
    }
}
