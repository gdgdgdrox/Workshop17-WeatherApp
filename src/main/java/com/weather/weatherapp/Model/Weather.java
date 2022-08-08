package com.weather.weatherapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Weather implements Serializable{
    private String name;
    private Main main;
    //you can use SkyDescription[] weather, it works too
    private ArrayList<SkyDescription> weather;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return this.main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public ArrayList<SkyDescription> getWeather() {
        return this.weather;
    }

    public void setWeather(ArrayList<SkyDescription> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", main='" + getMain().toString() + "'" +
            ", weather='" + getWeather().toString() + "'" +
            "}";
    }



}
