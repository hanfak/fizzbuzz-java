
public class Fizzbuzz {

	public String evaluate(int number) {
		if(number % 3 == 0) {
			return "Fizz";
		}
		if(number % 5 == 0) {
			return "Buzz";
		}
		return Integer.toString(number);
	}

}
