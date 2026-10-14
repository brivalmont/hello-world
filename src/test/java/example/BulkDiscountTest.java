package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BulkDiscountTest {
    @Test
    void keepsSmallOrdersAtFullPrice() {
        assertEquals(2200, new BulkDiscount().totalInCents(new BurgerOrder(4, false)));
    }

    @Test
    void discountsOrdersAtTheBulkThreshold() {
        assertEquals(2925, new BulkDiscount().totalInCents(new BurgerOrder(5, true)));
    }
}
