package com.example.yuchengren.myximiweather.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.yuchengren.myximiweather.Fragment.Fragment1;
import com.example.yuchengren.myximiweather.Fragment.Fragment2;
import com.example.yuchengren.myximiweather.Fragment.HomePageFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/2.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

//    private List<Fragment> fragmentList = new ArrayList<>();

    public MyFragmentAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new HomePageFragment();
        }else if (position == 1){
            return new Fragment1();
        }
        return new Fragment2();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
