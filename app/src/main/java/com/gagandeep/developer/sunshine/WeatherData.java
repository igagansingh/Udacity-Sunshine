package com.gagandeep.developer.sunshine;

/**
 * Created by gagandeep on 9/7/2016.
 */
public class WeatherData {
    private String cityName;
    private String temperature;

    public WeatherData(String cityName , String temperature)
    {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName()
    {
        return cityName;
    }

    public String getTemperature()
    {
        return temperature;
    }
}
