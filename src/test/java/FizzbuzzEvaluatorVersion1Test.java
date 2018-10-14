import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion1;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FizzbuzzEvaluatorVersion1Test  {

	private FizzbuzzEvaluatorVersion1 fizzbuzz;

	@Before
	public void setUp() {
		fizzbuzz = 	new FizzbuzzEvaluatorVersion1();
	}

	@Test
	public void returnsNumber() {
		assertThat(fizzbuzz.evaluate(1)).isEqualTo("1");
	}
	
	@Test
	public void returnsAnyNumber() {
		assertThat(fizzbuzz.evaluate(2)).isEqualTo("2");
	}
	
	@Test
	public void threeReturnsFizz() {
		assertThat(fizzbuzz.evaluate(3)).isEqualTo("Fizz");
	}
	
	@Test
	public void factorOfThreeReturnsFizz() {
		assertThat(fizzbuzz.evaluate(12)).isEqualTo("Fizz");
	}
	
	@Test
	public void fiveReturnsBuzz() {
		assertThat(fizzbuzz.evaluate(5)).isEqualTo("Buzz");
	}
	
	@Test
	public void factorOfFiveReturnsBuzz() {
		assertThat(fizzbuzz.evaluate(20)).isEqualTo("Buzz");
	}
	
	@Test
	public void fifteenReturnsFizzBuzz() {
		assertThat(fizzbuzz.evaluate(15)).isEqualTo("FizzBuzz");
	}
	
	@Test
	public void factorOfFifteenReturnsFizzBuzz() {
		assertThat(fizzbuzz.evaluate(45)).isEqualTo("FizzBuzz");
	}
}
