package com.weather.repositories;

import com.weather.WeatherRequest;
import com.weather.reports.CurrentWeatherReport;
import org.json.*;

import java.util.HashMap;
import java.util.Map;

public class CurrentWeatherRepository extends Repository {
    public CurrentWeatherReport getCurrentWeather(WeatherRequest request) throws Exception {
        Map<String, String> params = new HashMap<String, String>();

        params.put("q", request.getCity() + "," + request.getCode());
        params.put("units", request.getUnits());

        String response = this.readUrl("/find", params);

        return new CurrentWeatherReport(new JSONObject(response));
    }
}
