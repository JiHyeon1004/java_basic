package chap03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("java"));
        System.out.println(s1.equalsIgnoreCase("java")); //대소문자 구분 없이 확인


        //문자열 비교 심화
        s1 = "1234";
        s2 = "1234"; //s1에 저장된 정보를 참조한다.
        System.out.println(s1.equals(s2)); //내용 비교
        System.out.println(s1 == s2); //참조 비교

        //서로 다른 객체
        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        //따라서 문자열의 비교를 위해서 equals를 사용하도록 한다.

    }
}
