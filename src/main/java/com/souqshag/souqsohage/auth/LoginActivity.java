package com.souqshag.souqsohage.auth;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.souqshag.souqsohage.MainActivity;
import com.souqshag.souqsohage.R;
import com.souqshag.souqsohage.componat.NavgetionActivity;
import com.souqshag.souqsohage.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {
    //ActivityLoginBinding binding;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        binding = DataBindingUtil.setContentView(this, R.layout.);
        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, NavgetionActivity.class));
            }
        });

    }
}