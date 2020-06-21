import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void test1() {
		int[] A = {3, 8, 9, 7, 6};
		int[] result = {6, 3, 8, 9, 7};
		int K=1;
		assertArrayEquals(result,Solution.solution(A,K));
	}
	
	@Test
	void test2() {
		int[] A = {3, 8, 9, 7, 6};
		int[] result = {9, 7, 6, 3, 8};
		int K=3;
		assertArrayEquals(result,Solution.solution(A,K));
	}
	@Test
	void test3() {
		int[] A = {1, 2, 3, 4};
		int[] result = {1, 2, 3, 4};
		int K=4;
		assertArrayEquals(result,Solution.solution(A,K));
	}
	@Test
	void test4() {
		int[] A = {};
		int[] result = {};
		int K=4;
		assertArrayEquals(result,Solution.solution(A,K));
	}
	@Test
	void test5() {
		int[] A = {1, 2, 3, 4};
		int[] result = {1, 2, 3, 4};
		int K=0;
		assertArrayEquals(result,Solution.solution(A,K));
	}
}
