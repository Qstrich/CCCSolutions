import java.util.Scanner;

public class test {
   
   public static void play(int coins, int counter1, int counter2, int counter3) {
      int plays = 0;
      
      while (true) {
         
         if (coins > 0) {
            coins--;
            plays++;
            counter1++;
            if (counter1 == 35) {
               coins = coins + 30;
               counter1 = 0;
            }
         } else {
            System.out.printf("Martha plays %d times before going broke.", plays);
            return;
         }
         
         if (coins > 0) {
            coins--;
            plays++;
            counter2++;
            if (counter2 == 100) {
               coins = coins + 60;
               counter2 = 0;
            }
         } else {
            System.out.printf("Martha plays %d times before going broke.", plays);
            return;
         }
         
         if (coins > 0) {
            coins--;
            plays++;
            counter3++;
            if (counter3 == 10) {
               coins = coins + 9;
               counter3 = 0;
            }
         } else {
            System.out.printf("Martha plays %d times before going broke.", plays);
            return;
         }

      }
   }

   public static void main (String[]args) {
      Scanner sc = new Scanner(System.in);
      
      int counter1, counter2, counter3, plays, coins;
      boolean end = false;
      
      coins = sc.nextInt();
      counter1 = sc.nextInt();
      counter2 = sc.nextInt();
      counter3 = sc.nextInt();
      
      test.play(coins, counter1, counter2, counter3);
   }
   
}
