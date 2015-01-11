package jakhar.retroclient.model;

/**
 * Created by User on 1/11/2015.
 */
public class Weather {
    public int id;
    public String main;
    public String description;

    // default constructor, getters and setters

    public int getId(){
        return id;
    }

    public String getMain(){
        return main;
    }

    public String getDescription(){
        return description;
    }
}