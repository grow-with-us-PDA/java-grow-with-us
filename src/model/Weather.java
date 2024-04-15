package model;

import java.util.Random;

public class Weather {
  Random random = new Random();
  String[] weathers = new String[]{
      "청명함", "대체로 청명함", "한때 흐림", "실안개", "안개",
      "바람", "미풍", "흐림", "뇌우", "비",
      "호우", "이슬비", "결빙성의 진눈깨비", "눈", "폭설",
      "눈보라", "얼음비", "진눈깨비"
  };

  String todayWeather;
  String tomorrowWeather;

  public Weather() {
    todayWeather = getRandomWeather();
    tomorrowWeather = getRandomWeather();


  }

  public void updateWeather() {
    todayWeather = tomorrowWeather;
    tomorrowWeather = getRandomWeather();
  }

  public String[] getWeathers() {
    return new String[]{todayWeather, tomorrowWeather};
  }

  public String getRandomWeather() {
    int randomNumber = random.nextInt(weathers.length);
    return weathers[randomNumber];
  }
}
