package com.example.akc.transition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText userName;
    EditText email;
    EditText password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        userName = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        register = findViewById(R.id.registerButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkDataEntered();
            }
        });
    }

    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }

    void checkDataEntered() {
        if (isEmpty(userName)) {
            Toast t = Toast.makeText(this, "You must enter an username!", Toast.LENGTH_SHORT);
            t.show();
        }
        if (isEmpty(password)) {
            Toast t = Toast.makeText(this, "Please enter a password", Toast.LENGTH_SHORT);
            t.show();
        }
        if (!isEmail(email)) {
            email.setError("Enter valid email!");
        }
    }
}