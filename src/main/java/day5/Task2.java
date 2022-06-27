package day5;


public class Task2 {
    public static void main(String[] args) {
Motorcycle motorcycle1 = new Motorcycle();
        System.out.println(motorcycle1.getModel());
        System.out.println(motorcycle1.getAge());
        System.out.println(motorcycle1.getColor());
    }
}
class Motorcycle {
    private String model;
    private int age;
    private String color;

    public Motorcycle() {
        this.model = model; // не могу понять, как впихнуть сюда get методы, чтобы желтым не светилось.
        this.age = age;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}