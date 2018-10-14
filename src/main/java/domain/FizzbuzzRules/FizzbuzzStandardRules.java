package domain.FizzbuzzRules;

import domain.fizzbuzzevaluators.Rules;

public class FizzbuzzStandardRules implements Rules {
    @Override
    public boolean fizzRules(int number) {
        return number % 3 == 0;
    }

    @Override
    public boolean buzzRules(int number) {
        return number % 5 == 0;
    }
}
