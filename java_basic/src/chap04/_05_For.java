package chap04;

public class _05_For {
    public static void main(String[] args) {
        //반복문
        //나코 매장
        System.out.println("어서오세요. 나코입니다.");
        //계속 손님이 들어온다면?

        for (int i = 0; i < 10; i++) {
            System.out.println("어서오세요. 나코입니다." + i);
        }

        //짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        //홀수만 출력
        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        //거꾸로 출력
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        //1부터 10까지의 수들의 합
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
