package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    //직원이 청소를 끝낸 후에 사장이 청소를 하고 싶다.
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500); //2.5초 기다렸다가 실행해라.
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("사장" + i + "번 방 청소 중");
            try {
                Thread.sleep(1000); //1초동안 멈춰라
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("사장 청소 끝");
    }
}
