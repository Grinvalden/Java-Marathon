package day6;

public class Task1 {
    public static void main(String[] args) {
Car1 car1 = new Car1();
car1.setYear(2010);
car1.info();
int years = car1.yearDifference(2020);
        System.out.println("Ему " + Math.abs(years )+ " лет." );
Motorcycle1 motorcycle1 = new Motorcycle1();
motorcycle1.setYear(2010);
motorcycle1.info();
int yearss = motorcycle1.yearDifference(2000);
        System.out.println("Ему " + Math.abs(yearss)+ " лет." );





    }
}
