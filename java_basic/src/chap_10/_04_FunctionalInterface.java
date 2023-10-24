package chap_10;

import chap_10.converter.Convertible;
import chap_10.converter.KRWConverter;

//함수형 인터페이스를 이용하기 위해서는 인터페이스에 딱 하나의 메소드만 존재해야한다.
//이를 알리기 위해 어노테이션 사용 가능.

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(2);

//        convertUSD((USD) -> System.out.println(USD + "달러 = " +  (USD * 1400) + "원"), 1);

        Convertible convertible = (USD) -> System.out.println(USD + "달러 = " +  (USD * 1400) + "원");
        convertUSD(convertible, 1);

    }


    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }


}
