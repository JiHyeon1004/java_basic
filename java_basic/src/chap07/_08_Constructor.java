package chap07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(b1.modelName + b1.resolution + b1.price + b1.color + b1.serialNumber);
    }
}
