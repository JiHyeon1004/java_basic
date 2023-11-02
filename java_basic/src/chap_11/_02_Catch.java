package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3/0);
//
//            int[] arr = new int[3];
//            arr[5] = 100;
//
//            Object object = "test";
//            System.out.println((int) object);

            String s = null;
            System.out.println(s.toLowerCase());

        }
        //두 가지의 예외를 한 번에 처리할 수 있음
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("잘못 계산 하셨네요");
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("인덱스를 잘 못 설정했어요");
//        }
        catch (ClassCastException e){
            System.out.println("잘못된 형변환입니다.");

        }


        //생각지 못한 그 외의 에러들
        catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리돼요 -> " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료.");
    }
}
