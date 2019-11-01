package com.hillarie.amazin.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hillarie.amazin.R;
import com.hillarie.amazin.activities.KeyWordsActivity;

public class LoginActivity extends AppCompatActivity {
Button BtnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        BtnLogin=findViewById(R.id.btnLogin);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, KeyWordsActivity.class);
                startActivity(intent);
            }
        });
    }
}
