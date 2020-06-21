
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solution(int[] array) {
		int result = 0;
		int sumRight=0;
		for(int i=array.length-1;i>=0;i--) {
			if(array[i]==1) {
				sumRight++;				
			}else {
				result+=sumRight;
				if(result>1000000000) {
					return -1;
				}
			}
			
			//System.out.println(i);
		}
		return result;
	}
}
