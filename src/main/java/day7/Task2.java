package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random x1 = new Random();
        int y1 = x1.nextInt();
        Random x2 = new Random();
      int y2 = x2.nextInt();
        Random x3 = new Random();
        int y3 = x3.nextInt();
        Random x4 = new Random();
        int y4 = x4.nextInt();
        Random x5 = new Random();
        int y5 = x5.nextInt();
        Random x6 = new Random();
        int y6 = x6.nextInt();

        Player player1 = new Player(y1);
        Player player2 = new Player(y2);
        Player player3 = new Player(y3);



        Player player4 = new Player(y4);
        Player player5 = new Player(y5);
        Player.info();
        Player player6 = new Player(y6);

        for (int i = 0; i< y6; i++)
        player6.run();






    }
    public static class Player{
        private int stamina;



        public final int  MAX_STAMINA = 100;
        public  final  int MIN_STAMINA = 0;

        public int getStamina() {
            return stamina;
        }


        private static int countPlayers;
             public Player(int stamina) {
                this.stamina = stamina;
               if (countPlayers < 6)
                   countPlayers++;
        }

        public  int getCountPlayers(int stamina) {
            return countPlayers;
        }

        public void run(){
            if (stamina==0)
                return;

             stamina--;
             if (stamina == 0){
                 countPlayers--;
             }

        }
           public static void info(){
                 if (countPlayers<6){
                     System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест");}
                  else{
                     System.out.println("Свободных мест нет");
                 }
}
    }}
