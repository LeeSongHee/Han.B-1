package com.example.hanb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        /*
        RelativeLayout layout01 = (RelativeLayout) findViewById(R.id.constraintLayout_program);
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(), ProgramInfo.class);
                startActivity(intent);
            }
        };*/
    }
}