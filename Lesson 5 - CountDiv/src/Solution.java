
public class Solution {
	public static int solution(int A, int B, int K) {
		int result=0;
		for(int i=A; i<=B;i++) {
			if(i%K==0) {
				result=1;
				result+=(B-i)/K;
				return result;
				
			}
		}
		return result;
	}
}
