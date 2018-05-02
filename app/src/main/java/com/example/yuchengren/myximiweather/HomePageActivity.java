package com.example.yuchengren.myximiweather;

import android.content.Intent;
import android.media.Image;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class HomePageActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{

    private ViewPager viewPager;
    private MyFragmentAdapter myFragmentAdapter;
//    private LinearLayout linearLayout;
    private List<ImageView> viewList ;
    private int[] id ={R.id.iv_1,R.id.iv_2,R.id.iv_3};
    private ImageView cityManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().hide();
        initViewList();
        initViewPaper();
        initButton();
    }

    public void initButton(){
        cityManager =findViewById(R.id.city_manager);
        cityManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("点击了","ImageView");
                Intent intent = new Intent(HomePageActivity.this,CityManagerActivity.class);
                startActivity(intent);
            }
        });
    }

    public void initViewList(){
        viewList = new ArrayList<>();
        for (int i= 0;i<id.length;i++){
            ImageView imageView= findViewById(id[i]);
            Log.e("imageViewList","add"+id[i]);
            viewList.add(imageView);
        }
    }

    public void initViewPaper() {
        viewPager = findViewById(R.id.vp_fragment);
        myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myFragmentAdapter);
        viewPager.setOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        Log.e("position","position"+position);
        for (int i = 0;i<3;i++){
            if (position == i){
                viewList.get(i).setImageResource(0);
            }else {
                viewList.get(i).setImageResource(R.mipmap.ic_launcher);
            }
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
