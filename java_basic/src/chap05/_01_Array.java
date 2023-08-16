package chap05;

import java.util.Arrays;

public class _01_Array {
    public static void main(String[] args) {
        //배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";
        //를 배열로 만들어보자

        String[] coffees = new String[4];
        //String[] coffees = {"아메리카노", "카페모카", "라떼, "카푸치노"};
        coffees[0] = "아메리카노";
        coffees[1] = "카페모카";
        coffees[2] = "라떼";
        coffees[3] = "카푸치노";

        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
    }
}
