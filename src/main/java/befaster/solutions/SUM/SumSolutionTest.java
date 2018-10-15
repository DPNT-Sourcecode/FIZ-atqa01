package befaster.solutions.SUM;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumSolutionTest {

	@Test
	public void testCompute() {
		SumSolution s = new SumSolution();
		assertEquals(5,s.compute(3,2));
		assertFalse(4 == s.compute(3, 2));
		try {
			assertEquals(101, s.compute(1,100));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		fail("Not yet implemented");
	}

}
