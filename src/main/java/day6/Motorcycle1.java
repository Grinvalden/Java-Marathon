package day6;

 class Motorcycle1 {
     private int year;

     void info() {
         System.out.println("Это мотоцикл");
     }

     public void setYear(int year) {
         this.year = year;
     }

     int yearDifference(int inputYear) {
         inputYear = inputYear - year;
         return inputYear;
     }
 }



