package com.styleway.app;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.styleway.app.models.Feed;

import java.util.ArrayList;

public class FeedCustomAdapter extends BaseAdapter {

    Context c;
    MyFeedFragment delegate;
    ArrayList<Feed> spacecrafts = new ArrayList<>();

    public FeedCustomAdapter(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {
        return spacecrafts.size();
    }

    @Override
    public Object getItem(int i) {
        return spacecrafts.get(spacecrafts.size() - i - 1);      // Existing Code Modified To Display Recent Top
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView==null)
            convertView= LayoutInflater.from(c).inflate(R.layout.feed_layout,parent,false);

        TextView feedTxt = (TextView)convertView.findViewById(R.id.feed_textview);
        ImageView feedImg = (ImageView)convertView.findViewById(R.id.feed_imageview);

        Feed s = (Feed) this.getItem(position);

        if(s.getMsg() == null || s.getMsg().isEmpty() || s.getMsg().equals("")){
            feedTxt.setVisibility(View.GONE);
        } else {
            feedTxt.setText(s.getMsg());
        }

        if(s.getImageUrl() != null){
            Glide.with(c).load(s.getImageUrl()).into(feedImg);
        } else {
            feedImg.setVisibility(View.GONE);
        }

        return convertView;
    }

}
