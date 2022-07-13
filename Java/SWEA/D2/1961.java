import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st=null;

		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine(), " ");
			int n=Integer.parseInt(st.nextToken());
			String[] answer=new String[n];
			String[][] arr=new String[n][n];
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<n;j++) {
					arr[i][j]=st.nextToken();
				}			
			}
			String[][] arr2=rotation(arr,n);
			String[][] arr3=rotation(arr2,n);
			String[][] arr4=rotation(arr3,n);
			
			System.out.printf("#%d\n", tc);
			for(int i=0;i<n;i++) {
				answer[i]=String.join("",arr2[i])+" "+String.join("",arr3[i])+" "+String.join("",arr4[i]);
				System.out.println(answer[i]);
			}				

		}
	}
	public static String[][] rotation(String[][] arr,int n) {
		String[][] new_arr=new String[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				new_arr[j][n-1-i]=arr[i][j];
			}
		}
		
		return new_arr;
	}

}
