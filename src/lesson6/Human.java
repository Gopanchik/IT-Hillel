package lesson6;

class Human {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Sanya");
        human1.setAge(25);
        human1.setWeight(62.6);
    }

    String name;
    int age;
    double weight;

    public Human() {
        name = "Имя не указано";
        age = 0;
        weight = 0.0;
    }

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;


    }
}
