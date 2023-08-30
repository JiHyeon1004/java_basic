package chap08;

import chap08.camera.FactoryCam;
import chap08.detector.AdvancedFireDetector;
import chap08.detector.Detectable;
import chap08.detector.FireDetector;
import chap08.reporter.NormalReporter;
import chap08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        //인터페이스는 뼈대를 제공
        //인터페이스 내에서 선언된 변수는 상수!로 저장됨 (final)
        //인터페이스 내에서 선언된 함수는 추상메소드로 저장됨
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
