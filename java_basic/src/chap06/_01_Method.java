package chap06;

public class _01_Method {

    public static void sayHello(){
        System.out.println("안녕하세요 메소드입니다.");
    }



    public static void main(String[] args) {
        // 메소드는 어떤 기능을 하는 묶음
        System.out.println("메소드 호출 전");
        sayHello(); //메소드 호출
        System.out.println("메소드 호출 후");
    }
}
