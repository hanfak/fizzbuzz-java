import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion0;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzbuzzEvaluatorVersion0Test {

	private FizzbuzzEvaluatorVersion0 fizzbuzz;

	@Before
	public void setUp() {
		fizzbuzz = 	new FizzbuzzEvaluatorVersion0();
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
	
	@Test
	public void fifteenReturnsFizzBuzz() {
		assertEquals("FizzBuzz", fizzbuzz.evaluate(15));
	}
	
	@Test
	public void factorOfFifteenReturnsFizzBuzz() {
		assertEquals("FizzBuzz", fizzbuzz.evaluate(45));
	}
}
