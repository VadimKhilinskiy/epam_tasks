package fifth_task;

public class Main {
    public static void main(String... args) {
        Shop shop = new Shop();
        shop.addCustomer(1,"f;khjdhkjgh","tyhiojg","ehtyhkorg","triojgljkhrit",132645676,789346536);
        shop.addCustomer(2,"r;ltjdhkjgh","itykoojg","etyihjthrg","t'pkjtriojhrit",841375676,456346536);
        shop.addCustomer(3,"jdhdlkfjvkjgh","t;okiojg","ehtyhlrg","trityjkojhrit",671375676,123346536);
        shop.addCustomer(4,"dlkgjjdhkjgh","it;hkojg","tyjkyehrg","triotykjjhrit",137975676,954346536);
        shop.addCustomer(5,"trl;hjdhkjgh","rtokhiojg","etyjlkhrg","tyjp'ktyjtriojhrit",231375676,865346536);
        shop.addCustomer(6,"jtf;kfdhkjgh","t;ohiojg","eytjokhrg","triojhrtykjit",138675676,756346536);
        shop.addCustomer(7,"dgijjdhkjgh","irgh;kojg","ehrytpkjg","triotypkojjhrit",961375676,358446536);
        shop.addCustomer(8,"fkjjdhkjgh","ifh;okojg","etyjk'thrg","tkjttriojhrit",451375676,568346536);
        System.out.println();
        for(Customer c: shop.getCustomers()) {
            System.out.println("Customer{" +
                    "id=" + c.getId() +
                    ", surname='" + c.getSurname() + '\'' +
                    ", name='" + c.getName() + '\'' +
                    ", lastname='" + c.getLastname() + '\'' +
                    ", address='" + c.getAddress() + '\'' +
                    ", numberCreditCard=" + c.getNumberCreditCard() +
                    ", numberBankAccount=" + c.getNumberBankAccount() +
                    '}');
        }
        System.out.println();
        shop.sort();
        for(Customer c: shop.getCustomers()) {
            System.out.println("Customer{" +
                    "id=" + c.getId() +
                    ", surname='" + c.getSurname() + '\'' +
                    ", name='" + c.getName() + '\'' +
                    ", lastname='" + c.getLastname() + '\'' +
                    ", address='" + c.getAddress() + '\'' +
                    ", numberCreditCard=" + c.getNumberCreditCard() +
                    ", numberBankAccount=" + c.getNumberBankAccount() +
                    '}');
        }
        System.out.println("From diapason 100000000 - 400000000: ");
        shop.chooseFromDiapason(100000000,400000000);
        for(Customer c: shop.getCustomers()) {
            System.out.println("Customer{" +
                    "id=" + c.getId() +
                    ", surname='" + c.getSurname() + '\'' +
                    ", name='" + c.getName() + '\'' +
                    ", lastname='" + c.getLastname() + '\'' +
                    ", address='" + c.getAddress() + '\'' +
                    ", numberCreditCard=" + c.getNumberCreditCard() +
                    ", numberBankAccount=" + c.getNumberBankAccount() +
                    '}');
        }
    }


}
