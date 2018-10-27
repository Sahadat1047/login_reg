package com.midproject.loginregister.activities;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.midproject.loginregister.R;

public class PrimeNumber extends AppCompatActivity {
    EditText input;
    Button Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_number);

        input=(EditText)findViewById(R.id.editText1);
        Check=(Button)findViewById(R.id.button1);

        Check.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View arg0) {
                double n = Double.parseDouble(input.getText().toString());
                int f = 0;



                for (int i = 2; i < n; i++)
                {
                    if (n % i == 0)
                        f = 1;
                }

                if (f == 0)
                {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Given Number is Prime Number",
                            Toast.LENGTH_SHORT);
                    t.show();
                }else{
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Given Number is Not a Prime Number",
                            Toast.LENGTH_SHORT);
                    t.show();

                }
            }});
    }


}







