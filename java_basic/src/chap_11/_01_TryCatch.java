package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        //예외처리
        //오류 : 컴파일오류, 런타임 오류
        //에러 : 우리가 수습할 수 없는 것 , 예외 : 우리가 처리할 수 있는 것
        try {
//            System.out.println(3/0);

//            int[] arr = new int[3];
//            arr[5] = 100;

//            Object object = "test";
//            System.out.println((int) object);


        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 -> " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료.");
    }
}
