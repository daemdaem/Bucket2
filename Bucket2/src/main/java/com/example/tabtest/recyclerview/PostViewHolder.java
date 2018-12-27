package com.example.tabtest.recyclerview;

import android.opengl.Matrix;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tabtest.R;


public class PostViewHolder extends RecyclerView.ViewHolder{ //implements View.OnClickListener {

    public CheckBox cbLike;
    public ImageView ivImg, ivLike, ivShare;
    public TextView tvLikeCount, tvUserName, tvPostText;
    private PostAdapter mAdapter;

    public PostViewHolder(@NonNull View itemView, PostAdapter postAdapter) {
        super(itemView);

        mAdapter = postAdapter;
        ivImg = itemView.findViewById(R.id.iv_img);

 /*      cbLike= itemView.findViewById(R.id.cb_like);
        ivShare = itemView.findViewById(R.id.iv_share);*/

        tvLikeCount= itemView.findViewById(R.id.tv_likecount);
        tvUserName = itemView.findViewById(R.id.tv_username);
        tvPostText = itemView.findViewById(R.id.tv_posttext);

       /* cbLike.setOnClickListener(this);
        ivShare.setOnClickListener(this);*/
    }

/*    @Override
    public void onClick(View view) {
        int position = getAdapterPosition();
        switch(view.getId()){
            case R.id.cb_like:
                mAdapter.onLikeClicked(position);
                break;
            case R.id.iv_share:
                break;
        }

    }*/
}
