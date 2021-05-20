package com.example.hanb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button cancelButton_signUp = findViewById(R.id.cancelButton_signUp);
        Button signUpButton_signUp = findViewById(R.id.signUpButton_signUp);

        cancelButton_signUp.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        });

        signUpButton_signUp.setOnClickListener(v -> {
            Toast.makeText(SignUpActivity.this, "가입완료", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(intent);
        });
    }
}