package domain.fizzbuzzevaluators;

import infrastructure.printers.Evaluator;

public class FizzbuzzEvaluatorVersion3 implements Evaluator {

    private final Rules rules;

    public FizzbuzzEvaluatorVersion3(Rules rules) {
        this.rules = rules;
    }

    @Override
    public String evaluate(int number) {
        boolean divisibleBy3 = rules.fizzRules(number);
        boolean divisibleBy5 = rules.buzzRules(number);

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        }
        if (divisibleBy3) {
            return "Fizz";
        }
        if (divisibleBy5) {
            return "Buzz";
        }


        return Integer.toString(number);
    }
}
