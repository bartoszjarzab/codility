import java.util.HashSet;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int solution(int[] array) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i=0;i<array.length;i++) {
			hashSet.add(array[i]);
		}
		return hashSet.size();
	}
}
