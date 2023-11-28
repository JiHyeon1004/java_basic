package chap_13;

public class _02_Output {
    public static void main(String[] args) {
//        System.out.format();
//        System.out.printf();

        System.out.println("-------- 정수 --------");

        System.out.printf("%d%n", 5);
        System.out.printf("%d %d %d %n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); //  1234 : 6칸을 확보하고 나서 1234 출력
        System.out.printf("%06d%n", 1234);//001234 : 남은 공간을 0으로 채운다.
        System.out.printf("%6d%n", -1234);
        System.out.printf("%+6d%n", 1234); //항상 기호 표시
        System.out.printf("%,15d%n", 1000000000); //콤마 섞어서 출력
        System.out.printf("%-6d%n", 1234); //6자리 공간을 확보 후 왼쪽 정렬 1234 출력

        System.out.println("---------실수----------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI); //둘째자리까지만
        System.out.printf("%6.2f%n", Math.PI); //자리마련해서 ~~ __3.14
        System.out.printf("%-6.2f%n", Math.PI); //자리마련해서 ~~ 3.14__
        System.out.printf("%06.2f%n", Math.PI); //빈 공간을 0으로 채우기
        System.out.printf("%+06.2f%n", Math.PI); //항상 기호 표시


    }
}
