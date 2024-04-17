package controller;

import model.DateModel;
import model.WeatherModel;

public class MainPageController {
  WeatherModel weatherModel;
  DateModel dateModel;

  public MainPageController(WeatherModel weatherModel, DateModel dateModel) {
    this.weatherModel = weatherModel;
    this.dateModel = dateModel;

    // 디테일 컨트롤러 생성만!
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

 // 밭 버튼 클릭 시
// 숫자가 넘어가야겠죠?
//    -> 만약 디테일 컨트롤러의 생성자에 번호를 주면서 알아서 해! 라고 하면
//       모든 버튼 마다 컨트롤러가 만들어지는 것..
//    -> 이렇게 하면... 한 화면에 컨트롤러만 9개
//    => 디테일 컨트롤러 객체 생성 때는 생성만!
//       => 버튼이 눌리면, 디테일컨트롤러에게 숫자를 주면서 이걸로 상세 페이지 띄워줘
