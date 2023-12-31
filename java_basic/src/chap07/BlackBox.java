package chap07;

public class BlackBox {
    static boolean canAutoReport = false; //자동 신고 기능
    String modelName;
    String resolution;
    int price;
    String color;

    int serialNumber;

    static int counter = 0; //시리얼번호를 생성해주는 역할

    BlackBox(){
//        System.out.println("기본 생성자");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼넘버를 발급받았습니다.");
    }

    BlackBox(String modelName, String resolution, int price, String color){
//        this(); //기본생성자를 호출하게된다.
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }



    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity);
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        } else {
            return 1;
        }
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");

        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    //오버로딩
    void record() {
        record(true, true, 5);
    }

    //static을 붙이면 모든 객체에 공통적으로 적용된다.
    static void callServiceCenter(){
        System.out.println("서비스센터로 연결합니다.");
    }

    //this가 붙은 것이 인스턴스 변수.
    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    //getter & setter
    String getModelName(){
        return modelName;
    }

    void setModelName(String modelName){
        this.modelName = modelName;
    }

    String getResolution(){
        if(resolution == null || resolution.isEmpty()){
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    void setResolution(String resolution){
        this.resolution = resolution;
    }

    int getPrice(){
        return price;
    }

    void setPrice(int price){
        if(price < 100000){
            this.price = 100000;
        }
        else{
            this.price = price;
        }
    }

    String getColor(){
        return color;
    }

    void setColor(String color){
        this.color = color;
    }




}
