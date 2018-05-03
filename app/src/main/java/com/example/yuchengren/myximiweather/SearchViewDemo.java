package com.example.yuchengren.myximiweather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

public class SearchViewDemo extends AppCompatActivity {

    private SearchView searchView;
    private ListView listView;
    private String[] number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchview);
        getSupportActionBar().hide();
        initNumber();
        initSearchView();
    }

    public void initSearchView(){
        searchView = findViewById(R.id.searchView);
        listView = findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<String>(this,R.layout.city_member_list,number));
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
                }
                return true;
            }
        });
    }

    public void initNumber(){
        for (int i = 0;i<10;i++){
            number[i]="code"+i;
        }
    }
}
