public class Item {
    private String name;
    private double price;
    private int quantity;
    private TaxStrategy taxStrategy;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.taxStrategy = new NoTaxStrategy();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public TaxStrategy getTaxStrategy() {
        return taxStrategy;
    }

    public double calculateTotal() {
        double subtotal = price * quantity;
        return taxStrategy.calculateTax(subtotal);
    }
}
