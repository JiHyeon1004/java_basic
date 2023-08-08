package chap01;

public class _06_Constants {

    //한 번 정하면 수정할 수 없는 것이 상수

    public static void main(String[] args) {

        //final을 붙이면 변수가 아닌 상수가 된다.
        final String KR_COUNTRY_CODE = "+82"; //국가 번호
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        final String DATE_OF_BIRTH = "2001-12-13";

    }

}
