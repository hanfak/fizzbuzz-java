import domain.fizzbuzzevaluators.FizzbuzzEvaluatorVersion3;
import domain.fizzbuzzevaluators.Rules;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


public class FizzbuzzEvaluatorVersion3UsingAnylRulesTest {

	private FizzbuzzEvaluatorVersion3 fizzbuzz;
	private final Rules rules = Mockito.mock(Rules.class);

	@Before
	public void setUp() {
		fizzbuzz = 	new FizzbuzzEvaluatorVersion3(rules);
	}

	@Test
	public void returnsNumber() {
		when(rules.fizzRules(1)).thenReturn(false);
		when(rules.buzzRules(1)).thenReturn(false);

		assertThat(fizzbuzz.evaluate(1)).isEqualTo("1");
	}
	
	@Test
	public void returnsAnyNumber() {
		when(rules.fizzRules(2)).thenReturn(false);
		when(rules.buzzRules(2)).thenReturn(false);

		assertThat(fizzbuzz.evaluate(2)).isEqualTo("2");
	}
	
	@Test
	public void fourReturnsFizz() {
		when(rules.fizzRules(4)).thenReturn(true);
		when(rules.buzzRules(4)).thenReturn(false);

		assertThat(fizzbuzz.evaluate(4)).isEqualTo("Fizz");
	}
	
	@Test
	public void factorOfFourReturnsFizz() {
		when(rules.fizzRules(12)).thenReturn(true);
		when(rules.buzzRules(12)).thenReturn(false);

		assertThat(fizzbuzz.evaluate(12)).isEqualTo("Fizz");
	}
	
	@Test
	public void sevenReturnsBuzz() {
		when(rules.fizzRules(7)).thenReturn(false);
		when(rules.buzzRules(7)).thenReturn(true);

		assertThat(fizzbuzz.evaluate(7)).isEqualTo("Buzz");
	}
	
	@Test
	public void factorOfSevenReturnsBuzz() {
		when(rules.fizzRules(14)).thenReturn(false);
		when(rules.buzzRules(14)).thenReturn(true);

		assertThat(fizzbuzz.evaluate(14)).isEqualTo("Buzz");
	}
	
	@Test
	public void twentyEightReturnsFizzBuzz() {
		when(rules.fizzRules(14)).thenReturn(true);
		when(rules.buzzRules(14)).thenReturn(true);

		assertThat(fizzbuzz.evaluate(14)).isEqualTo("FizzBuzz");
	}
	
	@Test
	public void factorOfFourAndSevenReturnsFizzBuzz() {
		when(rules.fizzRules(112)).thenReturn(true);
		when(rules.buzzRules(112)).thenReturn(true);

		assertThat(fizzbuzz.evaluate(112)).isEqualTo("FizzBuzz");
	}
}
