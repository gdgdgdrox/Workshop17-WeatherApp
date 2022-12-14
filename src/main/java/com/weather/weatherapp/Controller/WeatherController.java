package com.weather.weatherapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.weather.weatherapp.Model.Weather;
import com.weather.weatherapp.Repo.WeatherRepo;
import com.weather.weatherapp.Service.WeatherService;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService service;

    @Autowired
    private WeatherRepo repo;

    @GetMapping
    public String returnIndexPage(){
        return "index";
    }

    @GetMapping("/weatherdata")
    public String returnWeatherData(@RequestParam String city, Model model){
        if (repo.checkIfWeatherDataAlreadyExists(city)){
            String payload = repo.getPayloadFromRedis(city);
            Weather weather = service.createWeatherObject(payload);
            model.addAttribute("weather", weather);
            return "weatherdata";

        }
        else {
            String payload = service.getWeatherPayload(city);
            Weather weather = service.createWeatherObject(payload);
            model.addAttribute("weather", weather);
            return "weatherdata";
        }        
    }

    
}
