package example;

public final class ReceiptFormatter {
    public String format(BurgerOrder order) {
        String item = order.cheese() ? "cheeseburger" : "hamburger";
        return order.quantity() + " x " + item + ": " + order.totalInCents() + " cents";
    }
}
