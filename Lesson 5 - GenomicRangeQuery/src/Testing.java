import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test1() {
		String s="CAGCCTA";
		int[] P= {2,5,0};
		int[] Q= {4,5,6};
		int[] result= {2,4,1};
		
		assertArrayEquals(result, Solution.solution(s, P, Q));
	}

}
