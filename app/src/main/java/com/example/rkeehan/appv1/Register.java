package com.example.rkeehan.appv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        final EditText etAge = (EditText)  findViewById(R.id.etRAge);
        final EditText etUsername = (EditText)  findViewById(R.id.etRUsername);
        final EditText etPassword = (EditText)  findViewById(R.id.etRPassword);
        final EditText etGender = (EditText)  findViewById(R.id.etRGender);

        final Button bRegister = (Button)  findViewById(R.id.BRegisterComplete);
    }

}
