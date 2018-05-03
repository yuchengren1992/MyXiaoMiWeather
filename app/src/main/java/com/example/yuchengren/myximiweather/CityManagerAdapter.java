package com.example.yuchengren.myximiweather;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Administrator on 2018/5/3.
 */

public class CityManagerAdapter extends RecyclerView.Adapter<CityManagerAdapter.MyHolder> {

    private OnItemClickListener mOnItemClickListener;
    private List<CityMeaaage> list;

    public CityManagerAdapter(int num){
        list = new ArrayList<CityMeaaage>();
        for(int m = 0;m<num;m++){
            list.add(new CityMeaaage(m,"XX"));
        }
    }

    public MyHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.city_manager_list,parent,false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    public void onBindViewHolder(final MyHolder holder,int position){
        CityMeaaage item = list.get(position);

        holder.province.setText(item.getProvince());
        holder.city.setText(item.getCity());
        holder.comfot.setText(item.getComfot());
        holder.wet.setText(item.getWet()+"");
        holder.wind.setText(item.getWind()+"");
        holder.currentTem.setText(item.getCurrentTem()+"");
        holder.maxMinTem.setText(item.getMaxTem()+"/"+item.getMinTem());
        holder.weatherIcon.setImageResource(R.mipmap.ic_launcher);

        View view =holder.relativeLayout;

        if (mOnItemClickListener != null){
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getLayoutPosition();
                    mOnItemClickListener.onItemClick(holder.relativeLayout, position);
                }
            });
        }
    }

    public int getItemCount(){
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        private ImageView weatherIcon;
        private TextView province;
        private TextView city;
        private TextView comfot;
        private TextView wet;
        private TextView wind;
        private TextView currentTem;
        private TextView maxMinTem;
        private RelativeLayout relativeLayout;


        private MyHolder(View view){
            super(view);
            weatherIcon = view.findViewById(R.id.tubiao);
            province = view.findViewById(R.id.city1);
            city = view.findViewById(R.id.city2);
            comfot = view.findViewById(R.id.kongqi);
            wet = view.findViewById(R.id.shidu);
            wind = view.findViewById(R.id.fengli);
            maxMinTem = view.findViewById(R.id.wendu);
            currentTem = view.findViewById(R.id.big_wendu);
            relativeLayout = view.findViewById(R.id.rl_holder);
        }
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener){
        mOnItemClickListener = onItemClickListener;
    }
}
