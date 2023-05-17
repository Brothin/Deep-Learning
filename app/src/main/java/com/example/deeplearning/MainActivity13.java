package com.example.deeplearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        ImageView img=findViewById(R.id.imageView4);
        ImageView img2=findViewById(R.id.imageView6);
        ImageView img3=findViewById(R.id.imageView7);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(i);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity13.this, "Result Liked", Toast.LENGTH_SHORT).show();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity13.this, "Result Disliked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}