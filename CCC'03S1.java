import java.util.*;

public class test {
   public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      
      int player = 1;
      int dice = 2;
      
      
      while (true) {
      
         dice = sc.nextInt();
         
         if (dice >= 2 && dice <= 12) { 
            if (player + dice <= 100) {
               player = player + dice;
                //Ladders
               if (player == 9) {
                  player = 34;
               } else
               if (player == 40) {
                  player = 64;
               } else 
               if (player == 67) {
                  player = 86;
               } else
               //Snakes
               if (player == 54) {
                  player = 19;
               } else
               if (player == 90) {
                  player = 48;
               } else
               if (player == 99) {
                  player = 77;
               }  
            } 
             System.out.println("You are now on square " + player);
  
         }
                 
                  
         if (dice == 0) {
            System.out.print("You Quit!");
            break;
         } 
         
         if (player == 100) {
            System.out.print("You Win!");
            break;
         }
         
      }
   }
}
