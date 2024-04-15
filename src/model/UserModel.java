package model;

public class UserModel {
    public DateModel dateModel;
    public int money;
    public UserModel(DateModel dateModel){ // user 초기화
        this.money = 1000;
        this.dateModel = dateModel;
        System.out.println("user가 초기화 됐습니다.");
        System.out.println("현재 보유금액은 "+this.money+"원입니다.");
        System.out.println("현재 날짜는 "+this.dateModel.getDate()+"일입니다.");
    }
}
