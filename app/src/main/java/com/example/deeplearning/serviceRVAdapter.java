package com.example.deeplearning;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class serviceRVAdapter extends RecyclerView.Adapter<serviceRVAdapter.ViewHolder> {

    private ArrayList<serviceRVModal> articlesArrayList;
    private Context context;
    private CategoryClickInterface categoryClickInterface;

    private Button myButton;

    public serviceRVAdapter(ArrayList<serviceRVModal> articlesArrayList, Context context, CategoryClickInterface categoryClickInterface) {
        this.articlesArrayList = articlesArrayList;
        this.context = context;
        this.categoryClickInterface = categoryClickInterface;
    }

    public serviceRVAdapter(ArrayList<serviceRVModal> articlesArrayList, Context context) {
        this.articlesArrayList = articlesArrayList;
        this.context = context;
    }

    public serviceRVAdapter(View itemView) {
        myButton = itemView.findViewById(R.id.button);
    }

    @NonNull
    @Override
    public serviceRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout2,parent,false);
        return new serviceRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull serviceRVAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        serviceRVModal articles=articlesArrayList.get(position);
        holder.heading.setText(articles.getHeading());
        holder.text.setText(articles.getText());

        holder.myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(context,MainActivity9.class);
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return articlesArrayList.size();
    }

    public interface CategoryClickInterface{
        void onCategoryClick(int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public View myButton;
        private TextView heading,text;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            heading=itemView.findViewById(R.id.heading);
            text=itemView.findViewById(R.id.text);
            myButton=itemView.findViewById(R.id.button);
        }
    }
}