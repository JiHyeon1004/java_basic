package chap07.camera;

//자식클래스
public class FactoryCam extends Camera{

    public FactoryCam() {
//        this.name = "공장카메라";
        super("공장카메라");
    }


    //화재 감지
    public void detectFire(){
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 화재감지");
    }

    @Override
    //동영상 녹화
    public void recordVideo(){
        super.recordVideo();
        System.out.println("화재를 감지합니다.");
    }
}
