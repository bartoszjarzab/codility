import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		
	}
	public static int solution(int[] array) {
		Arrays.parallelSort(array);
		for(int i=0;i<array.length;i++) {
			if(array[i]!=(i+1)) {
				return 0;
			}
		}
		
		return 1;
	}
}
