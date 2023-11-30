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


        System.out.println("---------문자열-------");
        System.out.printf("%s%n", "Java"); //Java
        System.out.printf("%6s%n", "Java");// __Java
        System.out.printf("%-6s%n", "Java");// Java__
        System.out.printf("%6.2s%n", "Java");// ____Ja (.2를 붙이면 앞에서 두 글자만)
        System.out.printf("%-6.2s%n", "Java");// Ja____ (.2를 붙이면 앞에서 두 글자만 + 좌측)


        System.out.println("------------응용---------------");
        System.out.println("이름      영어   수학   평균"); //공백이 6, 3, 3칸
        System.out.printf("%-6s %4d %4d %6.1f %n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "채치수", 95, 100, 97.5);



    }
}
