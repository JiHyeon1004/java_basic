package chap05;

public class _03_MultiArray {
    public static void main(String[] args) {
        String[][] seat = new String[3][5];
        String[][] seats = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };


        System.out.println(seats[1][1]);
    }
}
