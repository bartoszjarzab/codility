import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test1() {
		int[] A= {2,3,4,5};
		assertEquals(1, Solution.solution(A));
	}
	@Test
	void test2() {
		int[] A= {2};
		assertEquals(1, Solution.solution(A));
	}
	@Test
	void test3() {
		int[] A= {};
		assertEquals(1, Solution.solution(A));
	}
	@Test
	void test4() {
		int[] A= {2,3,1,4};
		assertEquals(5, Solution.solution(A));
	}

}
