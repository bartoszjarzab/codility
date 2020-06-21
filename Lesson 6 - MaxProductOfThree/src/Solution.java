import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solution(int[] array) {
		int[] leftDiscBorders=new int[array.length];
		int[] rightDiscBorders=new int[array.length];
		for(int i =0;i<array.length;i++) {
			leftDiscBorders[i]=i-array[i];
			rightDiscBorders[i]=i+array[i];
		}
		for(int i =0;i<array.length;i++) {
			
		}
		return 0;
	}

}
