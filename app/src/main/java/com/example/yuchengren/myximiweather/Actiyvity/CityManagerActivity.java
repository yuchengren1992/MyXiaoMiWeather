package com.example.yuchengren.myximiweather.Actiyvity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.yuchengren.myximiweather.Adapter.CityManagerAdapter;
import com.example.yuchengren.myximiweather.Fragment.Fragment1;
import com.example.yuchengren.myximiweather.Fragment.Fragment2;
import com.example.yuchengren.myximiweather.Fragment.HomePageFragment;
import com.example.yuchengren.myximiweather.OnItemClickListener;
import com.example.yuchengren.myximiweather.R;

public class CityManagerActivity extends AppCompatActivity {

    private Button addButton;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_manager);
        initActionBar();
        initView();
    }

    public void initActionBar(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void initView(){
        recyclerView = findViewById(R.id.rv_city);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        CityManagerAdapter adapter = new CityManagerAdapter(3);

        adapter.setOnItemClickListener(new  OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
//                Toast.makeText(CityManagerActivity.this,"点击了Item"+position,Toast.LENGTH_SHORT).show();
                Intent intent;
                if (position == 0) {
                    intent = new Intent(CityManagerActivity.this, HomePageActivity.class);
                    intent.putExtra("id","A");
                    Log.e("id",intent.getStringExtra("id"));
                    startActivity(intent);
                    finish();
                }else if(position == 1){
                    intent = new Intent(CityManagerActivity.this,HomePageActivity.class);
                    intent.putExtra("id","B");
                    Log.e("id",intent.getStringExtra("id"));
                    startActivity(intent);
                    finish();
                }else if(position == 2){
                    intent = new Intent(CityManagerActivity.this, HomePageActivity.class);
                    intent.putExtra("id","C");
                    Log.e("id",intent.getStringExtra("id"));
                    startActivity(intent);

                }
            }
        });

        recyclerView.setAdapter(adapter);

        addButton = findViewById(R.id.bn_add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityManagerActivity.this,SearchViewDemo.class);
                startActivity(intent);
            }
        });

    }



}
