package lesson6;

class House {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setAddress("Street");
        house1.setPrice(999000);
        house1.setSquareFeet(1500.5);
    }

    String address;
    int price;
    double squareFeet;

    public House() {
        address = "Адрес не указан";
        price = 0;
        squareFeet = 0.0;
    }
    public House(String address, int numberOfRooms, double squareFeet) {
        this.address = address;
        this.price = numberOfRooms;
        this.squareFeet = squareFeet;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPrice(int numberOfRooms) {
        this.price = price;
    }
    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public String getAddress() {
        return address;
    }
    public int getPrice() {
        return price;
    }
    public double getSquareFeet() {
        return squareFeet;
    }
}
