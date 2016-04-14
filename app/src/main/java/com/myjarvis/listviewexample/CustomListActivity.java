package com.myjarvis.listviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomListActivity extends AppCompatActivity {


    Toolbar mCustomListActivityToolbar;
    ListView mCustomListView;
    ArrayAdapter<String> mAdapter;

    String[] daysName = new String[]{"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};

    final ArrayList<String> listOfDays = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);

        initializeView();

        setSupportActionBar(mCustomListActivityToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        mAdapter = new CustomListAdapter(this, daysName);

        mCustomListView.setAdapter(mAdapter);


    }

    private void initializeView() {

        mCustomListActivityToolbar = (Toolbar) findViewById(R.id.customListActivityToolbar);
        mCustomListView = (ListView) findViewById(R.id.customListActivityListView);
    }

}
