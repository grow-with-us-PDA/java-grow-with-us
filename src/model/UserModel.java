package model;

public class UserModel {

    public String name;
    public int money;

    public UserModel() { // user 초기화

        this.money = 1500;
        System.out.println("user가 초기화 됐습니다.");
        System.out.println("현재 보유금액은 " + this.money + "원입니다.");

    }

    public void setName(String name){
        System.out.println(name);
        this.name=name;
    }


    public String getName(){
        return this.name;
    }

    public boolean setMoney(int amount) { // amount만큼 money change
        if (this.money + amount < 0) {
            System.out.println("더 이상 구매할 수 없습니다.");
            return false;
        } else {
            this.money += amount;
            System.out.println("현재 보유 금액은 " + this.money + "원입니다.");
            return true;
        }
    }

    // 자산 반환
    public int getMoney() { // 현재 보유금액 가져오기
        return this.money;
    }
}
