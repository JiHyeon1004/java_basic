package chap_12;

import chap_12.clean.CleanRunnable;

public class _02_Runnable {
    public static void main(String[] args) {
        //인터페이스를 구현하여 쓰레드를 만드는 것
        //하나만 상속해야 하는 쓰레드와 달리 인터페이스는 여러 개를 구현할 수 있으므로
        //여러 개를 구현해야한다면 러너블을 쓰는 것이 좋다.

        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();


    }
    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("사장" + i + "번 방 청소 중");
        }
        System.out.println("사장 청소 끝");
    }
}
