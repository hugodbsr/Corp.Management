package back;

public class Individual extends Client{

    public Individual(String name, String surname, String email, String phone, String address) {
        super(name, surname, email, phone, address);
    }

    public String getType() {
        return "Particulier";
    }
}
