package com.example.yuchengren.myximiweather.Actiyvity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.yuchengren.myximiweather.Adapter.MyFragmentAdapter;
import com.example.yuchengren.myximiweather.Fragment.HomePageFragment;
import com.example.yuchengren.myximiweather.R;

import java.util.ArrayList;
import java.util.List;

public class HomePageActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{

    private ViewPager viewPager;
    private MyFragmentAdapter myFragmentAdapter;
//    private LinearLayout linearLayout;
    private List<ImageView> viewList ;
    private int[] id ={R.id.iv_1,R.id.iv_2,R.id.iv_3};
    private ImageView cityManager;
    int fragmentId ;

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
                finish();
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
        Intent intent = getIntent();
        String value ;
        value =intent.getStringExtra("id");
        Log.e("id", value + "");
        if (value == null){
            value = "A";
        }
        Log.e("id", value + "");

        if (value.equals("A")){
            viewPager.setCurrentItem(0);
        }else if(value.equals("B")){
            viewPager.setCurrentItem(1);
        }else if(value.equals("C")){
            viewPager.setCurrentItem(2);
        }

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
