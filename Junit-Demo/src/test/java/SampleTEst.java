import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTEst {

	@Test
	public void simpletestPass()
	{
		int a = 1;
		int b = 2;
		assertTrue(a+b == 3);
	}
	@Test
	public void simpletestFail()
	{
		int a = 1;
		int b = 2;
		assertTrue(a+b == 4);
	}
}
