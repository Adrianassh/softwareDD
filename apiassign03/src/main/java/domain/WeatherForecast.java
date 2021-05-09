package domain;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

public class WeatherForecast {

    @SerializedName("list")
    List<WeatherForecastItem> items;

    Map<String,Object> city;

    public List<WeatherForecastItem> getItems() {
        return items;
    }

    public void setItems(List<WeatherForecastItem> items) {
        this.items = items;
    }

    public Map<String, Object> getCity() {
        return city;
    }

    public void setCity(Map<String, Object> city) {
        this.city = city;
    }
}
