package back;

public interface Person {
    int getID();
    String getName();
    String getSurname();
    String getEmail();
    String getPhone();
    String getAddress();

    void setName(String name);
    void setSurname(String surname);
    void setEmail(String email);
    void setPhone(String phone);
    void setAddress(String address);
}
