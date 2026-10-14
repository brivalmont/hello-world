package example;

public final class DeliveryFee {
    public int feeInCents(int distanceInKilometers) {
        if (distanceInKilometers < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        return distanceInKilometers <= 3 ? 250 : 500;
    }
}
