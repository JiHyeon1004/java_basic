package chap_11;

import java.nio.file.Paths;

public class _03_Throw {
    //우리가 원해서 에러를 발생시킬 수 있다.
    public static void main(String[] args) {

        int age = 17; //만 17세

        try {
            if(age < 19) {
//                System.out.println("19세 미만에게는 판매하지 않습니다.");
                throw new Exception("19세 미만에게는 판매하지 않습니다.");
                //exception을 던지면 catch로 넘어간다.
            }else{
                System.out.println("주문하신 상품 여기 있습니다.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
