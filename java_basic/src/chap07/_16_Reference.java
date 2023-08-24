package chap07;

import chap07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        //참조
        //int, float, double, long, boolean ,... : 기본 자료형
        //메소드가 없다
        //기본값이 있다.
        //소문자로 시작
        int[] i = new int[5];
        System.out.println(i[0]);

        double[] doubles = new double[3];
        System.out.println(doubles[0]);

        //참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, ...
        //메소드를 가질 수 있다.
        //기본값이 null
        String[] strings = new String[4];
        System.out.println(strings[0]);

        Camera[] cameras = new Camera[3];
        System.out.println(cameras[0] == null);


        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1; //1, 2 모두 1의 값을 가리키게 된다.
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name); //고장난 카메라가 나온다.
        System.out.println(c2.name);

//        관계를 끊고 싶다면
        c2 = null;
    }


}
