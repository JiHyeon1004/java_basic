package chap04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 while
        //수영장에서 수영
        int distance = 25;
        int move = 0;
        while (move < distance) {
            System.out.println("발차기를 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착!");


        //무한 루프
        while (move < distance) {
            System.out.println("발차기를 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
    }
}
