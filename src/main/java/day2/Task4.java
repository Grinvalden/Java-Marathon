package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Введите число х");
double x = scanner.nextDouble();

if (x>=5){
    System.out.println((x*x - 10 )/(x + 7));
}else if ( x>=-3 && x <= 5) {
    System.out.println((x + 3)*(x*x - 2));
} else{
    System.out.println("420");}
    }
}
