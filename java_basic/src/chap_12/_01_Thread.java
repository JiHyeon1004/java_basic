package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        //일반적으로 하나의 프로세스(Process)는 하나의 쓰레드를 갖는다.
//        cleanBySelf(); //혼자하니 힘들군

        //나는 13579 청소
        //직원은 246810 청소
        CleanThread cleanThread = new CleanThread();
//        cleanThread.run(); //직원 청소 //이렇게 직접 호출하면 동시에 쓰레드로서 사용할 수 없다.
        cleanThread.start();
        cleanByBoss(); //사장님 청소
    }

    public static void cleanByBoss(){
        System.out.println("--사장 청소 시작--");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("사장" + i + "번 방 청소 중");
        }
        System.out.println("사장 청소 끝");
    }

}
