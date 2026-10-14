package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BurgerOrderTest {
    @Test
    void pricesPlainBurgers() {
        assertEquals(1100, new BurgerOrder(2, false).totalInCents());
    }

    @Test
    void pricesCheeseburgers() {
        assertEquals(1950, new BurgerOrder(3, true).totalInCents());
    }

    @Test
    void acceptsMaximumQuantity() {
        assertEquals(11000, new BurgerOrder(20, false).totalInCents());
    }

    @Test
    void rejectsInvalidQuantities() {
        assertThrows(IllegalArgumentException.class, () -> new BurgerOrder(0, false));
        assertThrows(IllegalArgumentException.class, () -> new BurgerOrder(21, true));
    }
}
