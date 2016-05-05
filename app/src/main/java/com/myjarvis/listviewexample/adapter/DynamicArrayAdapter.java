package com.myjarvis.listviewexample.adapter;

/**
 * Created by jarvis on 05-May-16
 * at  2:47 PM .
 */


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.myjarvis.listviewexample.R;
import com.myjarvis.listviewexample.model.Model;

import java.util.List;

public class DynamicArrayAdapter extends ArrayAdapter<Model> {

    private final List<Model> list;
    private final Context context;

    LayoutInflater layoutInflater;


    public DynamicArrayAdapter(Activity context, List<Model> list) {
        super(context, R.layout.item_row_for_updated_custom_list, list);
        this.context = context;
        this.list = list;
    }

    static class ViewHolder {
        protected TextView text;
        protected CheckBox checkbox;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = null;

        if (convertView == null) {

            layoutInflater = LayoutInflater.from(getContext());

            view = layoutInflater.inflate(R.layout.item_row_for_updated_custom_list, null);

            final ViewHolder viewHolder = new ViewHolder();

            viewHolder.text = (TextView) view.findViewById(R.id.itemRowTextView);
            viewHolder.checkbox = (CheckBox) view.findViewById(R.id.itemRowCheckBox);

            viewHolder.checkbox
                    .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                            Model element = (Model) viewHolder.checkbox.getTag();
                            element.setSelected(buttonView.isChecked());

                        }
                    });

            view.setTag(viewHolder);

            viewHolder.checkbox.setTag(list.get(position));

        } else {
            view = convertView;
            ((ViewHolder) view.getTag()).checkbox.setTag(list.get(position));
        }
        ViewHolder holder = (ViewHolder) view.getTag();
        holder.text.setText(list.get(position).getName());
        holder.checkbox.setChecked(list.get(position).isSelected());
        return view;
    }
}


