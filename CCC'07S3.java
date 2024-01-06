import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static int[] dist;
	static int[] vis;
	static boolean cycle;
	static ArrayList<ArrayList<Integer>> list;
	public static void main(String[] args) throws IOException{
		int N = readInt();

		list = new ArrayList<>();
		for (int i = 0; i <= 10000; i++) list.add(new ArrayList<>());
		for (int i = 0; i < N; i++) {
			int a = readInt(), b = readInt();
			list.get(a).add(b);
		}

		for (int a = readInt(), b = readInt(); a != 0; a = readInt(), b = readInt()){
			vis = new int[10000];
			dist = new int[10000];
			cycle = false;
			dfs(a, a);
			if (vis[b] != 0) {
				System.out.println("Yes " + (dist[b] - 1));
			} else {
				System.out.println("No");
			}
		}
	}
	static void dfs(int cur, int start) {
		vis[cur] = 1;
		for (int nxt: list.get(cur)) {
			if (vis[nxt] == 0) {
				dist[nxt] = dist[cur] + 1;
				dfs(nxt, start);
			}
		}
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}
