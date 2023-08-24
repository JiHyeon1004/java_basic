package chap07;

public class BlackBoxRefurbish {

    public String modelName;
    String resolution;
    private int price;
    protected String color;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        return resolution;
    }

    public String setResolution(String resolution) {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


