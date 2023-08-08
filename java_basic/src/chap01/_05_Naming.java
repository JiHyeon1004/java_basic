package chap01;

public class _05_Naming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능, 숫자로는 시작 불가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 카멜케이스로
        // 6. 예약어 사용 불가 (public, static, void, int, ...)

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "지현";
        String lastName = "정";
        String dateOfBirth = "1999-01-16";
        String residentialAddress = "호텔";
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        int accompany = 2;
        int lengthOfStay = 5;
        String item1 = "가방";
        String item2 = "시계";


        // 변수명이 중요하지 않은 경우
        int i = 0;
        String s= "";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";


    }
}
