package com.android.nhom8.thuethietbidayhoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class LoginActivity extends AppCompatActivity {

    private EditText us, pw;
    private Button bntli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControls();
        addEvens();
    }

    private void addEvens() {
        bntli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dangnhap();
            }
        });
    }

    private void dangnhap() {
        String ten = "dathoang".toString();
        String matkhau ="1234".toString();
        String a = us.getText().toString();
        String b = pw.getText().toString();

        if(ten.equals(a))
        {
            if(matkhau.equals(b))
            {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        }

    }

    private void addControls() {
        us= this.<EditText>findViewById(R.id.username);
        pw= this.<EditText>findViewById(R.id.password);
        bntli= this.<Button>findViewById(R.id.bntlogin);
    }
}