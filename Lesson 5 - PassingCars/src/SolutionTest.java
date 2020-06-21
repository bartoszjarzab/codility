import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] a= {0,1,0,1,1};
		assertEquals(5, Solution.solution(a));
	}

}
