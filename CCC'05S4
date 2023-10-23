import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
		int T = readInt();
		for (int t = 0; t < T; t++) {
			int N = readInt();

            String[] s = new String[N];
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < N; i++) s[i] = next();
            map.put(s[N-1], 0);
            int depth = 0;
            int max = 0;
			for (int i = 0; i < N; i++) {
                if(!map.containsKey(s[i])) {
                    map.put(s[i], ++depth); 
                    max = Math.max(max, depth);
                } else {
                    depth = map.get(s[i]);
                }	
			}
            System.out.println(N * 10 - (max * 2 * 10));
		}
    }
    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
    static int readInt () throws IOException {
        return Integer.parseInt(next());
    }
}
