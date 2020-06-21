import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] A = {9,3,9,3,9,7,9,7,11,11,1};
		assertEquals(1, Solution.solution(A));
	}

}
