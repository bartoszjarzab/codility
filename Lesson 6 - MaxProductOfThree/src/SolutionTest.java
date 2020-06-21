import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] a= {1,5,2,1,4,0};
		assertEquals(11, Solution.solution(a));
	}
}
