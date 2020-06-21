package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modules.Solution;

class Testing {


	@Test
	void solutionTest1() {
		assertEquals(5, Solution.solution(1041));
	}

	@Test
	void solutionTest2() {
		assertEquals(0, Solution.solution(32));
	}
	@Test
	void solutionTest3() {
		assertEquals(0, Solution.solution(2_147_483_647));
	}

}
