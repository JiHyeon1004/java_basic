package chap_12.clean;

public class Room {
    public int number = 1;

    //하나가 접근 중이면 다른 것은 이 메소드에 접근할 수 없다.
    //동기화
    synchronized public void clean(String name){
        System.out.println(name + " : " + number + "번 방 청소 중");
        number++;
    }
}
