package day4;



public class Task2 {
    public static void main(String[] args) {
int [] array = new int [100];
int max = 0;
int min = 0;
int g = 0;
int k = 0;
        for (int i:array) {
            array[i] = (int) (Math.random()*10001);
            System.out.print(array[i] + " " );
                max = Math.max(max, array[i]);
                min = Math.min(min, array[i]);

                if (array[i]%10 == 0){
                    g++;}
                if (array[i] %10 == 0){
                    k = k + array[i];}

        }
        System.out.println("" +
                "Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на ноль: " + g);
        System.out.println("Сумма элементов массива, оканчивающихся на ноль: " + k);
    }
}
