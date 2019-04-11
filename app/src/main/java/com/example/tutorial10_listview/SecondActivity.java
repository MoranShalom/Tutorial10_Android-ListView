package com.example.tutorial10_listview;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    private Toolbar toolbar2;
    private ImageView flag;



    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.second_activity);


        toolbar2= (Toolbar) findViewById(R.id.toolbar2);
        flag= (ImageView) findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();

        if( bundle != null){
            toolbar2.setTitle(bundle.getString("CountryName"));
            if(toolbar2.getTitle().toString().equalsIgnoreCase("Israel")){
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                        R.drawable.flage_israel));

            } else{
                flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,
                        R.drawable.ic_launcher_background));
            }
        }
    }

}