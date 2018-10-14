package domain.fizzbuzzevaluators;

import infrastructure.printers.Evaluator;

public class FizzbuzzEvaluatorVersion1 implements Evaluator {
    @Override
    public String evaluate(int number) {
        if (divisibleBy15(number)) {
            return "FizzBuzz";
        }
        if (divisibleBy3(number)) {
            return "Fizz";
        }
        if (divisibleBy5(number)) {
            return "Buzz";
        }
        return Integer.toString(number);
    }

    private boolean divisibleBy15(int number) {
        return divisibleBy3(number) && divisibleBy5(number);
    }

    private boolean divisibleBy5(int number) {
        return number % 5 == 0;
    }

    private boolean divisibleBy3(int number) {
        return number % 3 == 0;
    }
}
