package controller;

import model.DateModel;
import model.WeatherModel;

public class MainPageController {
  WeatherModel weatherModel;
  DateModel dateModel;

  public MainPageController() {
    weatherModel = new WeatherModel();
    dateModel = new DateModel();
  }

  public void clickNextDay() {
    weatherModel.updateWeather();
  }

  public String[] getWeathers() {
    return weatherModel.getWeathers();
  }

  public int getDate() {
    return dateModel.getDate();
  }
 }