package com.example.akc.transition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    //private Button signUp = (Button)findViewById(R.id.signUp);
    //private Button logIn = (Button)findViewById(R.id.logIn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.signUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SignupActivity.class));
            }
        });

        findViewById(R.id.logIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, LoginActivity.class));
            }
        });
    }
}
