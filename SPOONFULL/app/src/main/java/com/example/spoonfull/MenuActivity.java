package com.example.spoonfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    Button menu1, menu2, menu3, menu4;
    TextView textview;
    ImageView userImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu1 = (Button) findViewById(R.id.menu1);
        menu2 = (Button) findViewById(R.id.menu2);
        menu3 = (Button) findViewById(R.id.menu3);
        menu4 = (Button) findViewById(R.id.menu4);
        textview = (TextView) findViewById(R.id.userNameView);
        userImg = (ImageView) findViewById(R.id.userimg);

        String username = getIntent().getStringExtra("keyname");

        textview.setText(username);
        userImg.setVisibility(View.VISIBLE);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MainActivity6.class);
                startActivity(intent);
            }
        });

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MainActivity7.class);
                startActivity(intent);
            }
        });

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MainActivity8.class);
                startActivity(intent);
            }
        });

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MainActivity9.class);
                startActivity(intent);
            }
        });
    }
}