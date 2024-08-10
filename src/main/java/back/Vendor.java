package back;

public class Vendor extends Employee{

    public Vendor(String name, String surname, String email, String phone, String address, double wage, double post) {
        super(name, surname, email, phone, address, wage, post);
    }

    public String getType() {
        return "Vendeur";
    }
}
