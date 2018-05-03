package com.example.yuchengren.myximiweather;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
        CityManagerAdapter adapter = new CityManagerAdapter(4);

        adapter.setOnItemClickListener(new  OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(CityManagerActivity.this,"点击了Item",Toast.LENGTH_SHORT).show();
            }
        });

        recyclerView.setAdapter(adapter);

        addButton = findViewById(R.id.bn_add);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CityManagerActivity.this,AddCityActivity.class);
                startActivity(intent);
            }
        });

    }

}
