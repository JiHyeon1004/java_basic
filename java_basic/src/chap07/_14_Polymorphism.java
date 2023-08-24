package chap07;

import chap07.camera.Camera;
import chap07.camera.FactoryCam;
import chap07.camera.SpeedCam;

//다형성
public class _14_Polymorphism {
    public static void main(String[] args) {
        //class Person : 사람
        //class Student extends Person : 학생 (Student is a person)
        //class Teacher extends Person : 선생님 (Teacher is a person)

        //상속 관계에서는 is-A 관계가 있다.

        Camera camera = new Camera();
        Camera factoryCam = new Camera();
        Camera speedCam = new SpeedCam();

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam:cameras) {
            cam.showMainFeature();
        }

        System.out.println("--------------");

        //모두 부모클래스로 정의했기때문에 화재감지, 체크스피드, 번호판 인식 기능을 쓸 수 없다.
        // 형변환으로 사용할 수 있다.

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recogniceLicensePlate();
        }

    }
}
