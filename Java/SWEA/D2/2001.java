import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			int answer=Integer.MIN_VALUE;;
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
			for(int i=0;i<=n-m;i++) {
				for(int j=0;j<=n-m;j++) {
					int sum=0;
					for(int k=0;k<m;k++) {
						for(int l=0;l<m;l++) {
							sum+=arr[i+k][j+l];
						}
					}
					answer=Math.max(answer, sum);
				}
			}
				
			System.out.printf("#%d %d\n", tc, answer);
		}
	}

}
