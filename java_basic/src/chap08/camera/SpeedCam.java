package chap08.camera;

import chap08.detector.AccidentDetector;
import chap08.detector.AdvancedFireDetector;
import chap08.detector.Detectable;
import chap08.reporter.Reportable;
import chap08.reporter.VideoReporter;

public class SpeedCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }


    @Override
    public void showMainFeature() {
        System.out.println("속도 측정 + 번호 인식");
    }

    public void detect(){

        detector.detect();
    }

    public void report(){
       reporter.report();
    }
}
