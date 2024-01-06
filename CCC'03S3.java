import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException{
		int K = Integer.parseInt(br.readLine()), R = Integer.parseInt(br.readLine()), C = Integer.parseInt(br.readLine());

		ArrayList<int[]> rooms = new ArrayList<int[]>();
		int[][] grid = new int[R+2][C+2];

		for (int i = 1; i <= R; i++) {
			String s = br.readLine();
			for (int j = 1;j <= C; j++) {
				if (s.charAt(j-1) == '.') {
					grid[i][j] = 1;
					rooms.add(new int[]{i, j});
				}
			}
		}
		int count = 0;
		int[][] moves = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

		ArrayList<Integer> list = new ArrayList<>();
		
		for (int[] room: rooms) {
			if (grid[room[0]][room[1]] == 0) continue;
			Queue<int[]> q = new LinkedList<>();

			int size = 1;
			q.add(room);
			grid[room[0]][room[1]] = 0;

			while (!q.isEmpty()) {
				int[] cur = q.remove();

				for (int[] m: moves) {
					if (grid[cur[0] + m[0]][cur[1] + m[1]] == 1) {
						q.add(new int[]{cur[0] + m[0], cur[1] + m[1]});
						grid[cur[0] + m[0]][cur[1] + m[1]] = 0;
						size++;
					}
				}	
			}

			list.add(size);
		}
		Collections.sort(list, Collections.reverseOrder());
		for (int i: list) {
			if (K - i >= 0) {
				count++;
				K -= i;
			}
			else {break;}
		}
		
		if (count == 1) System.out.printf("%d room, %d square metre(s) left over%n", count, K);
		else System.out.printf("%d rooms, %d square metre(s) left over%n", count, K);

	}
}
