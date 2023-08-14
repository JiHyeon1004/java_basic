package chap02;

public class _05_Operator5 {
    public static void main(String[] args) {
        //삼항 연산자
        // 결과 = 조건 ? 참의 결과값 : 거짓의 결과값
        int x = 5;
        int y = 3;
        int max = (x > y) ? x : y;
        int min = (x < y) ? x : y;
        boolean b = (x == y) ? true : false;

        System.out.println(max);
        System.out.println(min);
        System.out.println(b);


        String s = (x != y) ? "달라요" : "같아요";
        System.out.println(s);

    }
}
