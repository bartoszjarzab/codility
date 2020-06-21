
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Solution {
	public static int solution(int X, int[] array) {
		Set<Integer> foo = new HashSet<Integer>();
		//System.out.println(foo.size());
		for (int i=0;i<array.length;i++) {
				foo.add(array[i]);
				if(foo.size()==X) {
					return i;
				}
		}
		
		return -1;
	}
}
