package chap07;

import chap07.camera.Camera;
import chap07.camera.FactoryCam;
import chap07.camera.SpeedCam;

import java.sql.SQLOutput;

public class _12_Inheritance {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recogniceLicensePlate();

    }
}
