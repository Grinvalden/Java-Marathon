package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y;
        double x;
        while (true){
            System.out.println("Введите делимое, затем делитель");
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            if (y==0) {System.out.println("Программа завершила работу");
            break;}


            System.out.println(x / y);
        }}}














