package third_task;

public class Main {
    public static void main(String... args){
        Account ac1 = new Account(1332,2834.23,false);
        Account ac2 = new Account(234,7360.34,false);
        Account ac3 = new Account(4453,-6423.34,false);
        Account ac4 = new Account(143,834.33,false);
        Account ac5 = new Account(3241,234.23,false);
        Account ac6 = new Account(1543,123.56,false);

        Client cl1 = new Client("Client1",ac1,ac2,ac3);
        Client cl2 = new Client("Client2", ac4,ac5,ac6);

        Bank bank = new Bank(cl1,cl2);

        BankManager bankManager = new BankManager(bank);

        System.out.println("Account with id = 234: \n"+ bankManager.getAccountById(234).toString());

        System.out.println("Overall sum of account balances: "+bankManager.getOverallSumOfAccounts());

        System.out.println("Negative sum of account balances: "+bankManager.getNegativeSumOfAccounts());

        System.out.println("Positive sum of account balances: "+bankManager.getPositiveSumOfAccounts());

    }
}
