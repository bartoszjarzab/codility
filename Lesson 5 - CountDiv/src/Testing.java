import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test1() {
		int A=6, B=11, K=2;
		assertEquals(3, Solution.solution(A, B, K));
	}
	@Test
	void test2() {
		int A=6, B=11, K=2;
		
		int result;
		
		result =(11-6)/2;
		System.out.println(result);
		
	}
}
