package chap07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        //패키지는 폴더 구조라고 생각하면 됨
        //랜덤클래스
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 :" + random.nextInt(10)); //0이상 10미만의 정수형 반환
        System.out.println("랜덤 실수 : " + random.nextDouble()); //0.0 이상 1.0미만의 실수값 (double은 범위지정불가)


        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 범위 : " + (min + (max-min) * random.nextDouble())); //범위 지정하고싶다면

        System.out.println("랜덤 불리안 : " + random.nextBoolean());


        //로또 번호를 랜덤으로 뽑으려면? 1 ~45
        System.out.println("로또 번호 : " + (random.nextInt(45) + 1));

    }
}
