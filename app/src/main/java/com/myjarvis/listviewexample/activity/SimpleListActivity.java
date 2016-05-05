package com.myjarvis.listviewexample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.myjarvis.listviewexample.R;

import java.util.ArrayList;


/*
*
* created by jarvis*/

public class SimpleListActivity extends AppCompatActivity {


    ListView mSimpleListView;
    ArrayAdapter<String> mAdapter;

    String[] daysName = new String[]{"Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday",
            "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Saturday", "Sunday"};

    final ArrayList<String> listOfDays = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mSimpleListView = (ListView) findViewById(R.id.myListView);

        for (int i = 0; i < daysName.length; i++) {

            listOfDays.add(daysName[i]);
        }


        mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listOfDays);

        mSimpleListView.setAdapter(mAdapter);


        mSimpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(SimpleListActivity.this, "Hi You CLicked" + mSimpleListView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
