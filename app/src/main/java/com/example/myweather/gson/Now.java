package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    //体感温度
    @SerializedName("fl")
    public String apparentTemperature;

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String info;
}
