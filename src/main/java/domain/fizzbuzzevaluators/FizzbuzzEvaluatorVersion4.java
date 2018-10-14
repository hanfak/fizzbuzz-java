package domain.fizzbuzzevaluators;

import infrastructure.printers.Evaluator;

public class FizzbuzzEvaluatorVersion4 implements Evaluator {
    private Rules rules;

    public FizzbuzzEvaluatorVersion4(Rules rules) {
        this.rules = rules;
    }

    @Override
    public String evaluate(int number) {
        return null;
    }
}
