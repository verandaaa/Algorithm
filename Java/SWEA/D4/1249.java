import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
	static class Pos{
		int x,y;
		public Pos(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			int n = Integer.parseInt(br.readLine());
			int[][] arr = new int[n][n];
			for (int i = 0; i < n; i++) {
				String s = br.readLine(); 
				for (int j = 0; j < n; j++) {
					arr[i][j] = s.charAt(j) - '0'; 
				}
			}
			int[][] min_arr = new int[n][n];
			for (int v[] : min_arr) 
				Arrays.fill(v, Integer.MAX_VALUE); 
			min_arr[0][0] = 0;
			int[] dx = { 1, -1, 0, 0 };
			int[] dy = { 0, 0, -1, 1 };
			Queue<Pos> queue = new LinkedList<>();
			queue.offer(new Pos(0,0));
			while (queue.size() > 0) { 
				Pos p=queue.poll();
				int x= p.x;
				int y=p.y;
				
				if(min_arr[x][y]>min_arr[n-1][n-1]) //내 최단거리가 이미 정답보다 길다
					continue;

				for (int i = 0; i < 4; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if (nx < 0 || nx > n - 1 || ny < 0 || ny > n - 1) {
						continue;
					}
					if (min_arr[x][y] + arr[nx][ny] < min_arr[nx][ny]) {
						min_arr[nx][ny] = min_arr[x][y] + arr[nx][ny];
						queue.offer(new Pos(nx,ny));
					}
				}
			}
			answer = min_arr[n - 1][n - 1];

			System.out.printf("#%d %d\n", tc, answer);
		}
		br.close();
	}

}

/*
 * Line 53
 * min_arr[nx][ny]=Math.min(min_arr[x][y]+arr[nx][ny],min_arr[nx][ny]);
 * queue.offer(new Pos(nx,ny));
 * 원래 썼던 방법인데, min값을 갱신 하지 않은 경우는 어차피 틀린 길이기에 추가하지 말았어야함.
 * 근데 무조건 추가하다보니 실행시간이 많이 걸림.
 */
