import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			int answer=0;
			int n=Integer.parseInt(br.readLine());
			int[][] arr=new int[n][n];
			for(int i=0;i<n;i++) {
				String s=br.readLine();
				for(int j=0;j<n;j++) {
					arr[i][j]=s.charAt(j)-48;
				}			
			}
			int[][] min_arr=new int[n][n];
			for(int v[]:min_arr)
				Arrays.fill(v,Integer.MAX_VALUE);
			min_arr[0][0]=0;
			int[] dx= {1,-1,0,0};
			int[] dy= {0,0,-1,1};
			Queue<Integer> queue=new LinkedList<>();
			queue.add(0);
			queue.add(0);
			while(queue.size()>0) {
				int x = queue.poll();
				int y = queue.poll();
				
				for(int i=0;i<4;i++) {
					int nx=x+dx[i];
					int ny=y+dy[i];
					if(nx<0 || nx>n-1 || ny<0 || ny>n-1) {
						continue;
					}
					if(min_arr[x][y]>=min_arr[nx][ny]) {
						continue;
					}
					min_arr[nx][ny]=Math.min(min_arr[x][y]+arr[nx][ny],min_arr[nx][ny]);
					queue.add(nx);
					queue.add(ny);
				}
			}
			answer=min_arr[n-1][n-1];
				
			System.out.printf("#%d %d\n", tc, answer);
		}
	}

}
