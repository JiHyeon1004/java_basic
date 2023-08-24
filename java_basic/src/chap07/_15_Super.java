package chap07;

import chap07.camera.FactoryCam;
import chap07.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        //오버라이딩 시 super를 쓰면 부모 클래스의 동작을 그대로 수행할 수 있다.


        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        speedCam.recordVideo();
    }
}
