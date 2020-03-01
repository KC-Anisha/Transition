package com.example.akc.transition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button Login;
    private EditText Name;
    private EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = findViewById(R.id.loginUserName);
        Password = findViewById(R.id.loginPassword);
        Login = findViewById(R.id.enterLoginButton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String username, String password){
        if ((username.equals("Admin")) && (password.equals("123"))){
            startActivity(new Intent(LoginActivity.this, Explore.class));
        } else {
            Toast wrong = Toast.makeText(LoginActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT);
            wrong.show();
        }
    }
}
