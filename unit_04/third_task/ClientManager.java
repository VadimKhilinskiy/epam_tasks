package third_task;

import java.util.Collections;

public class ClientManager {

    private ClientAccountComparator comparator;

    public ClientManager(){
        comparator = new ClientAccountComparator();
    }

    public Account getAccountById(Client client, int id){
        for(Account account : client.getAccounts()){
            if(account.getId() == id){
                return account;
            }
        }
        return null;
    }

    public void sortClientAccounts(Client client){
        Collections.sort(client.getAccounts(), this.comparator);
    }

    public double getOverallSumOfAccounts(Client client){
        double sum = .0;
        for(Account account:client.getAccounts()){
            sum+=account.getBalance();
        }
        return sum;
    }

    public double getNegativeSumOfAccounts(Client client){
        double sum = .0;
        for(Account account: client.getAccounts()){
            if(account.getBalance()<0){
                sum+=account.getBalance();
            }
        }
        return sum;
    }

    public double getPositiveSumOfAccounts(Client client){
        double sum = .0;
        for(Account account : client.getAccounts()){
            if(!account.isBlocked() && account.getBalance()>0){
                sum+=account.getBalance();
            }
        }
        return sum;
    }
}
