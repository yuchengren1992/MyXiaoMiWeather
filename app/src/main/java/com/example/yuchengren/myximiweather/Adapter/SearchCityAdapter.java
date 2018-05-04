package com.example.yuchengren.myximiweather.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yuchengren.myximiweather.Bean.SearchCity;
import com.example.yuchengren.myximiweather.R;

import java.util.List;

/**
 * Created by Administrator on 2018/5/4.
 */

public class SearchCityAdapter extends ArrayAdapter {
    private final int resourceId;

    public SearchCityAdapter(Context context, int listId, List<SearchCity> list){
        super(context,listId,list);
        resourceId = listId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        SearchCity searchCity = (SearchCity) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView imageView = view.findViewById(R.id.iv_search_icon);
        TextView textView = view.findViewById(R.id.tv_search_text);
        imageView.setImageResource(searchCity.getImageId());
        textView.setText(searchCity.getCity());
        return view;
    }
}
