import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzbuzzTest {
	private Fizzbuzz fizzbuzz;

	@Before
	public void setUp() throws Exception {
		fizzbuzz = 	new Fizzbuzz();
	}

	@Test
	public void returnsNumber() {
		assertEquals("1", fizzbuzz.evaluate(1));
	}
	
	@Test
	public void returnsAnyNumber() {
		assertEquals("2", fizzbuzz.evaluate(2));
	}
	
	@Test
	public void threeReturnsFizz() {
		assertEquals("Fizz", fizzbuzz.evaluate(3));
	}
	
	@Test
	public void factorOfThreeReturnsFizz() {
		assertEquals("Fizz", fizzbuzz.evaluate(12));
	}
	
	@Test
	public void fiveReturnsBuzz() {
		assertEquals("Buzz", fizzbuzz.evaluate(5));
	}
	
	@Test
	public void factorOfFiveReturnsBuzz() {
		assertEquals("Buzz", fizzbuzz.evaluate(20));
	}
	
}
