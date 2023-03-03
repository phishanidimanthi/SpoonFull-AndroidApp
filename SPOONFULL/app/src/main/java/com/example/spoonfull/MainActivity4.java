package com.example.spoonfull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private Button logingBtton;
    private EditText userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        logingBtton = (Button) findViewById(R.id.signInBtn);
        userName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);



        logingBtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = userName.getText().toString();

                Intent intent = new Intent(MainActivity4.this,MenuActivity.class);
                intent.putExtra("keyname", username);
                startActivity(intent);
            }
        });
    }
}