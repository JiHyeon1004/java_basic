package chap02;

import javax.swing.*;

public class _04_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean kimchi = false;
        boolean egg = false;
        boolean meat = true;

        System.out.println(kimchi || egg || meat); //하나라도 true이면 true
        System.out.println(kimchi && egg && meat); //모두 true일 때 true

        System.out.println((5 > 3) && (3 > 1)); //true
        System.out.println((5 > 3) && (3 < 1)); //false

        System.out.println((5 > 3) || (3 > 1)); //true
        System.out.println((5 > 3) || (3 < 1)); //true
        System.out.println((5 < 3) || (3 < 1)); //false

        //논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true


    }
}
