package chap04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 do while
        int distance = 25;
        int move = 0;
        int height = 25; //키가 25m

        //Do while은 먼저 실행하고 조건을 본다.
        do{
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재 이동 거리 : " + move);
            move+=3;
        }while (move + height < distance);

        System.out.println("도착했습니다.");
    }
}
