import java.util.Scanner;

public class Main {
   public static void main (String[]args){
      Scanner sc = new Scanner(System.in);
      
      int numInput = sc.nextInt();
      int denInput = sc.nextInt();
      int remain;
      
      if (numInput % denInput == 0) {
         System.out.println(numInput/denInput);
      } else {
         remain = numInput % denInput;
         if ((numInput-remain)/denInput > 0) {
            System.out.print((numInput-remain)/denInput + " ");
         }
         for (int x = 1; x < denInput; x++){
            if (remain % x == 0 && denInput % x == 0) {
               remain = remain/x;
               denInput = denInput/x;
            }
         }
         System.out.println(remain + "/" + denInput);
      }
   }
}
