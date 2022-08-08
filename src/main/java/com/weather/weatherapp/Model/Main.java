package com.weather.weatherapp.Model;

import java.io.Serializable;

public class Main implements Serializable{
    private String temp;
    private String pressure;
    private String humidity;


    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getPressure() {
        return this.pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }


    @Override
    public String toString() {
        return "{" +
            " temp='" + getTemp() + "'" +
            ", pressure='" + getPressure() + "'" +
            ", humidity='" + getHumidity() + "'" +
            "}";
    }


}
