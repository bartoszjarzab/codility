import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Solution {
	
	
	public static void main(String[] args) {
		String s="CAGCCTA";
		solution(s);

	}
	public static int solution(String s) {
		IntStream intStream = s.chars();
		OptionalInt optionalInt = intStream.map(arg->parseDNAtoInt(arg))//.forEach(System.out::println);
					//.reduce(0,Integer::sum);
				.min();
		return optionalInt.getAsInt();
	}
	public static int[] solution(String s, int[] P, int[] Q) {
		int[] results = new int[P.length];
		for(int i=0;i<P.length;i++) {
			String fragment = s.substring(P[i], Q[i]+1);
			System.out.println(fragment);
			results[i]=solution(fragment);
		}		
		return results;
	}
	public static int parseDNAtoInt(int operand) {
		switch(operand) {
		case 65: return 1;
		case 67: return 2;
		case 71: return 3;
		case 84: return 4;
		default: return 0;
		}
	}
}	