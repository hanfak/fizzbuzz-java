
public class Fizzbuzz {

	public String evaluate(int number) {
		if(number % 3 == 0) {
			return "Fizz";
		}
		return Integer.toString(number);
	}

}
