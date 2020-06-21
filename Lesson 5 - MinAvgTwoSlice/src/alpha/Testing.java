package alpha;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Testing {
	
	@Test
	void test1() {
		int[] A= {4,2,2,5,1,5,8};
		assertEquals(1, Solution.solution(A));
	}
	@Test
	void test2() {
		int[] A = new int[100000];
		Arrays.fill(A, 10000);
		assertEquals(0, Solution.solution(A));
	}

}
