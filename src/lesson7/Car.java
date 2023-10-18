package lesson7;

public class Car {
    private int maxSpeed;
    private int price;
    private String madeIn;
    private String model;
    private String marka;

    public Car(int maxSpeed, int price, String madeIn, String model, String marka) {
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.madeIn = madeIn;
        this.model = model;
        this.marka = marka;
    }

    public Car() {
    }



    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getMadeIn() {
        return madeIn;
    }
    public String getModel() {
        return model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getMarka() {
        return marka;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", price=" + price +
                ", madeIn='" + madeIn + '\'' +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
