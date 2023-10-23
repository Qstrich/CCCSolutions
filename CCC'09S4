import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
		int N = readInt(), T = readInt();

        int[][] grid = new int[N+1][N+1];

		for (int i = 0; i < T; i++) {
            int a = readInt(), b = readInt(), c = readInt();

            grid[a][b] = c;
            grid[b][a] = c;
        }

        int K = readInt();
        ArrayList<Pair> pen = new ArrayList<>();
        for (int i = 0; i < K; i++) pen.add(new Pair(readInt(), readInt()));

        int D = readInt();

        int[] dist = new int[N+1]; Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] vis = new boolean[N+1];

        PriorityQueue<Pair> q = new PriorityQueue<>((c, d) -> Integer.compare(c.y, d.y));

        dist[D] = 0;
        q.add(new Pair(D, 0));
        while (!q.isEmpty()) {
            Pair cur = q.remove();

            if (vis[cur.x]) continue;

			vis[cur.x] = true;
            for (int nxt = 0; nxt <= N; nxt++) {
                if (grid[cur.x][nxt] == 0) continue; 
                if (dist[cur.x] + grid[cur.x][nxt] < dist[nxt]) {
                    dist[nxt] = dist[cur.x] + grid[cur.x][nxt];
                    q.add(new Pair(nxt, dist[nxt]));
                }
            }

        }

        int min = Integer.MAX_VALUE;
        for (Pair p: pen) {
            min = Math.min(dist[p.x] + p.y, min);
        }
        System.out.println(min);
        
    }
    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
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

class Pair {
    int x;
    int y;
    Pair (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
