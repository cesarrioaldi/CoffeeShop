package com.rio.tugasmobileprograming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeAct extends AppCompatActivity {

    ImageView blackcoffe,cake,hotchocolate,coffelate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        blackcoffe=findViewById(R.id.btnblackcoffee);
        cake=findViewById(R.id.btncake);
        hotchocolate=findViewById(R.id.btnhotchocolate);
        coffelate=findViewById(R.id.btncoffeelate);

        tombol();

    }

    private void tombol() {
        blackcoffe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAct.this, BuyAct.class);
                intent.putExtra("oredran","black coffee");
                startActivity(intent);
            }
        });

        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAct.this, BuyAct.class);
                intent.putExtra("oredran","cake");
                startActivity(intent);
            }
        });

        hotchocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAct.this, BuyAct.class);
                intent.putExtra("oredran","hot chocolate");
                startActivity(intent);
            }
        });

        coffelate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeAct.this, BuyAct.class);
                intent.putExtra("oredran","coffee late");
                startActivity(intent);
            }
        });
    }
}
