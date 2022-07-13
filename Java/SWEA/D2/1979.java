import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			int answer=0;
			st = new StringTokenizer(br.readLine(), " ");
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int[][] arr=new int[n][n];
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<n;j++) {
					arr[i][j]=Integer.parseInt(st.nextToken());
				}			
			}
			for(int i=0;i<n;i++) { //가로
				int cnt=0;
				for(int j=0;j<n;j++) {
					if(arr[i][j]==1)
						cnt++;
					if(arr[i][j]==0||j==n-1) {
						if(cnt==m)
							answer++;
						cnt=0;
					}
				}
			}
			for(int i=0;i<n;i++) { //세로
				int cnt=0;
				for(int j=0;j<n;j++) {
					if(arr[j][i]==1)
						cnt++;
					if(arr[j][i]==0||j==n-1) {
						if(cnt==m)
							answer++;
						cnt=0;
					}
				}
			}
				
			System.out.printf("#%d %d\n", tc, answer);
		}
	}

}
