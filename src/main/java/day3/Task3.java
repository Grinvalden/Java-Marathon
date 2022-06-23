package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


        double z = 0;
        while (z<=4)
        {System.out.println("Введите делитель, затем делимое");
            double x = scanner.nextDouble();
            double y= scanner.nextDouble();
            if (y==0) {
                System.out.println("Деление на ноль");
                continue;}
            z++;
            System.out.println(x/y);

        }
    }
}









