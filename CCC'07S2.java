import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
		int N = readInt();

		ArrayList<Box> list = new ArrayList<Box>();


		for (int i = 0; i < N; i++) {
			int a = readInt(), b = readInt(), c = readInt();

			list.add(new Box(a * b * c, a, b, c));
		}
		Collections.sort(list, (apple, banana) -> Integer.compare(apple.vol, banana.vol));

		int M = readInt();
		for (int j = 0; j < M; j++) {
			int a = readInt(), b = readInt(), c = readInt();
			int possible = -1;

			for (int i = 0; i < N; i++) {
				Box cur = list.get(i);
				if (a * b * c <= cur.vol) {
					//2 3 4
					//4 3 2
					if ((a <= cur.x && b <= cur.y && c <= cur.z) 
					|| (a <= cur.x && c <= cur.y && b <= cur.z)
					|| (b <= cur.x && c <= cur.y && a <= cur.z) 
					|| (b <= cur.x && a <= cur.y && c <= cur.z) 
					|| (c <= cur.x && a <= cur.y && b <= cur.z) 
					|| (c <= cur.x && b <= cur.y && a <= cur.z) ) {
						possible = i;
						break;
					}
				} 
			}

			if (possible > -1) {
				System.out.println(list.get(possible).vol);
			} else {
				System.out.println("Item does not fit.");
			}

			
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

class Box {
	int vol, x, y, z;
	Box (int vol, int x, int y, int z) {
		this.vol = vol;
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
