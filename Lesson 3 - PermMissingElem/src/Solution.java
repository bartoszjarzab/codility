import java.util.Arrays;

public class Solution {
	public static int solution(int[] array) {
		if (array.length==0) {
			return 1;
		}
		Arrays.parallelSort(array);
		System.out.println(Arrays.toString(array));
		int i;
		for(i =0; i<array.length;i++) {
			if(array[i]!=i+1) {
				return i+1;
			}
		}
		return ++i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
