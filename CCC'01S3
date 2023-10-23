import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<int[]> roads = new ArrayList<int[]>();
		ArrayList<int[]> disconnect = new ArrayList<int[]>();
		int edges = 0;

		for (int x = 0; x <= 27; x++){
			list.add(new ArrayList<Integer>());
		}

		while (!input.equals("**")){
			int[] a = {(int) input.charAt(0) - 64, (int) input.charAt(1) - 64};
			roads.add(a);
			edges++;
			input = sc.nextLine();
		}
		

		

		for(int x = 0; x < edges; x++){
			
			for (int y = 0; y < roads.size(); y++){
				if (y != x){
					list.get(roads.get(y)[0]).add(roads.get(y)[1]);
					list.get(roads.get(y)[1]).add(roads.get(y)[0]);
				}
			}

			LinkedList<Integer> queue = new LinkedList<Integer>();
			boolean[] visited = new boolean[list.size()];
			queue.add(1);
			visited[1] = true;
			while(!queue.isEmpty()) {
				int cur = queue.pop();
				for (int i = 0; i < list.get(cur).size(); i++){
					if (!visited[list.get(cur).get(i)]){
						visited[list.get(cur).get(i)] = true;
						queue.push(list.get(cur).get(i));
					}
				}
			}

			if (visited[2] == false){
				disconnect.add(roads.get(x));
			} 
			for (int y = 0; y <= 27; y++){
				list.get(y).clear();
			}
		}

		for (int x = 0; x < disconnect.size(); x++){
			System.out.println((char) (disconnect.get(x)[0] + 64) + "" + (char) (disconnect.get(x)[1] + 64));
		}
		System.out.println("There are " + disconnect.size() +" disconnecting roads.");
		
	}


}
