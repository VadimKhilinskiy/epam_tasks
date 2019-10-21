package third_task;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Client> clients;

    public Bank(Client... clients) {
        this.clients = new ArrayList<>();
        for(Client client : clients){
            this.clients.add(client);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        buff.append("List of clients: ");
        for(Client client : clients){
            buff.append(client.toString()+"\n");
        }
        return buff.toString();
    }
}
