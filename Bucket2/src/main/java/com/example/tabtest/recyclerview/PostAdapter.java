package com.example.tabtest.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tabtest.R;
import com.example.tabtest.model.PostItem;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private Context mContext;
    private ArrayList<PostItem> postItems;


    public PostAdapter(Context context, ArrayList<PostItem> listItem){
        mContext= context;
        postItems = listItem;
    }
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View baseView = View.inflate(mContext, R.layout.post_item,null);
        PostViewHolder postViewHolder = new PostViewHolder(baseView, this);
        return postViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
    PostItem item = postItems.get(position);
    holder.tvUserName.setText(item.getUserName());
    holder.tvPostText.setText(item.getPostText());
    holder.tvLikeCount.setText(String.valueOf(item.getPostLikeCount()));
//    holder.ivImg.setImageResource(item.getImageView());
//    holder.ivImg.setImageURI(item.getPostImgUrl());

    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public void onLikeClicked(int position) {
        PostItem item = postItems.get(position);
        Toast.makeText(mContext, position +" : "+ item.getPostText(), Toast.LENGTH_LONG).show();
    }
}
