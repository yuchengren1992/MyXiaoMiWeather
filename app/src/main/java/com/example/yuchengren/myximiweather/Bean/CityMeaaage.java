package com.example.yuchengren.myximiweather.Bean;

/**
 * Created by Administrator on 2018/5/3.
 */

public class CityMeaaage {
    private int currentTem;
    private int maxTem;
    private int minTem;
    private int wet;
    private int wind;
    private String comfot;
    private String province;
    private String city;

    public CityMeaaage(int i,String ii){
        currentTem=i;
        maxTem=i;
        minTem=i;
        wet=i;
        wind=i;
        province=ii;
        city=ii;
    }

    public int getCurrentTem() {
        return currentTem;
    }

    public void setCurrentTem(int currentTem) {
        this.currentTem = currentTem;
    }

    public int getMaxTem() {
        return maxTem;
    }

    public void setMaxTem(int maxTem) {
        this.maxTem = maxTem;
    }

    public int getMinTem() {
        return minTem;
    }

    public void setMinTem(int minTem) {
        this.minTem = minTem;
    }

    public int getWet() {
        return wet;
    }

    public void setWet(int wet) {
        this.wet = wet;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getComfot() {
        return comfot;
    }

    public void setComfot(String comfot) {
        this.comfot = comfot;
    }
}
