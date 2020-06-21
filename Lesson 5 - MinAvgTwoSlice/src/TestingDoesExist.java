import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

class TestingDoesExist {
	
	@Test
	void test1() {
		int[] A= {9988,-5983,-4934,770};
		assertEquals(1, DoesExist.lowestAverageOfTwo(A));
	}

}
