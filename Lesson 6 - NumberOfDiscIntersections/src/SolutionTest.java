import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] a= {-3,1,2,-2,5,6};
		assertEquals(60, Solution.solution(a));
	}
	@Test
	void test2() {
		int[] a= {-5,-5,5,2,5,4};
		assertEquals(125, Solution.solution(a));
	}
}
