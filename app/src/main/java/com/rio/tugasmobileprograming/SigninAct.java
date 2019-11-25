package com.rio.tugasmobileprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SigninAct extends AppCompatActivity {

    Button signinact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

    signinact=findViewById(R.id.btnsignact);
    signinact.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(SigninAct.this, HomeAct.class);
            startActivity(intent);
        }
    });
    }
}
