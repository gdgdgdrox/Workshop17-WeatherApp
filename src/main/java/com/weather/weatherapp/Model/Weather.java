package com.weather.weatherapp.Model;

import java.math.BigDecimal;

public class Weather {
    private String description;
    private String icon;
    private BigDecimal temp;
    private String city;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public BigDecimal getTemp() {
        return this.temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "{" +
            " description='" + getDescription() + "'" +
            ", icon='" + getIcon() + "'" +
            ", temp='" + getTemp() + "'" +
            ", city='" + getCity() + "'" +
            "}";
    }

    


}
