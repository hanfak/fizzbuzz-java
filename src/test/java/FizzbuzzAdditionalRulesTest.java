import domain.FizzbuzzRules.FizzbuzzAdditionalRules;
import org.assertj.core.api.WithAssertions;
import org.junit.Test;

public class FizzbuzzAdditionalRulesTest implements WithAssertions {

    @Test
    public void returnsTrueIfDivisibleBy4() {
        assertThat(new FizzbuzzAdditionalRules().fizzRules(8)).isTrue();
    }

    @Test
    public void returnsFalseIfNotDivisibleBy4() {
        assertThat(new FizzbuzzAdditionalRules().fizzRules(14)).isFalse();
    }

    @Test
    public void returnsTrueIfDivisibleBy7() {
        assertThat(new FizzbuzzAdditionalRules().buzzRules(14)).isTrue();

    }

    @Test
    public void returnsFalseIfNotDivisibleBy7() {
        assertThat(new FizzbuzzAdditionalRules().buzzRules(8)).isFalse();
    }
}