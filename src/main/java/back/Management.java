package back;

import java.util.ArrayList;
import java.util.List;

public class Management {
    private List<Client> clients;
    private List<Employee> employees;
    private List<Product> products;
    private List<Transaction> transactions;

    public Management() {
        clients = new ArrayList<>();
        employees = new ArrayList<>();
        products = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        transaction.getClient().addTransaction(transaction);
        if (transaction.getVendor() != null) {
            ((Vendor) transaction.getVendor()).addTransaction(transaction);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void printAllSalaries() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSurname() + ": " + employee.calculateTotalSalary());
        }
    }
}
