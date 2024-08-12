package back;

public abstract class Employee implements Person {
    private static int idCounter;
    private final int ID;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    private double wage;
    private double post;

    public Employee(String name, String surname, String email, String phone, String address, double wage, double post) {
        ID = idCounter++;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.wage = wage;
        this.post = post;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getPost() {
        return post;
    }

    public void setPost(double post) {
        this.post = post;
    }

    public abstract String getType();

    public double calculateTotalSalary() {
        return wage;
    }
}
