package com.example.tutorial_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText u1,p1;
    Button l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        u1 = findViewById(R.id.user);
        p1 = findViewById(R.id.pass);
        l1 = findViewById(R.id.lo1);


        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, welcome.class);
                String u = u1.getText().toString();
                i.putExtra("hello", u);
                startActivity(i);
            }
        });

    }
}