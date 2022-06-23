package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int b = scanner.nextInt();
        int f = a + 1;
        while(f<b){
            if (f%4 == 0 || f%6==0){
                System.out.print(f + " ");
            }
           f= f + 1;


        }
    }
}