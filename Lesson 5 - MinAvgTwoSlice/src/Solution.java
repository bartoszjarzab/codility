
public class Solution {
	
	public static void main(String[] args) {
		int[] A= {4,2,2,5,1,5,8};
		Solution.solution(A);		
	}
	
	public static int solution(int[] array) {
		int result = 0;
		double minValue=10000;
		double maxValue=-10000;
		double minAvg = 10000;
		double outerArraySum=array[0];
		//count the total sum of array, find minValue and maxValue
		if(array[0]<minValue) {
			minValue=array[0];
		}
		if(array[0]>maxValue) {
			maxValue=array[0];
		}
		double minOutOfTwoAvg=10000;
		double minOutOfThreeAvg=10000;
		for(int i=1;i<array.length;i++) {
			int current=array[i];
			outerArraySum+=current;
			minValue=Math.min(minValue, current);
			maxValue=Math.max(maxValue, current);
			minOutOfTwoAvg=Math.min(minOutOfTwoAvg,((current+array[i-1])/2));
			if(i<(array.length-1)){
				minOutOfThreeAvg=Math.min(minOutOfThreeAvg,((array[i-1]+current+array[i-1])/3));
			}
		}
		double minOutOfTwoOrThreeAvg=Math.min(minOutOfTwoAvg,minOutOfThreeAvg);
		double currentAvg=outerArraySum/array.length;
		if(currentAvg==minValue) {
			return 0;
		}

		double innerArraySum=outerArraySum;

		for(int i=0;i<array.length;i++) {
			
			
			for(int j=array.length-1;j>i;j--) {
				//System.out.print("("+i+"-"+j+")");
				
				//calculate average
				
				currentAvg=innerArraySum/(j-i+1);
				if(minOutOfTwoOrThreeAvg==currentAvg) {
					return i;
				}
				//check if smaller then current minAvg
				if(currentAvg<minAvg) {
					//if yes, minAvg=currentAvg AND result=i
					minAvg=currentAvg;
					result=i;
				}
				innerArraySum-=array[j];
				
				
			}
			//System.out.println();
			outerArraySum-=array[i];
			innerArraySum=outerArraySum;
		}
		
		
		return result;
	}
}	