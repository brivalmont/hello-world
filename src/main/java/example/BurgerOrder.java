package example;

/** A small, deterministic sample for compilation, coverage, and branch analysis. */
public record BurgerOrder(int quantity, boolean cheese) {
    public BurgerOrder {
        if (quantity < 1 || quantity > 20) {
            throw new IllegalArgumentException("Quantity must be between 1 and 20");
        }
    }

    public int totalInCents() {
        return quantity * (cheese ? 650 : 550);
    }
}
