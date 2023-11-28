package chap_13;

import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

public class _01_Input {
    public static void main(String[] args) {
        //사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next();
//        System.out.println("키를 입력하세요");
//        int height = sc.nextInt();
//        System.out.println("몸무게를 입력하세요");
//        double weight = sc.nextDouble();
        System.out.println("자바를 배우고 나니 기분이 어땠나요?");
        String feeling = sc.nextLine();

        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);
        System.out.println("기분 : " + feeling);
    }
}
