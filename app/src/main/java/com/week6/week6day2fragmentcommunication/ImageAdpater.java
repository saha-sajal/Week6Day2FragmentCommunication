package com.week6.week6day2fragmentcommunication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdpater extends BaseAdapter {

    Context context;
    int[] images;
    public ImageAdpater(Context context, int[] images)
    {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(context).inflate(R.layout.grid_item, null);
        ImageView img = view.findViewById(R.id.imageView);
        img.setImageResource(images[position]);

        return view;
    }
}
