package chap07;

import chap07.camera.Camera;
import chap07.camera.FactoryCam;
import chap07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        //자식 클래스에서 부모 클래스의 메소드를 덮어쓴다. (재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
