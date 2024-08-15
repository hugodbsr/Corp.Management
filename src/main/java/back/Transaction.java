package back;

import java.time.LocalDate;

public class Transaction {
    private static int idCounter = 1;
    private final int ID;
    private Client client;
    private Product product;
    private int quantity;
    private LocalDate date;
    private double totalPrice;
    private Vendor vendor;
    private double commission;

    public Transaction(Client client, Product product, int quantity, Vendor vendor) {
        this.ID = ++idCounter;
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.date = LocalDate.now();
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

    public LocalDate getDate() {
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
