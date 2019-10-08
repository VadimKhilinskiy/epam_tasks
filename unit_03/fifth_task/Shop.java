package fifth_task;

import java.util.ArrayList;
import java.util.Comparator;

public class Shop {
    private ArrayList<Customer> customers;

    public Shop()
    {
        customers = new ArrayList<>();
    }

    public void addCustomer(int id, String surname, String name, String lastname, String address, int numberCreditCard, int numberBankAccount)
    {
        customers.add(new Customer(id, surname, name, lastname, address, numberCreditCard, numberBankAccount));
    }

    public void generateCustomers()
    {
        addCustomer(1,"f;khjdhkjgh","tyhiojg","ehtyhkorg","triojgljkhrit",132645676,789346536);
        addCustomer(2,"r;ltjdhkjgh","itykoojg","etyihjthrg","t'pkjtriojhrit",841375676,456346536);
        addCustomer(3,"jdhdlkfjvkjgh","t;okiojg","ehtyhlrg","trityjkojhrit",671375676,123346536);
        addCustomer(4,"dlkgjjdhkjgh","it;hkojg","tyjkyehrg","triotykjjhrit",137975676,954346536);
        addCustomer(5,"trl;hjdhkjgh","rtokhiojg","etyjlkhrg","tyjp'ktyjtriojhrit",231375676,865346536);
        addCustomer(6,"jtf;kfdhkjgh","t;ohiojg","eytjokhrg","triojhrtykjit",138675676,756346536);
        addCustomer(7,"dgijjdhkjgh","irgh;kojg","ehrytpkjg","triotypkojjhrit",961375676,358446536);
        addCustomer(8,"fkjjdhkjgh","ifh;okojg","etyjk'thrg","tkjttriojhrit",451375676,568346536);
    }

    public void printAll() {
        System.out.println();
        for(Customer c: customers) {
            System.out.println(c.toString());
        }
        System.out.println();
    }

    public void sort() {
        customers.sort(new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {

                if (!o1.getSurname().equals(o2.getSurname())) {
                    return o1.getSurname().compareTo(o2.getSurname());
                } else if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                } else if (!o1.getLastname().equals(o2.getLastname())) {
                    return o1.getLastname().compareTo(o2.getLastname());
                }
                return 0;
            }
        });
    }

        public void chooseFromDiapason(int left, int right)
        {
            System.out.println("From diapason: ");
            customers.stream().filter(customer->(customer.getNumberCreditCard()>=left && customer.getNumberCreditCard()<=right)).forEach(System.out::println);
        }

}
