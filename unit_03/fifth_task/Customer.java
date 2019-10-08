package fifth_task;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String lastname;
    private String address;
    private int numberCreditCard;
    private int numberBankAccount;

    public Customer(int id, String surname, String name, String lastname, String address, int numberCreditCard, int numberBankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.numberCreditCard = numberCreditCard;
        this.numberBankAccount = numberBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", numberCreditCard=" + numberCreditCard +
                ", numberBankAccount=" + numberBankAccount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(int numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getNumberBankAccount() {
        return numberBankAccount;
    }

    public void setNumberBankAccount(int numberBankAccount) {
        this.numberBankAccount = numberBankAccount;
    }
}
