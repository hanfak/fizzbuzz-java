import org.junit.Before;
import org.junit.Test;

public class FizzbuzzTest {
	private Fizzbuzz fizzbuzz;

	@Before
	public void setUp() throws Exception {
		fizzbuzz = 	new Fizzbuzz();
	}
	
	@Test
	public void canEvaluate() {
		fizzbuzz.evaluate(1);
	}
}
