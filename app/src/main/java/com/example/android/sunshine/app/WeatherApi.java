package com.example.android.sunshine.app;

import com.example.android.sunshine.app.models.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

@GET("data/2.5/forecast/daily?")
    Call<WeatherData> getTasks(
        @Query("q") String q,
        @Query("mode") String mode,
        @Query("units") String units,
        @Query("cnt") String cnt,
        @Query("appid") String appid);

}
