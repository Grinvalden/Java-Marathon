package day2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Vvedite nomer etaja:");
        int scanner = x.nextInt();
        if (scanner >=1 && scanner <=4) {
            System.out.println("Eto maloetajny dom");
        }
 else if (scanner >=5 && scanner <=8 ){
    System.out.println("Eto sredneetajny dom");
}
else if (scanner >=9 ){
    System.out.println("Eto mnogoetajny dom");}
else {
    System.out.println("Oshibochnye dannye");
}
}
}


