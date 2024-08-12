package back;

import java.util.Date;

public class Transaction {
    private static int idCounter = 0;
    private final int ID;
    private Client client;
    private Product product;
    private int quantity;
    private Date date;
    private double totalPrice;
    private Vendor vendor;
    private double commission;

    public Transaction(Client client, Product product, int quantity, Vendor vendor) {
        this.ID = ++idCounter;
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.date = new Date();
        this.totalPrice = product.getPrice() * quantity;
        this.vendor = vendor;
        this.commission = calculateCommission();

        product.reduceStock(quantity);

        client.addTransaction(this);

        vendor.addTransaction(this);
        vendor.addCommission(commission);
    }

    public int getID() {
        return ID;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDate() {
        return date;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public double getCommission() {
        return commission;
    }

    private double calculateCommission() {
        return totalPrice * 0.05;
    }
}
