package com.example.yuchengren.myximiweather.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yuchengren.myximiweather.R;

/**
 * Created by Administrator on 2018/5/4.
 */

public class HotCityAdapter extends RecyclerView.Adapter<HotCityAdapter.HotCityHolder> {

    private String[] city =new String[]{"北京","上海","成都","杭州","苏州","内蒙古","西安","重庆","南京","广州","无锡"};

    public HotCityHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hot_city_list,parent,false);
        HotCityHolder holder = new HotCityHolder(view);
        return holder;
    }

    public void onBindViewHolder( HotCityHolder holder, int position) {

        holder.textView.setText(city[position]);
    }

    public int getItemCount() {
        return city.length;
    }

    class HotCityHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        private HotCityHolder(View view){

            super(view);
            textView = view.findViewById(R.id.tv_hotcity);

        }

    }
}
