package chap06;

public class _03_Return {

    //호텔 전화번호
    public static String getPhoneNum(){
        String phoneNum = "02-1234--5678";
        return phoneNum;
    }

    //호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";
    }

    public static void main(String[] args) {
        String contactNum = getPhoneNum();
        System.out.println("호텔 전화번호  : " +contactNum);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("이렇게도 바로 할 수 있다 : " + getAddress());

    }
}
