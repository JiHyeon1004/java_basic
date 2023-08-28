package chap07;

//enum Resolution {
//    HD, FHD, UHD
//}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }

}


//열거형
public class _18_Enum {
    //달력(JAN, FEB, MAR, ...)
    //옷 사이즈 : S, M, L
    //OS 종류 : WIN10, WIN11, MACOS, LINUX
    //해상도 : HD, FHD, QHD, UHD, ...


    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for (Resolution res : Resolution.values()) {
            System.out.println(res.name() + " : " + res.getWidth());
        }


    }


}