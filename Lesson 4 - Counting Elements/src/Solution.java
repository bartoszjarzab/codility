import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int[] A) {
		Arrays.parallelSort(A);
		int lowestInt=1;
		for(int i=0;i<A.length;i++) {
			if(A[i]==lowestInt) {
				lowestInt++;
			}
			else if(A[i]>lowestInt) {
				return lowestInt;
			}
		}	
		
		return lowestInt;
	}
}
//if(A[i]>lowestInt) {
//if(A[i]-lowestInt>1) {
//	return (lowestInt+1);
//} else {
//	lowestInt=A[i];
//}
//
//}