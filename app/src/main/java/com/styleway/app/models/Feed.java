package com.styleway.app.models;

public class Feed {

    String imageUrl,msg;

    public Feed() {}


    public Feed(String imageUrl, String msg) {
        this.imageUrl = imageUrl;
        this.msg = msg;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
