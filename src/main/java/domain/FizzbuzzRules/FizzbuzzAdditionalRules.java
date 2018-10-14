package domain.FizzbuzzRules;

import domain.fizzbuzzevaluators.Rules;

public class FizzbuzzAdditionalRules implements Rules {
    @Override
    public boolean fizzRules(int number) {
        return number % 4 == 0;
    }

    @Override
    public boolean buzzRules(int number) {
        return number % 7 == 0;
    }
}
