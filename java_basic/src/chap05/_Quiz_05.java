package chap05;

import javax.swing.*;
import java.util.function.IntPredicate;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = new int[10];
        size[0] = 250;
        for (int i = 1; i < 10; i++) {
            size[i] = size[i-1] + 5;
        }

        for (int s : size) {
            System.out.println("사이즈 " + s + " (재고 있음)");
        }
    }
}
