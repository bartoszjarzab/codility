import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test1() {
		int[] A = {4,1,3,2};
		assertEquals(1, Solution.solution(A));
	}
	@Test
	void test2() {
		int[] A = {4,1,3};
		assertEquals(0, Solution.solution(A));
	}

}
