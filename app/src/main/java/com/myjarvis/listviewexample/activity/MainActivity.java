package com.myjarvis.listviewexample.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.myjarvis.listviewexample.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TextView mSipleListTextView, mCustomListTextView, mCustomListWithCheckBoxTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setSupportActionBar(toolbar);

        initializeView();

        intents();

    }

    private void initializeView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("ListView Android");
        mSipleListTextView = (TextView) findViewById(R.id.mainActivitySimpleListTextView);
        mCustomListTextView = (TextView) findViewById(R.id.mainActivityCoustomListTextView);
        mCustomListWithCheckBoxTextView = (TextView) findViewById(R.id.mainActivityCoustomListWithCheckboxTextView);
    }


    private void intents() {


        mSipleListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SimpleListActivity.class);
                startActivity(intent);

            }
        });
        mCustomListTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomListActivity.class);
                startActivity(intent);

            }
        });
        mCustomListWithCheckBoxTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomUpdatedListActivity.class);
                startActivity(intent);

            }
        });
    }
}