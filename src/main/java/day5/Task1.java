package day5;

 public class Task1 {
    public static void main(String[] args) {
Car car1 = new Car();
car1.setModel("Мерседес");
car1.setYear(2020);
car1.setColor("Черный");
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getColor());

    }
}
 class Car {
    private String model;
    private int year;
    private String color;

    public void setModel(String userModel){
        model = userModel;
        if (userModel.isEmpty()){
            System.out.println("Введите наименование модели");
        }
    }
    public void setYear(int userYear){
        year = userYear;
        if (userYear <= 0){
            System.out.println("Введите год");
        }
    }
    public void setColor(String userColor){
        color = userColor;
        if(userColor.isEmpty()){
            System.out.println("Введите цвет");
        }
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
}
    public String getColor(){
        return color;
}
 }
