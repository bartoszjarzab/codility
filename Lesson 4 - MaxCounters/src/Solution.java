public class Solution {
	
//	public static void main(String[] args) {
//		int[] A = {9,8,9,8,9,8,9,8,9,8,9,8,9,8,9,8,9,8,9};
//		int N=8;
//		//solution(N, A);
//		int[] result =solution(N, A);
//		for(int i=0;i<result.length;i++) {
//			System.out.print(result[i]+" ");
//		}
//	}
	public static int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int level=0;
		int maxValue=0;
		boolean isMaxed=true;
		
		for(int i=0;i<A.length;i++) {
			if(A[i]<=N) {
				counters[A[i]-1]++;
				if(counters[A[i]-1]>maxValue) {
					maxValue=counters[A[i]-1];
				}
				isMaxed=false;
			} else {

				if(isMaxed==false) {
					level+=maxValue;
					maxValue=0;
					counters=new int[N];
					isMaxed=true;
				}				
			}			
		}
		for(int i=0;i<counters.length;i++) {
			counters[i]+=level;
		}
		
		
		
		return counters;
	}
}
