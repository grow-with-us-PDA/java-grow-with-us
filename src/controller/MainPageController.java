package controller;

import model.WeatherModel;

public class MainPageController {
  WeatherModel weather;

  public MainPageController() {
     weather = new WeatherModel();
  }

  public void clickNextDay() {
    weather.updateWeather();
  }


  public String[] getWeathers() {
    return weather.getWeathers();
  }
 }
