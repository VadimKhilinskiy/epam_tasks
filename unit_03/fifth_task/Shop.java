package fifth_task;

import java.util.ArrayList;
import java.util.Comparator;

public class Shop {
    private ArrayList<Customer> customers;

    public Shop() {
        customers = new ArrayList<>();
    }

    public void addCustomer(int id, String surname, String name, String lastname, String address, int numberCreditCard, int numberBankAccount) {
        customers.add(new Customer(id, surname, name, lastname, address, numberCreditCard, numberBankAccount));
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void sort() {
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {

                if (!o1.getSurname().equals(o2.getSurname())) {
                    return o1.getSurname().compareTo(o2.getSurname());
                }
                else if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                else if (!o1.getLastname().equals(o2.getLastname())) {
                    return o1.getLastname().compareTo(o2.getLastname());
                }
                return 0;
            }
        });
    }

        public void chooseFromDiapason(int left, int right) {
            customers.stream().filter(customer->(customer.getNumberCreditCard()>=left && customer.getNumberCreditCard()<=right)).forEach(System.out::println);
        }

}
