package com.example.deeplearning;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewsDetailActivity extends AppCompatActivity {

    String title,desc,content,imageURL,url;
    private TextView heading,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        title=getIntent().getStringExtra("title");
        desc=getIntent().getStringExtra("desc");
        content=getIntent().getStringExtra("content");
        imageURL=getIntent().getStringExtra("image");
        url=getIntent().getStringExtra("url");
        title=getIntent().getStringExtra("title");
        desc=getIntent().getStringExtra("desc");
        content=getIntent().getStringExtra("content");
        imageURL=getIntent().getStringExtra("image");
        url=getIntent().getStringExtra("url");
        heading=findViewById(R.id.heading);
        text=findViewById(R.id.text);
        heading.setText(title);
        text.setText(desc);
    }
}
