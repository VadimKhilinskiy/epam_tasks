package fourth_task;

import java.util.Objects;

public class Voucher {
    private Type type;
    private Food food;
    private Transport transport;
    private int numberOfDays;

    public Voucher(Type type, Food food, Transport transport, int numberOfDays) {
        this.type = type;
        this.food = food;
        this.transport = transport;
        this.numberOfDays = numberOfDays;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "type=" + type +
                ", food=" + food +
                ", transport=" + transport +
                ", numberOfDays=" + numberOfDays +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voucher voucher = (Voucher) o;
        return numberOfDays == voucher.numberOfDays &&
                type == voucher.type &&
                food == voucher.food &&
                transport == voucher.transport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, food, transport, numberOfDays);
    }
}
