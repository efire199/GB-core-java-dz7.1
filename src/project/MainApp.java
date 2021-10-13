package project;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import project.enums.Periods;

import java.io.IOException;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
 /*       try {
            String s = "[{\"LocalObservationDateTime\":\"2021-10-13T17:40:00+03:00\",\"EpochTime\":1634136000,\"WeatherText\":\"Cloudy\",\"WeatherIcon\":7,\"HasPrecipitation\":false,\"PrecipitationType\":null,\"IsDayTime\":false,\"Temperature\":{\"Metric\":{\"Value\":11.9,\"Unit\":\"C\",\"UnitType\":17},\"Imperial\":{\"Value\":53.0,\"Unit\":\"F\",\"UnitType\":18}},\"MobileLink\":\"http://www.accuweather.com/en/ru/moscow/294021/current-weather/294021?lang=en-us\",\"Link\":\"http://www.accuweather.com/en/ru/moscow/294021/current-weather/294021?lang=en-us\"}]\n";

            String d = "{  \"Headline\": {    \"EffectiveDate\": \"2021-10-13T13:00:00+03:00\",    \"EffectiveEpochDate\": 1634119200,    \"Severity\": 5,    \"Text\": \"Expect showers Wednesday afternoon\",    \"Category\": \"rain\",    \"EndDate\": \"2021-10-13T19:00:00+03:00\",    \"EndEpochDate\": 1634140800,    \"MobileLink\": \"http://www.accuweather.com/en/ru/saint-petersburg/295212/daily-weather-forecast/295212?lang=en-us\",    \"Link\": \"http://www.accuweather.com/en/ru/saint-petersburg/295212/daily-weather-forecast/295212?lang=en-us\"  },  \"DailyForecasts\": [    {      \"Date\": \"2021-10-13T07:00:00+03:00\",      \"EpochDate\": 1634097600,      \"Temperature\": {        \"Minimum\": {          \"Value\": 39,          \"Unit\": \"F\",          \"UnitType\": 18        },        \"Maximum\": {          \"Value\": 47,          \"Unit\": \"F\",          \"UnitType\": 18        }      },      \"Day\": {        \"Icon\": 13,        \"IconPhrase\": \"Mostly cloudy w/ showers\",        \"HasPrecipitation\": true,        \"PrecipitationType\": \"Rain\",        \"PrecipitationIntensity\": \"Light\"      },      \"Night\": {        \"Icon\": 38,        \"IconPhrase\": \"Mostly cloudy\",        \"HasPrecipitation\": false      },      \"Sources\": [        \"AccuWeather\"      ],      \"MobileLink\": \"http://www.accuweather.com/en/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=1&lang=en-us\",      \"Link\": \"http://www.accuweather.com/en/ru/saint-petersburg/295212/daily-weather-forecast/295212?day=1&lang=en-us\"    }  ]}";
            System.out.println(d);

            List<Temperature> list= ParseWeatherByDay.parse(s, Periods.NOW);
            for (Temperature t: list){
                t.print();
            }

        }catch (Exception e){
            e.getStackTrace();
        }

*/

        UserInterface userInterface = new UserInterface();
        userInterface.runApplication();


    }
}
