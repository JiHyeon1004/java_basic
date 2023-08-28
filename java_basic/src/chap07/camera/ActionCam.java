package chap07.camera;

import java.net.http.HttpRequest;
import java.util.function.DoubleUnaryOperator;

//클래스 상속 자체를 막으려면
// public final class로 설정하면 된다.
public class ActionCam extends Camera{

    //final
    public final String lens = "광각렌즈";

    public ActionCam() {
        super("액션 카메라");
    }

    public void makeVideo(){
        System.out.println(this.name + this.lens + " 멋진 비디오를 제작합니다.");
    }

}
