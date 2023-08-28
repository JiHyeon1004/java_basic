package chap08;

import chap08.camera.Camera;
import chap08.camera.FactoryCam;
import chap08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        //데이터 추상화 (필요없는 정보는 숨기고 필요한 것만 드러낸다)
        //추상 클래스 (아직 완성되지 않은 클래스)
        //추상 메소드 (추상 클래스 또는 인터페이스에서만 사용 가능한 메소드)

//        Camera camera = new Camera(); //추상클래스의 객체는 만들 수 없다.
        //추상클래스를 상속한 자식클래스는 구현할 수 있다.
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
