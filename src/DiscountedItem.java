public class DiscountedItem extends Item {
    private Discount discount;

    public DiscountedItem(String name, double price, int quantity, Discount discount) {
        super(name, price, quantity);
        this.discount = discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }

    @Override
    public double calculateTotal() {
        double subtotal = getPrice() * getQuantity();
        if (discount != null) {
            subtotal = discount.apply(subtotal);
        }
        return getTaxStrategy().calculateTax(subtotal);
    }
}
