package third_task;

public class BankManager {
    private ClientManager clientManager;
    private Bank bank;

    public BankManager(Bank bank) {
        this.clientManager = new ClientManager();
        this.bank = bank;
    }

    public ClientManager getClientManager() {
        return clientManager;
    }

    public void setClientManager(ClientManager clientManager) {
        this.clientManager = clientManager;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Account getAccountById(int id){
        for(Client client : bank.getClients()){
            if(clientManager.getAccountById(client,id)!=null){
                return clientManager.getAccountById(client,id);
            }
        }
        return null;
    }

    public void sortById(){
        bank.getClients().stream().forEach(client -> clientManager.sortClientAccounts(client));
    }

    public double getOverallSumOfAccounts(){
        double sum = .0;
        for(Client client:bank.getClients()){
            sum+=clientManager.getOverallSumOfAccounts(client);
        }
        return sum;
    }

    public double getNegativeSumOfAccounts(){
        double sum = .0;
        for(Client client:bank.getClients()){
            sum+=clientManager.getNegativeSumOfAccounts(client);
        }
        return sum;
    }

    public double getPositiveSumOfAccounts(){
        double sum = .0;
        for(Client client:bank.getClients()){
            sum+=clientManager.getPositiveSumOfAccounts(client);
        }
        return sum;
    }


}
