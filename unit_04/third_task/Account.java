package third_task;

import java.util.Objects;

public class Account {
    private int id;
    private double balance;
    private boolean isBlocked;

    public Account(int id, double balance, boolean isBlocked) {
        this.id = id;
        this.balance = balance;
        this.isBlocked = balance<0?true:isBlocked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", isBlocked=" + isBlocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Double.compare(account.balance, balance) == 0 &&
                isBlocked == account.isBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, isBlocked);
    }
}
