import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	void test1() {
		int[] A= {1,3,6,4,1,2};
		assertEquals(5,Solution.solution(A));
	}
	@org.junit.jupiter.api.Test
	void test2() {
		int[] A= {1,2,3};
		assertEquals(4,Solution.solution(A));
	}
	@org.junit.jupiter.api.Test
	void test3() {
		int[] A= {-1,-3};
		assertEquals(1,Solution.solution(A));
	}
	@org.junit.jupiter.api.Test
	void test4() {
		int[] A= {-1,-3,0,5};
		assertEquals(1,Solution.solution(A));
	}
}
