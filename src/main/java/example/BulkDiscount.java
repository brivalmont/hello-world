package example;

public final class BulkDiscount {
    public int totalInCents(BurgerOrder order) {
        int total = order.totalInCents();
        return order.quantity() >= 5 ? total * 90 / 100 : total;
    }
}
