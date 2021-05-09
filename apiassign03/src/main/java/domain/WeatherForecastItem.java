package domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class WeatherForecastItem {
    Long dt;
    @SerializedName("main")
    Map<String,Float> addInfo;
    List<Map<String,Object>> weather;
    Map<String,Float> clouds;
    Map<String,Float> wind;
    Float visibility;
    Float pop;
    String dt_txt;

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Map<String, Float> getAddInfo() {
        return addInfo;
    }

    public void setAddInfo(Map<String, Float> addInfo) {
        this.addInfo = addInfo;
    }

    public List<Map<String, Object>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<String, Object>> weather) {
        this.weather = weather;
    }

    public Map<String, Float> getClouds() {
        return clouds;
    }

    public void setClouds(Map<String, Float> clouds) {
        this.clouds = clouds;
    }

    public Map<String, Float> getWind() {
        return wind;
    }

    public void setWind(Map<String, Float> wind) {
        this.wind = wind;
    }

    public Float getVisibility() {
        return visibility;
    }

    public void setVisibility(Float visibility) {
        this.visibility = visibility;
    }

    public Float getPop() {
        return pop;
    }

    public void setPop(Float pop) {
        this.pop = pop;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public void setDt_txt(String dt_txt) {
        this.dt_txt = dt_txt;
    }
}
