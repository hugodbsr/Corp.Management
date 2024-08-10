package back;

public class Professional extends Client{

    public Professional(String name, String surname, String email, String phone, String address) {
        super(name, surname, email, phone, address);
    }

    public String getType() {
        return "Professionnel";
    }
}
