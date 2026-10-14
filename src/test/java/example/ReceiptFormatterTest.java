package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReceiptFormatterTest {
    @Test
    void formatsHamburgerReceipts() {
        assertEquals("2 x hamburger: 1100 cents",
                new ReceiptFormatter().format(new BurgerOrder(2, false)));
    }

    @Test
    void formatsCheeseburgerReceipts() {
        assertEquals("1 x cheeseburger: 650 cents",
                new ReceiptFormatter().format(new BurgerOrder(1, true)));
    }
}
