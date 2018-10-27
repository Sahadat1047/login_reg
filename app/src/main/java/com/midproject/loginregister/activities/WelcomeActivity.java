package com.midproject.loginregister.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.midproject.loginregister.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button PrimeNumber;
    private Button userList;
    private Button calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        userList = (Button) findViewById(R.id.button4);
        calculator = (Button) findViewById(R.id.calculator);
        PrimeNumber = (Button) findViewById(R.id.button3);

        userList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this,UsersListActivity.class);
                startActivity(intent);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this,ScientificCal.class);
                startActivity(intent);
            }
        });
        PrimeNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this,PrimeNumber.class);
                startActivity(intent);
            }
        });
    }
}
