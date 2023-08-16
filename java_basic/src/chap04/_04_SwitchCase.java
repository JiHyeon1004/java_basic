package chap04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        //1등 : 전액 장학금
        //2등 : 반액
        //3등 : 반액
        //그 외 : 대상 아님


        //if-else 이용
        int ranking = 2;
        if (ranking == 1) {
            System.out.println("전액");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 1");


        //switch case 이용
        switch (ranking){
            case 1:
                System.out.println("전액");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("대상 아님");
                break;
        }
        System.out.println("조회 완료 2");


        //중고상품의 등급에 따른 가격 책정
        int grade = 1;
        int price = 7000;
        switch (grade){
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }

        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

    }
}
