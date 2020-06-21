import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] A= {1,3,4,4,4};
		int X=4;
		assertEquals(-1, Solution.solution(X,A));
	}

}
