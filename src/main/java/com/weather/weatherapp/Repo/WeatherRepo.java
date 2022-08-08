package com.weather.weatherapp.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.weather.weatherapp.Model.Weather;

@Repository
public class WeatherRepo {

    @Autowired
    @Qualifier("redistemp")
    private RedisTemplate<String, Object> redisTemplate;

    public boolean checkIfWeatherDataAlreadyExists(String city){
        boolean exists;
        if (redisTemplate.hasKey(city)){
            exists = true;
            return exists;
        }
        exists = false;
        return exists;
    }
    public void savePayload(Weather weather){ 
        redisTemplate.opsForValue().set(weather.getName(), weather);
    }

    public Weather getWeatherObjectFromRedis(String city){
        return (Weather) redisTemplate.opsForValue().get(city);
        }



    
}
