package com.example.tutorial10_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    private Toolbar toolbar;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));// set the title of the second activity, on the toolbar, to the country name
        listView= (ListView) findViewById(R.id.listView);

        //create arry adapter for the listview- must!!!
        ArrayAdapter<String> mAdapter= new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.countries));


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               //  //go to second activity
               Intent intent= new Intent(view.getContext(), SecondActivity.class);
               //set the title of the second activity, on the toolbar, to the country name
               intent.putExtra("CountryName", listView.getItemAtPosition(position).toString());
               //go to second activity
               startActivity(intent);
           }
       });

       listView.setAdapter(mAdapter);






    }
}
