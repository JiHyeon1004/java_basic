package chap04;

public class _11_Continue {
    public static void main(String[] args) {
        //치킨 주문 손님 중 노쇼
        //for
        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            //noShow
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }


        System.out.println("----------------------------------");


        //while
        sold = 0;
        int idx = 0;
        while (idx < 50) {
            idx++;

            System.out.println(idx+"번 손님, 주문하신 치킨 나왔습니다.");

            if (idx == noShow) {
                System.out.println(idx+"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
    }
}
