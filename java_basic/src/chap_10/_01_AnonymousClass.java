package chap_10;

public class _01_AnonymousClass {
    public static void main(String[] args) {
        //익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        System.out.println("-------------------------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("-------------------------------");

        //굉장히 친한 친구가 방문
        //이 친구만을 위해서 order를 재정의할 수 있다. (일회성 코드)
        //이것이 바로 익명클래스
        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스에요");
            }

            @Override
            public void returnTray() {
                System.out.println("자리에 계시면 제가 치워드릴게영^^");
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}


class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("반납 완료");
    }
}
