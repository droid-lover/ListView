package com.myjarvis.listviewexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.myjarvis.listviewexample.R;
import com.myjarvis.listviewexample.adapter.DynamicArrayAdapter;
import com.myjarvis.listviewexample.model.Model;

import java.util.ArrayList;
import java.util.List;

/*made by jarvisSachin*/

public class CustomUpdatedListActivity extends AppCompatActivity {

    ListView mCustomListWithCheckBoxActivityListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_updated_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mCustomListWithCheckBoxActivityListView = (ListView) findViewById(R.id.customListWithCheckBoxActivityListView);

        ArrayAdapter<Model> dynamicAdapter = new DynamicArrayAdapter(this, getModel());
        mCustomListWithCheckBoxActivityListView.setAdapter(dynamicAdapter);
    }

    private List<Model> getModel() {
        List<Model> list = new ArrayList<Model>();
        list.add(get("A for Apple,Android"));
        list.add(get("B for Ball"));
        list.add(get("C for Cat"));
        list.add(get("D for Dear"));
        list.add(get("E for Egg"));
        list.add(get("F for Fish and Flag"));
        list.add(get("G for Google"));
        list.add(get("H for Hero"));
        list.add(get("A for Apple,Android"));
        list.add(get("B for Ball"));
        list.add(get("C for Cat"));
        list.add(get("D for Dear"));
        list.add(get("E for Egg"));
        list.add(get("F for Fish and Flag"));
        list.add(get("G for Google"));
        list.add(get("H for Hero"));
        list.add(get("A for Apple,Android"));
        list.add(get("B for Ball"));
        list.add(get("C for Cat"));
        list.add(get("D for Dear"));
        list.add(get("E for Egg"));
        list.add(get("F for Fish and Flag"));
        list.add(get("G for Google"));
        list.add(get("H for Hero"));
        list.add(get("A for Apple,Android"));
        list.add(get("B for Ball"));
        list.add(get("C for Cat"));
        list.add(get("D for Dear"));
        list.add(get("E for Egg"));
        list.add(get("F for Fish and Flag"));
        list.add(get("G for Google"));
        list.add(get("H for Hero"));
        list.add(get("A for Apple,Android"));
        list.add(get("B for Ball"));
        list.add(get("C for Cat"));
        list.add(get("D for Dear"));
        list.add(get("E for Egg"));
        list.add(get("F for Fish and Flag"));
        list.add(get("G for Google"));
        list.add(get("H for Hero"));
        list.add(get("A for Apple,Android"));
        list.add(get("B for Ball"));
        list.add(get("C for Cat"));
        list.add(get("D for Dear"));
        list.add(get("E for Egg"));
        list.add(get("F for Fish and Flag"));
        list.add(get("G for Google"));
        list.add(get("H for Hero"));
        // Initially select one of the items
        list.get(0).setSelected(true);
        return list;
    }

    private Model get(String s) {
        return new Model(s);
    }
}
