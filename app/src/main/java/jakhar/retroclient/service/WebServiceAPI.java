package jakhar.retroclient.service;

import jakhar.retroclient.model.WeatherResponse;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by User on 1/11/2015.
 */
public interface WebServiceAPI {

    @GET("/weather")
    void getWeather(@Query("q") String cityName,
                    Callback<WeatherResponse> callback);
}
