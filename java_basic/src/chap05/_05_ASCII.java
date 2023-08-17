package chap05;

import javax.security.auth.callback.CallbackHandler;

public class _05_ASCII {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c);
        System.out.println((int) c);

        char c2 = 'B';
        System.out.println(c2);
        System.out.println((int) c2);

        char c3 = ++c2;
        System.out.println(c3);
        System.out.println((int) c3);


        String[][] seats = new String[10][15];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = String.valueOf((char) ('A'+i)) + (j+1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(seats[i][j]);
            }
            System.out.println();
        }
    }
}
