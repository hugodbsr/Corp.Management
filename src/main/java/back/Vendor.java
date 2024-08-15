package back;

import java.util.ArrayList;
import java.util.List;

public class Vendor extends Employee {
    private List<Transaction> transactions;
    private double totalCommission;

    public Vendor(String name, String surname, String email, String phone, String address, double wage) {
        super(name, surname, email, phone, address, wage);
        this.transactions = new ArrayList<>();
        this.totalCommission = 0.0;
    }

    @Override
    public String getType() {
        return "Vendeur";
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public double getTotalCommission() {
        return totalCommission;
    }

    public void addCommission(double commission) {
        this.totalCommission += commission;
    }

    @Override
    public double calculateTotalSalary() {
        return getWage() + totalCommission;
    }
}
