package factorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import maventest1.Factorials;

public class TestingOne {

	@Test
	public void isNotFactorial() {
		assertEquals("NONE", Factorials.ReverseFactorial(3));
	}

	@Test
	public void isFactorial() {
		assertEquals("3", Factorials.ReverseFactorial(6));
	}

}
