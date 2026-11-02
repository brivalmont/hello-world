package example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DeliveryFeeTest {
    @Test
    void chargesTheLocalFeeAtTheBoundary() {
        assertEquals(250, new DeliveryFee().feeInCents(3));
    }

    @Test
    void chargesMoreOutsideTheLocalArea() {
        assertEquals(500, new DeliveryFee().feeInCents(4));
    }

    @Test
    void rejectsNegativeDistances() {
        assertThrows(IllegalArgumentException.class, () -> new DeliveryFee().feeInCents(-1));
    }
}
