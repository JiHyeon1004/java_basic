package chap_12.clean;

public class CleanThread extends Thread{
    public void run(){
        System.out.println("--직원(thread) 청소 시작--");
        for (int i = 2; i <= 10 ; i+=2) {
            System.out.println("직원(thread)" + i + "번 방 청소 중");
        }
        System.out.println("직원(thread) 청소 끝");
    }

}
