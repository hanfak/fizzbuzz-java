import org.junit.Test;

public class FizzbuzzTest {
	@Test
	public void canCreateClass() {
		new Fizzbuzz();
	}
	
	@Test
	public void canEvaluate() {
		Fizzbuzz fizzbuzz = 	new Fizzbuzz();
		fizzbuzz.evaluate(1);
	}
}
