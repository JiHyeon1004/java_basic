package chap09;

import chap09.coffee.*;
import chap09.user.User;
import chap09.user.VIPUser;

import java.util.UUID;

public class _02_GenericClass {
    public static void main(String[] args) {

        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("유재석");
        c2.ready();

        System.out.println("------------------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready();

        System.out.println("-------------------------------");

        int c3Name = (int) c3.name; //c3.name이 object이기 때문에 int로 형변환해줘야한다.
        System.out.println("주문 고객 번호 : " + c3Name);

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 번호 : " + c4Name);

        System.out.println("-------------------------------");

        //generic class 사용

        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name; //형변환 필요 없음
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("-------------------------------");

        //원하는 객체의 형태만 받을 수도 있음
        //<T extends User>

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("서장훈"));
        c8.ready();


        System.out.println("-----------------------------------");
        
        //두 개 이상의 데이터를 한꺼번에 처리
        
        orderCoffee("김영철");
        orderCoffee(36);

        orderCoffee("김희철", "아메리카노");
        orderCoffee("37", "라떼");
    }


    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + " 준비 완료 : " + name);
    }


}
