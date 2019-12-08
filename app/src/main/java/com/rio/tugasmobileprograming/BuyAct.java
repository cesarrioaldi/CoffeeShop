package com.rio.tugasmobileprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyAct extends AppCompatActivity {

    Button btnbeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);

        btnbeli = findViewById(R.id.btnbeli);
        btnbeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent intent = new Intent(BuyAct.this, SuksesMembeliAct.class);
              startActivity(intent);
            }
        });
    }
}
