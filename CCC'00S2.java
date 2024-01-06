import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    
     int input = 0;
     int index, length;
     double amountFlowing = 0;
     double flow;
     double hold;
     length = sc.nextInt();
    
     ArrayList<Double> rivers = new ArrayList<>();
    
     for (int x = 0; x < length; x++){
        rivers.add(x, Double.valueOf(sc.nextInt()));
     }
 
     while (input != 77) {
        input = sc.nextInt();
        if (input == 99){
           //split
           index = (sc.nextInt())-1;
           flow = Double.valueOf((sc.nextInt()));
           hold = rivers.get(index);
           amountFlowing = (flow/100f) * rivers.get(index);
           rivers.set(index, hold - amountFlowing);
           rivers.add(index, amountFlowing);
           
        }
        if (input == 88){
           //join
           index = sc.nextInt();
           rivers.set(index, rivers.get(index) + rivers.get(index-1));
           rivers.remove(index-1);
        }
     }

    for (int x = 0; x < rivers.size(); x++){
        System.out.printf("%.0f ",rivers.get(x)); 
     }
  }
}
