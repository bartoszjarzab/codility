import static org.junit.jupiter.api.Assertions.*;

class Test {

//	@org.junit.jupiter.api.Test
//	void testLatestMaxingPosition() {
//		int[] A = {3,4,4,6,1,4,4};
//		int N=5;
//		assertEquals(3, Solution.latestMaxingPosition(N, A));
//	}
	@org.junit.jupiter.api.Test
	void testSolution() {
		int[] A = {3,4,4,6,1,4,4};
		int N=5;
		int[] expectedResult = {3,2,2,4,2};
		assertArrayEquals(expectedResult, Solution.solution(N, A));
	}
	@org.junit.jupiter.api.Test
	void testSolution2() {
		int[] A = {6,6,6,6,6,6,6};
		int N=5;
		int[] expectedResult = {0,0,0,0,0};
		assertArrayEquals(expectedResult, Solution.solution(N, A));
	}
	@org.junit.jupiter.api.Test
	void testSolution3() {
		int[] A = {1,2,3,4,5};
		int N=5;
		int[] expectedResult = {1,1,1,1,1};
		assertArrayEquals(expectedResult, Solution.solution(N, A));
	}
	@org.junit.jupiter.api.Test
	void testSolution4() {
		int[] A = {9,8,9,8,9,8,9,9,8,9,8,9,8,9,8,9,8,9,8,9};
		int N=8;
		int[] expectedResult = {9,9,9,9,9,9,9,9};
		assertArrayEquals(expectedResult, Solution.solution(N, A));
	}


}
