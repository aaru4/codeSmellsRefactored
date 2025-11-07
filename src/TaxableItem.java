public class TaxableItem extends Item {
    private double taxRate = 7.0;

    public TaxableItem(String name, double price, int quantity) {
        super(name, price, quantity);
        setTaxStrategy(new StandardTaxStrategy(taxRate));
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double rate) {
        if (rate >= 0) {
            taxRate = rate;
            setTaxStrategy(new StandardTaxStrategy(rate));
        }
    }
}
