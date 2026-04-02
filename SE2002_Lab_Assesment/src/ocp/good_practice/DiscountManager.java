public class DiscountManager {

    public double processDiscount(double price, DiscountStrategy strategy) {
        return strategy.applyDiscount(price);
    }
}