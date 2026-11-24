package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KnownIssuesTest {
    @Test
    void totalUnitsSupportsResultsBeyondIntegerRange() {
        assertEquals(2_500_000_000L, new KnownIssues().totalUnits(50_000, 50_000));
    }
}
