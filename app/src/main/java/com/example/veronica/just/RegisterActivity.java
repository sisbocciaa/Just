package com.example.veronica.just;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {


    EditText email;
    EditText password;
    EditText number;
    Button registrazione;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.email_et);
        password= findViewById(R.id.password_et);
        number=findViewById(R.id.number_et);
        registrazione=findViewById(R.id.registrazione_btn);




    }
}
