package com.example.yuchengren.myximiweather.Bean;

/**
 * Created by Administrator on 2018/5/4.
 */

public class SearchCity {
    private String City;
    private int imageId;

    public SearchCity(String city,int imageId){
        this.City = city;
        this.imageId = imageId;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String hotCity) {
        this.City = hotCity;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
