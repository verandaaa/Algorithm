import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
	static class Pos {
		int x, y;
		public Pos(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			int tc_num = Integer.parseInt(br.readLine());
			int n = 16;
			int[][] arr = new int[n][n];
			Queue<Pos> queue = new LinkedList<>();
			int[] dx = { -1, 1, 0, 0 };
			int[] dy = { 0, 0, -1, 1 };
			int[][] visit = new int[n][n];
			for (int i = 0; i < n; i++)
				Arrays.fill(visit[i], 0);
			
			for (int i = 0; i < n; i++) {
				String s = br.readLine();
				for (int j = 0; j < n; j++) {
					arr[i][j] = s.charAt(j) - '0';
					if(arr[i][j]==2) {
						queue.offer(new Pos(i,j));
						visit[1][1] = 1;
					}
				}
			}
			
			while (!queue.isEmpty()) {
				Pos p = queue.poll();
				int x = p.x;
				int y = p.y;

				if (arr[x][y] == 3) {
					answer = 1;
					break;
				}

				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx < 0 || nx > 15 || ny < 0 || ny > 15 || arr[nx][ny] == 1)
						continue;
					if (visit[nx][ny] == 0) {
						visit[nx][ny] = 1;
						queue.offer(new Pos(nx, ny));
					}

				}
			}
			System.out.printf("#%d %d\n", tc, answer);
		}
		br.close();
	}

}
