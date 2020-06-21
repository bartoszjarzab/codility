package modules;

import java.util.LinkedList;

public class Solution {
	public static int solution(int N) {
		LinkedList<Integer> gapsList = new LinkedList<>();
		gapsList.add(0);
		int quotient = N;
		int currentCount=0;
		boolean notCounting=true;
		while(notCounting && quotient>0) {
			int remainder = quotient%2;
			if(remainder==1) {
				notCounting=false;
			}
			quotient /=2;
		}
		while(quotient>0) {
			int remainder = quotient%2;

			if(remainder==1) {
				gapsList.add(currentCount);
				currentCount=0;
			}
			else {
				currentCount++;
			}			
			
			quotient /=2;
		}
		gapsList.sort((a,b)->(-1*a.compareTo(b)));
		return gapsList.getFirst();
	}
}
