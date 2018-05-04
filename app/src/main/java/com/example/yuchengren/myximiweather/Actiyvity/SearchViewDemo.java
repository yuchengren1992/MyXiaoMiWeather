package com.example.yuchengren.myximiweather.Actiyvity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;

import android.widget.Toast;

import com.example.yuchengren.myximiweather.Adapter.HotCityAdapter;
import com.example.yuchengren.myximiweather.Adapter.SearchCityAdapter;
import com.example.yuchengren.myximiweather.Bean.SearchCity;
import com.example.yuchengren.myximiweather.R;

import java.util.ArrayList;
import java.util.List;

public class SearchViewDemo extends AppCompatActivity {

    private SearchView searchView;
    private ListView listView;
    private List<SearchCity> list = new ArrayList<SearchCity>();
    private SearchCityAdapter adapter;
//    private RecyclerView recyclerView;
//    private String[] number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchview);
        getSupportActionBar().hide();
//        initNumber();
//        initCityList();
        initSearchView();
//        initRecycleView();
    }

    public void initSearchView(){
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        adapter = new SearchCityAdapter(this,R.layout.city_search_list,list);
        listView.setAdapter(adapter);
//        listView.setTextFilterEnabled(true);
        searchView.setSubmitButtonEnabled(true); //设置搜索按钮
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(SearchViewDemo.this,"你搜索的是："+query,Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (TextUtils.isEmpty(newText)){
                    listView.clearTextFilter();
                }else {
                    listView.setFilterText(newText);
//                    adapter.getFilter().filter(newText);
                }
                return true;
            }
        });
    }

//    public void initNumber(){
//        for (int i = 0;i<10;i++){
//            number = new String[10]; //注意要将数组初始化
//            number[i]=i+"";
//        }
//    }

    public void initCityList(){
        for (int i =1;i<11;i++){
            SearchCity searchCity = new SearchCity(i+"City",R.mipmap.ic_launcher_round);
            list.add(searchCity);
        }
    }

/*
思路错了，标签不应该用recycleView
 */
//    public void initRecycleView(){
//        recyclerView = findViewById(R.id.rv_hotcity);
//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(layoutManager);
//        HotCityAdapter hotCityAdapter = new HotCityAdapter();
//        recyclerView.setAdapter(hotCityAdapter);
//
//    }
}
