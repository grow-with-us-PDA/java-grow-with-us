package model;

public class DateModel {
    public int date;

    public DateModel() { // date 초기화
        this.date = 1;
        System.out.println("date가 1일로 초기화 됐습니다.");
    }

    public void updateDate() { // date 하루 업데이트
        this.date += 1;
        System.out.println("date가 " + this.date + "일로 업데이트 됐습니다.");
    }

    public int getDate(){ // 현재 date 반환
        return this.date;
    }
}
