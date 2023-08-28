package chap07.camera;

public class SlowActionCam extends ActionCam{

    public SlowActionCam(){
        this.name = "슬로우 액션 카메라";
    }


    //자식 클래스에서 오버라이딩 할 수 없다.
    public final void makeVideo(){
        System.out.println(this.name + this.lens + " 멋진 슬로우 모드 비디오를 제작합니다.");
    }


}
