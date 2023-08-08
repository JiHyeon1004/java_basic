package chap01;

import java.util.function.DoublePredicate;

// 형변환
public class _07_TypeCasting {

    public static void main(String[] args) {

        // 정수형에서 실수형으로

        // 실수형에서 정수형으로
        // int score = 93 + 98.8 의 경우 문제가 발생한다.

        // int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        // float, double to int
        // 소숫점을 버림한다.
        float scoreF = 93.3F;
        double scoreD = 98.8;
        System.out.println((int) scoreF); //93
        System.out.println((int) scoreD); //98

        // 정수, 실수 연산
        score = 93 + (int)  98.8; //93 + 98
        System.out.println(score); //191

        scoreD = 93 + 98.8; //93.0 + 98.9
        System.out.println(scoreD); //191.8

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0

        // 작은 범위에서 큰 범위로 갈 때는 자동적으로 형변환이 이루어진다. (묵시적 형변환)
        // 큰 범위에서 작은 범위로 갈 때는 명시적으로 형변환을 해주어야한다.


        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); //98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8

        //올바른 데이터를 넣지 않으면 에러가 난다.
//        int error = Integer.parseInt("wkqk");




    }
}