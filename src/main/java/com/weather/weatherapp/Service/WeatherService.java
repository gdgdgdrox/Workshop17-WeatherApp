package com.weather.weatherapp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.weather.weatherapp.Model.Weather;
import com.weather.weatherapp.Repo.WeatherRepo;

@Service
public class WeatherService {

    private String baseURL = "https://api.openweathermap.org/data/2.5/weather";
    private final String API_KEY = System.getenv("API_KEY");

    @Autowired
    private WeatherRepo repo;
    @Autowired
    private RestTemplate restTemplate;
    
    public Weather getWeatherObject(String city){
        String fullURL = UriComponentsBuilder.fromUriString(baseURL)
        .queryParam("q", city)
        .queryParam("appid",API_KEY)
        .queryParam("units", "metric")
        .toUriString();
        Weather weather = restTemplate.getForObject(fullURL, Weather.class);
        System.out.println("WEATHER OBJECT >>>>>>>> " + weather.toString());
        repo.savePayload(weather);
        return weather;

        //alternatively, you can do restTemplate.getForEntity(fullURL, Weather.class) which 
        //returns a ResponseEntity<Weather> and then you call getBody() on the ResponseEntity
        //to get your weather object
    }
    
    // public String getWeatherPayload(String city){
    //     String fullURL = UriComponentsBuilder.fromUriString(baseURL)
    //                     .queryParam("q", city)
    //                     .queryParam("appid",API_KEY)
    //                     .queryParam("units", "metric")
    //                     .toUriString();
    //     // try getforobject
    //     ResponseEntity<String> respEntity = restTemplate.getForEntity(fullURL, String.class);
    //     String weatherInfo = respEntity.getBody();
    //     repo.savePayload(city, weatherInfo);
    //     return weatherInfo;
    //     }
    
    // public Weather createWeatherObject(String weatherInfo){
    //     Weather weather = new Weather();
    //     Reader strReader = new StringReader(weatherInfo);
    //     JsonReader jsonReader = Json.createReader(strReader);
    //     JsonObject jsonObject = jsonReader.readObject();
    //     weather.setCity(jsonObject.getString("name"));
    //     weather.setTemp
    //             (jsonObject.getJsonObject("main").getJsonNumber("temp").bigDecimalValue());
    //     JsonArray jsonArray = jsonObject.getJsonArray("weather");
    //     weather.setDescription(jsonArray.getJsonObject(0).getString("description"));
    //     weather.setIcon(jsonArray.getJsonObject(0).getString("icon"));
    //     System.out.println(weather.toString());
    //     return weather;
    // }
    
}
