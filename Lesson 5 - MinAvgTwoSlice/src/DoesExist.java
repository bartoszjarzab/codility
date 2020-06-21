import java.util.Random;

public class DoesExist {

	public static void main(String[] args) {
		Random random = new Random();
		//does such 4 numbers exist that average of 4 is lower than average of each 2s and 3s
		boolean foobar=true;
		
		int[] array = new int[4];
		double average4,average3,average2;
		while(foobar) {
			for(int i=0;i<4;i++) {
				array[i]=random.nextInt(20001)-10000;
			}
			//check warunki
			average4=(array[0]+array[1]+array[2]+array[3])/4;
			average3=Math.min((array[0]+array[1]+array[2])/3, (array[1]+array[2]+array[3])/3);
			average2=lowestAverageOfTwo(array);
			
			System.out.println(array[0]+","+array[1]+","+array[2]+","+array[3]);
			if(average4<Math.min(average2,average3)) {
				foobar=false;
				System.out.println(average2+" "+average3+" "+average4);
			}
			
		}
		System.out.println("RESULT");

	}

	public static double lowestAverageOfTwo(int[] args) {
		double result=10000;
		for(int i=1;i<args.length;i++) {
			result=Math.min(result, (args[i]+args[i-1])/2);
		}
		return result;
	}
	
}
