package chap07.camera;

//자식클래스
public class SpeedCam extends Camera {

    public SpeedCam() {
//        this.name = "과속단속카메라";
        super("과속단속카메라");
    }

    //속도 체크
    public void checkSpeed(){
        System.out.println("속도를 측정합니다.");
    }

    //번호판 인식
    public void recogniceLicensePlate(){
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }

    @Override
    //동영상 녹화
    public void recordVideo(){
        super.recordVideo();
        checkSpeed();
        recogniceLicensePlate();
    }

}
