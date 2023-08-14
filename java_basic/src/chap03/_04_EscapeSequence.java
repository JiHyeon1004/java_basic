package chap03;

import javax.sound.sampled.SourceDataLine;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자
        // \n \t \\ \" \'

        System.out.println("자바가\n너무\n재밌어요"); //줄바꿈
        System.out.println("해물파전\t9000원"); //탭
        System.out.println("C:\\Program Files\\Java"); //역슬래쉬
        System.out.println("단비가 \"냐용\"이라고 했어요"); //큰따음표
        System.out.println("단비가 \'냐용\'이라고 했어요"); //작은따음표

        char c = 'A';
        c = '\'';
        System.out.println(c);

    }
}
