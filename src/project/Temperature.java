package project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {

    private ObjectNode temperature;
    private ObjectNode day;
    private String date;
    private String min;
    private String max;
    private String now="";
    private String weatherText;
    private String weatherTextNight;


    public String getDate() {
        return date;
    }

    public ObjectNode getTemperature() {
        return temperature;
    }

    public String getMax() {
        return max;
    }

    public String getMin() {
        return min;
    }

    @JsonCreator
    public Temperature(@JsonProperty("Temperature") ObjectNode temperature, @JsonProperty("Day") ObjectNode day, @JsonProperty("Date") String date) {
        this.day = day;

       /* System.out.println(this.date);
        System.out.println(this.max);
        System.out.println(this.min);*/
    }

    public Temperature(String localObservationDateTime, String weatherText, String valueTemp) {
        this.weatherText = weatherText;
        this.date = localObservationDateTime;
        this.now = valueTemp;
        /*System.out.println(localObservationDateTime);
        System.out.println(weatherText);
        System.out.println(this.now);*/
    }


    public  void print(){
        if(!now.equals("")){
            System.out.println("В городе " + ApplicationGlobalState.getSelectedCity() + " на дату " + date + " ожидается " + weatherText + ", температура - " + now);
        }else{
            System.out.println("В городе " + ApplicationGlobalState.getSelectedCity() + " на дату " + date + " Днем погода ожидается " + weatherText + ", температура: min - " + min + " температура: max - " + max);
        }
    }


}
