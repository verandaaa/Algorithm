import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;

		for (int tc = 1; tc <= T; tc++) {
			int answer;
			st = new StringTokenizer(br.readLine(), " ");
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			int[] arr1=new int[n];
			int[] arr2=new int[m];
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<n;i++) {
				arr1[i]=Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine(), " ");
			for(int i=0;i<m;i++) {
				arr2[i]=Integer.parseInt(st.nextToken());
			}
			if(n<m)
				answer=get_max_sum(arr1,arr2);
			else
				answer=get_max_sum(arr2,arr1);			
			System.out.printf("#%d %d\n", tc, answer);
		}
	}
	public static int get_max_sum(int[] arr1, int[] arr2) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<=arr2.length-arr1.length;i++) {
			int sum=0;
			for(int j=0;j<arr1.length;j++) {
				sum+=arr1[j]*arr2[i+j];
			}
			max=Math.max(max, sum);
		}	
		return max;
	}
}
