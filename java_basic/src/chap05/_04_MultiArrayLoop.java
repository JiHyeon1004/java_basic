package chap05;

import java.util.Arrays;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");
        String[][] seats2 = new String[10][15];
        String[] eng = {"A", "B", "C", "D", "E","F","G","H","I","J"};
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                seats2[i][j] = eng[i] + (j+1);
            }
        }

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j]);
            }
            System.out.println();
        }

    }
}
