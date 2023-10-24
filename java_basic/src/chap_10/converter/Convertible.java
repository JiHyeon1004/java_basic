package chap_10.converter;

//함수형 인터페이스를 이용하기 위해서는 인터페이스에 딱 하나의 메소드만 존재해야한다.
//이를 알리기 위해 어노테이션 사용 가능.

@FunctionalInterface
public interface Convertible {
    void convert(int USD);
}
