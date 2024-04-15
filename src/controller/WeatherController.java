package controller;

import model.Weather;

public class WeatherController {
  Weather weather;

  public WeatherController() {
     weather = new Weather();
  }

  public void updateWeathers() {
    weather.updateWeather();
  }

  public String[] getWeathers() {
    return weather.getWeathers();
  }
 }
