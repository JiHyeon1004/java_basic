package chap06;

public class _04_ParameterAndReturn {

    public static int power(int number){
        int result = number * number;
        return result;
    }


    public static int powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(power(3));
        System.out.println(powerByExp(3,3));
    }
}
