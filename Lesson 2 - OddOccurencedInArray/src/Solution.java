import java.util.Arrays;

public class Solution {

	public static int solution(int[] array) {
		// TODO Auto-generated method stub
		if(array.length==1) {
			return array[0];
		}
		Arrays.parallelSort(array);
		if(array[array.length-1]!=array[array.length-2]) {
			return array[array.length-1];
		}
		//System.out.println(Arrays.toString(array));
		for(int i=0;i<array.length-1;i+=2) {
			if(array[i]!=array[i+1]) {
				return array[i];
			}
		}
		Math.ceil(0.5);
		return 0;
	}
}
