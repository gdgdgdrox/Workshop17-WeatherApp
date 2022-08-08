package com.weather.weatherapp.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WeatherRepo {

    @Autowired
    @Qualifier("redistemp")
    private RedisTemplate<String, String> redisTemplate;

    public boolean checkIfWeatherDataAlreadyExists(String city){
        boolean exists;
        if (redisTemplate.hasKey(city)){
            exists = true;
            return exists;
        }
        exists = false;
        return exists;
    }
    public void savePayload(String city, String payload){ 
        redisTemplate.opsForValue().set(city, payload);
    }

    public String getPayloadFromRedis(String city){
        return (String) redisTemplate.opsForValue().get(city);
    }



    
}
