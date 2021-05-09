import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import domain.WeatherConditions;
import domain.WeatherForecast;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        String url = "http://api.openweathermap.org/data/2.5/weather";
        String url2 = "http://api.openweathermap.org/data/2.5/forecast";
        String charset = "UTF-8";
        System.out.println("Enter City.");
        String param1 = new Scanner(System.in).next();
        String param2 = "547202402a0e10d6fc7f1f3bd4a0109f";

        String query = String.format("q=%s&units=metric&APPID=%s",
                URLEncoder.encode(param1, charset),
                URLEncoder.encode(param2, charset));

        URLConnection connection = new URL(url + "?" + query).openConnection();
        connection.setRequestProperty("Accept-Charset", charset);
        InputStream response = connection.getInputStream();
        Gson gson = new GsonBuilder().create();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response));
        WeatherConditions info = gson.fromJson(bufferedReader, WeatherConditions.class);

        URLConnection connection2 = new URL(url2 + "?" + query).openConnection();
        connection2.setRequestProperty("Accept-Charset", charset);
        InputStream responseA = connection2.getInputStream();
        Gson gson2 = new GsonBuilder().create();
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(responseA));

        WeatherForecast infoA = gson2.fromJson(bufferedReader2, WeatherForecast.class);

        System.out.println("City\t"+info.getName());

        for(int i = 0; i<infoA.getItems().size(); i++) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Date/Hour\t" + infoA.getItems().get(i).getDt_txt());
            System.out.println("Temperature\t" + infoA.getItems().get(i).getAddInfo().get("temp"));
            System.out.println("Description\t" + infoA.getItems().get(i).getWeather().get(0).get("description"));
            System.out.println("Temperature\t" + infoA.getItems().get(i).getWind().get("speed"));
            System.out.println("--------------------------------------------------------");
        }

    }
}
