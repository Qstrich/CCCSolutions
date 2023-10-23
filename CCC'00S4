import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int target = sc.nextInt();
		int numClubs = sc.nextInt();
		int[] clubs = new int[numClubs];
		int[] turns = new int[target+1];
		Arrays.fill(turns, Integer.MAX_VALUE);

		for (int x = 0; x < numClubs; x++){
			clubs[x] = sc.nextInt();
			if (check(clubs[x], target)) 
			turns[clubs[x]] = 1;
		}
		
		for (int x = 0; x <= target; x++) {
			for (int y = 0; y < numClubs; y++){
				if ( check(x + clubs[y], target) && turns[x+clubs[y]] > turns[x]) 
					turns[x + clubs[y]] = turns[x] + 1;
			}
		}

		if (turns[target] != Integer.MAX_VALUE) {
			System.out.println("Roberta wins in " + turns[target] + " strokes.");
		} else {
			System.out.println("Roberta acknowledges defeat.");
		}
	}
	static boolean check (int n, int target) {
		if (n < target+1 && n > 0) {
			return true;
		} 
		return false;
	}
}
