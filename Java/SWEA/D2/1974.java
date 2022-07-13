import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int tc = 1; tc <= T; tc++) {
			int answer=1;
			int[][] arr=new int[9][9];		
			for(int i=0;i<9;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				for(int j=0;j<9;j++) {
					arr[i][j]=arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i=0;i<9;i++) { 
				Set<Integer> set1 = new HashSet<Integer>();
				Set<Integer> set2 = new HashSet<Integer>();
				for(int j=0;j<9;j++) {
					set1.add(arr[i][j]);
					set2.add(arr[j][i]);
				}
				if(set1.size()!=9 || set2.size()!=9) {
					answer=0;
					break;
				}
			}	
			for(int i=0;i<9;i+=3) {
				for(int j=0;j<9;j+=3) {
					Set<Integer> set3 = new HashSet<Integer>();
					for(int k=0;k<3;k++) {
						for(int l=0;l<3;l++) {
							set3.add(arr[i+k][j+l]);
						}
					}
					if(set3.size()!=9) {
						answer=0;
						break;
					}
				}
			}
			
			
			System.out.printf("#%d %d\n", tc, answer);
		}
	}
}
