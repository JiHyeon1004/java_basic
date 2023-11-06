package chap_12.clean;

public class CleanRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("--직원(Runnable) 청소 시작--");
        for (int i = 2; i <= 10 ; i+=2) {
            System.out.println("직원(Runnable)" + i + "번 방 청소 중");
            try {
                Thread.sleep(1000); //1초동안 멈춰라
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }

        System.out.println("직원(Runnable) 청소 끝");
    }
}
