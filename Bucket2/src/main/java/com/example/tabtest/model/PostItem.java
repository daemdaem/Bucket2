package com.example.tabtest.model;

import android.widget.ImageView;

public class PostItem {

    boolean isUserLike;
    int postLikeCount;

    String userName;
    String postImgUrl;
    String postText;

    int imageView;

    public PostItem(boolean isUserLike, int postLikeCount, String userName, String postImgUrl
            , String postText) {
        this.isUserLike = isUserLike;
        this.postLikeCount = postLikeCount;
        this.userName = userName;
        this.imageView = imageView;
        this.postImgUrl = postImgUrl;
        this.postText = postText;
    }

    public boolean isUserLike() {
        return isUserLike;
    }

    public int getPostLikeCount() {
        return postLikeCount;
    }

    public String getUserName() {
        return userName;
    }

    public String getPostImgUrl() {
        return postImgUrl;
    }

    public int getImageView() {
        return imageView;
    }

    public String getPostText() {
        return postText;
    }
}
