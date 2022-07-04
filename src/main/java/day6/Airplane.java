package day6;

public class Airplane {
     private String manufacturer;
     private int year;
     private int length;
     private int weight;
     private int fuel;

     public Airplane(String manufacturer, int year, int length, int weight) {
         this.manufacturer = manufacturer;
         this.year = year;
         this.length = length;
         this.weight = weight;
         this.fuel = 0;
     }
void info(){
    System.out.println("Изготовитель: " + manufacturer + "\n"
            +"год выпуска: " + year + "\n"
            + "Длина: " + length + "\n"
            + "Вес: " + weight + "\n"
            +"Количество топлива в баке: " + fuel);
}
     public int getFuel() {
         return fuel;
     }

     public void setManufacturer(String manufacturer) {
         this.manufacturer = manufacturer;
     }

     public void setYear(int year) {
         this.year = year;
     }

     public void setLength(int length) {
         this.length = length;
     }

     public void setWeight(int weight) {
         this.weight = weight;
     }

     public void setFuel(int fuel) {
         this.fuel = fuel;
     }
    public void fillUp (int n) {
        fuel += n;

     }
 }
