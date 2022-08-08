'''
URL = https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
API_KEY = c8b73117faf676bcabee56930192a207
REDIS_PASSWORD = jF5LDrSZgohQ53V0cJFEiu8PbmmLzn4C

ICON = http://openweathermap.org/img/wn/10d@2x.png
where 10d is the icon ID

'''RESPONSE'''
{
    "coord": {
        "lon": 103.8501,
        "lat": 1.2897
    },
    "weather": [
        {
            "id": 803,
            "main": "Clouds",
            "description": "broken cl ouds",
            "icon": "04d"
        }
    ],
    "base": "stations",
    "main": {
        "temp": 302.12,
        "feels_like": 308.25,
        "temp_min": 302.07,
        "temp_max": 302.17,
        "pressure": 1009,
        "humidity": 82
    },
    "visibility": 6000,
    "wind": {
        "speed": 4.12,
        "deg": 160
    },
    "clouds": {
        "all": 75
    },
    "dt": 1659921015,
    "sys": {
        "type": 1,
        "id": 9470,
        "country": "SG",
        "sunrise": 1659913522,
        "sunset": 1659957317
    },
    "timezone": 28800,
    "id": 1880252,
    "name": "Singapore",
    "cod": 200
}

'''