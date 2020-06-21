import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static int solution(int[] array) {
		List<Integer> resultList = new LinkedList<Integer>(); 
		int leftSum=array[0], rightSum=0;
		for (int i=1;i<array.length;i++) {
			rightSum+=array[i];
		}
		//System.out.println(leftSum+"-"+rightSum);
		resultList.add(Math.abs(leftSum-rightSum));
		for (int p=1;p<array.length-1;p++) {
			int value=array[p];
			leftSum+=value;
			rightSum-=value;
			resultList.add(Math.abs(leftSum-rightSum));
			//System.out.println(leftSum+"-"+rightSum);
		}
		//System.out.println(resultList);
		resultList.sort(null);
		//System.out.println(resultList);
		return resultList.get(0);
	}

}
