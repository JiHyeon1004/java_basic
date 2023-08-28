package chap08.camera;

public abstract class Camera {
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); //추상메소드는 선언만 하고 끝낸다. 반드시 자식클래스에서 구현
}
