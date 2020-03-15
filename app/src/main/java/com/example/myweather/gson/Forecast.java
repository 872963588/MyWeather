package com.example.myweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    public String tmp_max;

    public String tmp_min;

    @SerializedName("cond_txt_d")
    public String day_Info;

    @SerializedName("cond_txt_n")
    public String night_Info;
}
