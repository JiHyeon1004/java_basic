package chap07;

import chap07.camera.ActionCam;
import chap07.camera.SlowActionCam;

import javax.xml.transform.SourceLocator;

public class _17_Final {
    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();


        System.out.println("-----------------");
        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

    }
}
