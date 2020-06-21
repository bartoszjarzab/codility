package alpha;

public class Solution {
	
	public static void main(String[] args) {
		int[] A= {4,2,2,5,1,5,8};
		Solution.solution(A);		
	}
	
	public static int solution(int[] array) {
		int result = 0;
		int minValue=10000;
		double minAvg = 10000;
		double outerArraySum=0;
		double currentAvg=minAvg;
		for(int i=0;i<array.length;i++) {
			outerArraySum+=array[i];
			if(array[i]<minValue) {
				minValue=array[i];
			}
		}
		System.out.println(outerArraySum+"/"+array.length+"=?="+(double)minValue);
		if(outerArraySum/(array.length)==(double)minValue) {
			return 0;
		}
		double innerArraySum=outerArraySum;
		for(int j=array.length-1;j>0;j--) {
			//System.out.print("(0-"+j+")");
			//calculate average
			currentAvg=innerArraySum/(j-0+1);
			
			//check if smaller then current minAvg
			if(currentAvg<minAvg) {
				//if yes, minAvg=currentAvg AND result=i
				minAvg=currentAvg;
				result=0;
			}
			innerArraySum-=array[j];
		}
		//System.out.println();	
		for(int i=1;i<array.length;i++) {
			outerArraySum-=array[i-1];
			innerArraySum=outerArraySum;
			for(int j=array.length-1;j>i;j--) {
				//System.out.print("("+i+"-"+j+")");
				
				//calculate average
				
				currentAvg=innerArraySum/(j-i+1);
				
				//check if smaller then current minAvg
				if(currentAvg<minAvg) {
					//if yes, minAvg=currentAvg AND result=i
					minAvg=currentAvg;
					result=i;
				}
				innerArraySum-=array[j];
				
				
			}
			//System.out.println();
			
		}
		
		
		return result;
	}
}	