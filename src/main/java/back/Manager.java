package back;

public class Manager extends Employee{

    public Manager(String name, String surname, String email, String phone, String address, double wage) {
        super(name, surname, email, phone, address, wage);
    }

    public String getType() {
        return "Manager";
    }
}
