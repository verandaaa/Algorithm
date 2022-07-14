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
			for(int i=0;i<n;i++) {
				int cnt1=0;
				int cnt2=0;
				for(int j=0;j<n;j++) {
					if(arr[i][j]==1) //가로
						cnt1++;
					if(arr[i][j]==0||j==n-1) {
						if(cnt1==m)
							answer++;
						cnt1=0;
					}
					if(arr[j][i]==1) //세로
						cnt2++;
					if(arr[j][i]==0||j==n-1) {
						if(cnt2==m)
							answer++;
						cnt2=0;
					}
				}
			}
				
			System.out.printf("#%d %d\n", tc, answer);
		}
	}

}
