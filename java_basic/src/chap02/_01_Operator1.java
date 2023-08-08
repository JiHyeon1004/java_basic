package chap02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(5 / 2); // 2 (나눗셈의 몫 부분)
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0 (나눗셈의 나머지 부분)
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0


        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); //10
        System.out.println(++val); //11 실행 전에 더하고 출력한다.
        System.out.println(val++); //11 출력을 실행하고 더한다.
        System.out.println(val); //12



    }
}
