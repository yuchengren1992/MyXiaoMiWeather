package com.example.yuchengren.myximiweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;

public class HomePageActivity extends AppCompatActivity {

    private ScrollView homescrollview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        init();
    }

    private void init(){
//        homescrollview = findViewById(R.id.sc_home);
    }

}
