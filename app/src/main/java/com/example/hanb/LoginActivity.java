package com.example.hanb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signUp_Login = findViewById(R.id.signUp_login);
        TextView find_Login = findViewById(R.id.find_login);
        Button signInButton = findViewById(R.id.signInButton_login);

        signUp_Login.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
            startActivity(intent);
        });

        find_Login.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FindActivity.class);
            startActivity(intent);
        });
        
        signInButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}