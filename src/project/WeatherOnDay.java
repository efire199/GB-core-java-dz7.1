package project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)

public class WeatherOnDay {
    private Map<String,String> Headline;
    private List<Object> DailyForecasts;

    public List<Object> getDailyForecasts() {
        return DailyForecasts;
    }

    public Map<String, String> getHeadline() {
        return Headline;
    }
    @JsonSetter ("DailyForecasts")
    public void setDailyForecasts(List<Object> dailyForecasts) {
        DailyForecasts = dailyForecasts;
    }
    @JsonSetter ("Headline")
    public void setHeadline(Map<String, String> headline) {
        Headline = headline;
    }

    public WeatherOnDay() {

    }
}
