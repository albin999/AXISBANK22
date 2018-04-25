package com.example.faseen.axisbank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
private Button signinbtn;
private Button signupbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signinbtn =(Button)findViewById(R.id.button);
        signupbtn =(Button)findViewById(R.id.button2);

        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignin();
            }
        });

        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignup();
            }
        });
    }

    public void opensignin()
    {
        Intent intent = new Intent(this,SIGNIN.class);
        startActivity(intent);
    }

    public void opensignup()
    {
        Intent intent = new Intent(this,SIGNUP_.class);
        startActivity(intent);
    }
}
