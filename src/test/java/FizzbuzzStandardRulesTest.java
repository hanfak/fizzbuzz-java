import domain.FizzbuzzRules.FizzbuzzStandardRules;
import org.assertj.core.api.WithAssertions;
import org.junit.Test;

public class FizzbuzzStandardRulesTest implements WithAssertions {

    @Test
    public void returnsTrueIfDivisibleBy3() {
        assertThat(new FizzbuzzStandardRules().fizzRules(9)).isTrue();
    }

    @Test
    public void returnsFalseIfNotDivisibleBy3() {
        assertThat(new FizzbuzzStandardRules().fizzRules(10)).isFalse();
    }

    @Test
    public void returnsTrueIfDivisibleBy5() {
        assertThat(new FizzbuzzStandardRules().buzzRules(15)).isTrue();

    }

    @Test
    public void returnsFalseIfNotDivisibleBy5() {
        assertThat(new FizzbuzzStandardRules().buzzRules(9)).isFalse();

    }
}