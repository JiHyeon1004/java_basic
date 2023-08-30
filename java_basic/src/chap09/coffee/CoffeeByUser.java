package chap09.coffee;

import chap09.user.User;

//user, user를 상속하는 클래스의 형태만 들어올 수 있다.
public class CoffeeByUser <T extends User> {


    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }

}
