package week8labactivity;

// Invoice.java
// Notice Invoice does NOT inherit from Employee. They are unrelated.
public class invoice implements Payable {
    private String partNumber;
    private int quantity;
    private double pricePerItem;

    public invoice() {
    }

    public invoice(String part, int qty, double price) {
        this.partNumber = part;
        this.quantity = qty;
        this.pricePerItem = price;
    }

    public invoice(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}