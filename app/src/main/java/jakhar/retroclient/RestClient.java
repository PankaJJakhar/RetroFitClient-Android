package jakhar.retroclient;

import com.squareup.okhttp.OkHttpClient;

import jakhar.retroclient.service.WebServiceAPI;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by User on 1/11/2015.
 */
public class RestClient {

    private static WebServiceAPI REST_CLIENT;
    private static String ROOT =
            "http://api.openweathermap.org/data/2.5";

    static {
        setupRestClient();
    }

    private RestClient() {}

    public static WebServiceAPI get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {

        RestAdapter.Builder builder = new RestAdapter.Builder();
        builder.setEndpoint(ROOT).setClient(new OkClient(new OkHttpClient())).setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(WebServiceAPI.class);
    }
}