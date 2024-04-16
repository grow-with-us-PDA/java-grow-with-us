package controller;

import model.DateModel;
import model.WeatherModel;

public class MainPageController {
  WeatherModel weatherModel;
  DateModel dateModel;

  public MainPageController(WeatherModel weatherModel, DateModel dateModel) {
    this.weatherModel = weatherModel;
    this.dateModel = dateModel;
  }

  public void clickNextDay() {
    weatherModel.updateWeather();
    dateModel.updateDate();
  }

  public String[] getWeathers() {
    return weatherModel.getWeathers();
  }

  public int getDate() {
    return dateModel.getDate();
  }
 }