package test3;

public class Car {
    private String blook;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String blook, int price, String color) {
        this.blook = blook;
        this.price = price;
        this.color = color;
    }

    public String getBlook() {
        return blook;
    }

    public void setBlook(String blook) {
        this.blook = blook;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
