import java.util.Arrays;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int solution(int[] array) {
		Disc[] discs = new Disc[array.length];
		for(int i =0;i<array.length;i++) {
			discs[i]=new Disc(0, 0);
		}
		return 0;
	}
	static class Disc {
		int start,end;
		public Disc(int start, int end) {
			this.start=start;
			this.end=end;
		}
	}
}
