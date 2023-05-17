package com.example.deeplearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity7 extends AppCompatActivity {

    private RecyclerView categoryRV,newsRV;
    private ArrayList<CategoryRVModal> categoryRVModalArrayList;
    private ArrayList<serviceRVModal> newsRVModalArrayList;
    private CategoryRVAdapter categoryRVAdapter;
    private serviceRVAdapter newsRVAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ImageView img = findViewById(R.id.profile);
        categoryRV = findViewById(R.id.idRVCategories);
        categoryRVModalArrayList = new ArrayList<>();
        categoryRVAdapter = new CategoryRVAdapter(categoryRVModalArrayList, this, this::onCategoryClick);
        categoryRV.setAdapter(categoryRVAdapter);
        getCategories();

        newsRV = findViewById(R.id.idRVNews);
        newsRVModalArrayList = new ArrayList<>();
        newsRVAdapter = new serviceRVAdapter(newsRVModalArrayList, this,this::onClick);
        newsRV.setAdapter(newsRVAdapter);
        getServices();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity7.this, MainActivity8.class);
                startActivity(i);
            }
        });
    }

    private void getServices() {
        newsRVModalArrayList.add(new serviceRVModal("Distributed Learning","Distributed learning is a general term used to describe a multi-media method of instructional delivery that includes a mix of web-based instruction, streaming video conferencing, face-to-face classroom time."));
        newsRVModalArrayList.add(new serviceRVModal("Federated Learning","A federated learning platform is a solution designed for data science on distributed and therefore non-centralized data."));
        newsRVModalArrayList.add(new serviceRVModal("Privacy Preserving Federated Learning","Privacy Preserving Federated Learning is a cross-disciplinary technique covering multiple computer science aspects including ML, distributed computing, data privacy and security that enables end-users' devices (i.e., local nodes) to locally train a shared ML model on local data."));
        newsRVModalArrayList.add(new serviceRVModal("Supervised learning","Supervised learning teaches the machine by example. The operator provides the machine learning algorithm with a known dataset that includes desired inputs and outputs, and the algorithm must find a method to determine how to arrive at those inputs and outputs."));
        newsRVModalArrayList.add(new serviceRVModal("Reinforcement learning","Reinforcement learning focuses on regimented learning processes, where a machine learning algorithm is provided with a set of actions, parameters and end values. By defining the rules, the machine learning algorithm then tries to explore different options and possibilities."));
        newsRVAdapter.notifyDataSetChanged();
    }

    private void getCategories() {
        categoryRVModalArrayList.add(new CategoryRVModal("Vision of the company","https://images7.alphacoders.com/865/thumb-350-865098.jpg"));
        categoryRVModalArrayList.add(new CategoryRVModal("Software","https://wallpaperaccess.com/full/249943.jpg"));
        categoryRVModalArrayList.add(new CategoryRVModal("Data analysis","https://static.vecteezy.com/system/resources/thumbnails/006/970/866/small/location-icons-of-gps-navigation-global-5g-high-speed-internet-connection-and-big-data-analysis-process-background-photo.jpg"));
        categoryRVModalArrayList.add(new CategoryRVModal("Quant","https://pxl-imperialacuk.terminalfour.net/fit-in/1440x579/prod01/channel_2/media/migration/research-groups/spread--tojpeg_1466430752374_x4.jpg"));
        categoryRVModalArrayList.add(new CategoryRVModal("Finance","https://w0.peakpx.com/wallpaper/240/738/HD-wallpaper-2018-global-financial-economic-storm-design.jpg"));
        categoryRVAdapter.notifyDataSetChanged();
    }

    public void onCategoryClick(int position){

    }

    public void onClick(int position){

    }
}