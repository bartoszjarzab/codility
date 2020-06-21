import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test() {
		int[] a= {2,1,1,2,3,1};
		assertEquals(3, Solution.solution(a));
	}

}
