public class Solution {
	public static int[] solution(int[] A, int K) {
		if(A.length==0) {
			return A;
		
		}		
		K=K%A.length;
		if(K==0) {
			return A;
		}
		int[] result = new int[A.length];
		System.arraycopy(A, 0, result, K, A.length-K);
		System.arraycopy(A, A.length-K, result, 0, K);
		return result;
	}
}
