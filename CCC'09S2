import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException{

		int r = readInt();
		int l = readInt();
		int[] lights = new int[r];
		HashSet<Integer> cur = new HashSet<Integer>();
		HashSet<Integer> next = new HashSet<Integer>();
		
		for (int i = 0; i < r; i++) {
			int num = 0;
			for (int j = 0; j < l;j++) {
				num = (num << 1) | readInt();
			}
			lights[i] = num;
		}

		for (int i = 0; i < r; i++) {
			next.add(lights[i]);

			for (int prevR : cur) {
				next.add((lights[i] ^ prevR));
			}

			cur = next;
			next = new HashSet<Integer>();
		}

		System.out.println(cur.size());
		
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
