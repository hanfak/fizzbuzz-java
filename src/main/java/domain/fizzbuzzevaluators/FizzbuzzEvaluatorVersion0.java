package domain.fizzbuzzevaluators;

import infrastructure.printers.Evaluator;

public class FizzbuzzEvaluatorVersion0 implements Evaluator {

	@Override
	public String evaluate(int number) {
		if( divisibleBy(number, 15) ) {
			return "FizzBuzz";
		}
		if( divisibleBy(number, 3) ) {
			return "Fizz";
		}
		if( divisibleBy(number, 5) ) {
			return "Buzz";
		}
		return Integer.toString(number);
	}
	
	private Boolean divisibleBy(int number, int divisor) {
		return number % divisor == 0;
	}

}
