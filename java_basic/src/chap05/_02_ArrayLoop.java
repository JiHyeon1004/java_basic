package chap05;

import javax.sound.sampled.SourceDataLine;
import java.io.InterruptedIOException;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }

        //for each
        for(String s : coffees){
            System.out.println(s + "하나");
        }
    }
}
