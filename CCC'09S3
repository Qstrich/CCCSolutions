import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

		for (int x = 0 ;x <= 50; x++){
			adj.add(new ArrayList<Integer>());
		}

		adj.get(1).add(6);
		adj.get(2).add(6);
		adj.get(3).add(4); adj.get(3).add(5); 
		adj.get(3).add(6); adj.get(3).add(15);
		adj.get(4).add(3); adj.get(4).add(5); adj.get(4).add(6);
		adj.get(5).add(3); adj.get(5).add(3); adj.get(5).add(4); adj.get(5).add(6);
		adj.get(6).add(1); adj.get(6).add(2); adj.get(6).add(3); adj.get(6).add(4);adj.get(6).add(5);adj.get(6).add(7);
		adj.get(7).add(6); adj.get(7).add(8);
		adj.get(8).add(7); adj.get(8).add(9);
		adj.get(9).add(8); adj.get(9).add(10); adj.get(9).add(12);
		adj.get(10).add(9); adj.get(10).add(11);
		adj.get(11).add(10); adj.get(11).add(12);
		adj.get(12).add(9); adj.get(12).add(11); adj.get(12).add(13);
        adj.get(13).add(12);adj.get(13).add(14);adj.get(13).add(15);
		adj.get(14).add(13);
        adj.get(15).add(3);adj.get(15).add(13);
		adj.get(16).add(17);adj.get(16).add(18);
        adj.get(17).add(16);adj.get(17).add(18);
		adj.get(18).add(16);adj.get(18).add(17);


		char c = sc.next().charAt(0);
		int a, b;
		while (c != 'q'){
			switch (c){
				case 'i':
					a = sc.nextInt(); 
					b = sc.nextInt();
					addEdge(adj, a, b);
					break;
				case 'd':
					a = sc.nextInt();
					b = sc.nextInt();
					removeEdge(adj, a, b);
					break;
				case 'n':
					a = sc.nextInt();
					System.out.println(adj.get(a).size());
					break;
				case 'f':
					a = sc.nextInt();
					System.out.println(ff(adj, a));
					break;
				case 's':
					a = sc.nextInt();
					b = sc.nextInt();
					int response = BFS(adj, a, b);
					if (response == 0){
						System.out.println("Not connected");
					} else {
						System.out.println(response);
					}
					break;
				case 'q':
					break;
			}
			c = sc.next().charAt(0);
		}
	
	}

	static void addEdge (ArrayList<ArrayList<Integer>> adj, int a, int b){
		for (int x = 0; x < adj.get(a).size(); x++) {
			if (adj.get(a).get(x) == b) {
				return;
			}
		}
		adj.get(a).add(b);
		adj.get(b).add(a);
	}

	static void removeEdge (ArrayList<ArrayList<Integer>> adj, int a, int b){
		for (int x = 0; x < adj.get(a).size(); x++){
			if (adj.get(a).get(x) == b){
				adj.get(a).remove(x);
				break;
			}
		}
		for (int x = 0; x < adj.get(b).size(); x++){
			if (adj.get(b).get(x) == a){
				adj.get(b).remove(x);
				break;
			}
		}
	}
	static int ff (ArrayList<ArrayList<Integer>> adj, int a){
		int twoAway = 0;

		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[51];
		int[] distance = new int[51];

		queue.add(a);
		visited[a] = true;
		distance[a] = 0;

		while (!queue.isEmpty()){
			int cur = queue.remove(0);
			for (int node: adj.get(cur)){
				if (!visited[node]) {
					queue.addLast(node);
					visited[node] = true;
					distance[node] = distance[cur]+1;
					if (distance[node] == 2) twoAway++;
				}
			}
			if (distance[cur] > 4){
				break;
			}
		}
		
		return twoAway;
	}

	static int BFS (ArrayList<ArrayList<Integer>> adj, int a, int b){
		LinkedList<Integer> q = new LinkedList<Integer>();
		boolean[] vis = new boolean[51];
		int[] dist = new int[51];

		q.add(a);
		vis[a] = true;
		dist[a] = 0;

		while(!q.isEmpty()){
			int cur = q.remove(0);
			for (int node: adj.get(cur)){
				if (!vis[node]){
					q.addLast(node);
					vis[node] = true;
					dist[node] = dist[cur] + 1;
				}
				if (node == b){
					return dist[b];
				}
			}
		}
		return dist[b];
	}

}
