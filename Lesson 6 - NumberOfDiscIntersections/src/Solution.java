import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int[] array) {
		
		Arrays.parallelSort(array);
		int resultPositive=1;

		for(int i =1;i<4;i++) {
			resultPositive*=array[array.length-i];
		}
		
		int resultNegative=array[0];
		resultNegative*=array[1];
		resultNegative*=array[array.length-1];
		
		return Math.max(resultPositive, resultNegative);
		
	}

}
