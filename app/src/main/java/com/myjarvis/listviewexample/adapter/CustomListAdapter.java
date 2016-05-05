package com.myjarvis.listviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myjarvis.listviewexample.R;

/**
 * Created by jarvis on 14-Apr-16
 * at  10:19 AM .
 */
public class CustomListAdapter extends ArrayAdapter<String> {

    public CustomListAdapter(Context context, String[] days) {
        super(context, R.layout.item_row, days);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View customView = layoutInflater.inflate(R.layout.item_row, parent, false);

        String dayName = getItem(position);

        ImageView itemRowImageView = (ImageView) customView.findViewById(R.id.itemRowImageView);
        TextView itemRowTextView = (TextView) customView.findViewById(R.id.itemRowTextView);

        itemRowTextView.setText(dayName);
        itemRowImageView.setImageResource(R.mipmap.ic_launcher);

        return customView;
    }


}
