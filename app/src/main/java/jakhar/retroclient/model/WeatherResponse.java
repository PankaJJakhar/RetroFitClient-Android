package jakhar.retroclient.model;

/**
 * Created by User on 1/11/2015.
 */
//
public class WeatherResponse {
    public int cod;
    public String base;
    public Weather main;
    public Wind wind;

    // default constructor, getters and setters

    public int getCod(){
        return cod;
    }

    public String getBase(){
        return base;
    }

    public Weather getWeather(){
        return main;
    }

    public static class Wind {
        public double speed;
        public double deg;
    }

    public Wind getWind(){
        return wind;
    }
}


