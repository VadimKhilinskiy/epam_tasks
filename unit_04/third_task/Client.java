package third_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String name;
    private List<Account> accounts;

    public Client(String name, Account... accounts) {
        this.name = name;
        this.accounts = new ArrayList<>();
        for(Account account: accounts) {
            this.accounts.add(account);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        buff.append("Client: \n");
        buff.append("Name: "+this.name+"\n");
        buff.append("Accounts: \n");
        for(Account account : accounts){
            buff.append(account.toString()+"\n");
        }
        return buff.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(accounts, client.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, accounts);
    }
}
