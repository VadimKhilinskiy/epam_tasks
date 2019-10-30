package services;

public class ServiceFactory {
    private IdGenerator idGenerator = IdGenerator.getInstance();
    private static final ServiceFactory instance = new ServiceFactory();
    private final TransactionService transactionService = new TransactionService();
    private final UserService userService = new UserService();

    public static ServiceFactory getInstance() {
        return instance;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }

    public UserService getUserService() {
        return userService;
    }

    public IdGenerator getIdGenerator() {
        return idGenerator;
    }
}
