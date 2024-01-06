import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
		int T = readInt();

        int[][] mh = {{0, 1}, {0, -1}};
        int[][] mv = {{1, 0}, {-1, 0}};

		for (int t = 0; t < T; t++) {
			int N = readInt(), M = readInt();

			int[][] dist = new int[N+2][M+2];
			char[][] grid = new char[N+2][M+2]; 
			for (int i = 1; i <= N; i++) {
				String s = next();
				for (int j = 1; j <= M; j++) {
					grid[i][j] = s.charAt(j-1);
					dist[i][j] = -1;
				}
			}

			Queue<Pair> q = new LinkedList<>();
			q.add(new Pair(1, 1));
			dist[1][1] = 1; 

			while (!q.isEmpty()) {
                Pair cur = q.poll();

                if (grid[cur.x][cur.y] == '+' || grid[cur.x][cur.y] == '-') {
                    for (int[] m: mh) {
                        if (dist[cur.x + m[0]][cur.y + m[1]] == -1 && grid[cur.x + m[0]][cur.y + m[1]] != '*') {
                            q.add(new Pair(cur.x + m[0], cur.y + m[1]));
                            dist[cur.x + m[0]][cur.y + m[1]] = dist[cur.x][cur.y] + 1; 
                        }
                    } 
                }
                if (grid[cur.x][cur.y] == '+' || grid[cur.x][cur.y] == '|') {
                    for (int[] m: mv) {
                        if (dist[cur.x + m[0]][cur.y + m[1]] == -1 && grid[cur.x + m[0]][cur.y + m[1]] != '*') {
                            q.add(new Pair(cur.x + m[0], cur.y + m[1]));
                            dist[cur.x + m[0]][cur.y + m[1]] = dist[cur.x][cur.y] + 1; 
                        }
                    } 
                }
            }
            System.out.println(dist[N][M]);
		}
    }
	static class Pair {
		int x, y;
		Pair (int x, int y) {
			this.x = x;
			this.y = y;
		}
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
