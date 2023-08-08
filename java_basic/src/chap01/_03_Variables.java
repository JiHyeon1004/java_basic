package chap01;

import javax.sound.sampled.SourceDataLine;

public class _03_Variables {
    public static void main(String[] args) {

//        String name;
//        name = "정지현";
        String name = "정지현";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? : " + pass);


        double d = 3.14123456789; //double이 더욱 정밀하다.
        float f = 3.14123456789F; //float 변수에 넣을 때에는 실수값 뒤에 F를 붙여줘야한다.

        System.out.println(d);
        System.out.println(f);


        long l = 1000000000000L; //long 변수에 넣을 때는 값 뒤에 L을 붙여준다.
        l = 1_000_000_000_000L; //눈으로 보기 편하도록 언더바를 넣을 수도 있다.
        System.out.println(l);
    }
}
