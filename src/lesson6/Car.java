package lesson6;

class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMake("Bugatti");
        car1.setModel("Veyron");
        car1.setYear(2016);
    }

    String make;
    String model;
    int year;

    public Car() {
        make = "Марка не указана";
        model = "Модель не указана";
        year = 0;
    }
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}
