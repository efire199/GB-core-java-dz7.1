package project;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import project.enums.Periods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static project.enums.Periods.FIVE_DAYS;

public class ParseWeatherByDay {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static List<Temperature> temperatures;

    public static List<Temperature> parse(String resp,Periods periods) throws IOException {
        if (periods.equals(Periods.FIVE_DAYS)){
            try {
                JsonNode rootNode = objectMapper.readValue(resp, JsonNode.class);
                JsonNode DailyForecastsNode = rootNode.get("DailyForecasts");
                String message = DailyForecastsNode.toString();
                //List<Temperature> temp =  objectMapper.readValue(objectMapper.readValue(resp,JsonNode.class).get("DailyForecasts").toString(),new TypeReference<List<Temperature>>(){});
                temperatures = objectMapper.readValue(message, new TypeReference<List<Temperature>>() {
                });
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return temperatures;
        }else if  (periods.equals(Periods.NOW)){
            try {
                /*System.out.println(resp);*/
                temperatures =  new ArrayList<>();
                JsonNode rootNode = objectMapper.readValue(resp, JsonNode.class);
                JsonNode mainNode =  rootNode.get(0);
                String localObservationDateTime =  objectMapper.readTree(mainNode.toString()).at("/LocalObservationDateTime").toString();
                String weatherText = objectMapper.readTree(mainNode.toString()).at("/WeatherText").toString();
                String valueTemp = objectMapper.readTree(mainNode.toString()).at("/Temperature/Metric/Value").toString() ;
                temperatures.add(new Temperature(localObservationDateTime,weatherText,valueTemp));
                return temperatures;
            } catch (JsonParseException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         throw new IOException ("Нет такого периода");
    }
}
