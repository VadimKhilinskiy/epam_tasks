package dao;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();
    private final UserDAO fileUserImpl = new UserDAO();
    private final TransactionDAO fileTransactionImpl = new TransactionDAO();

    public static DAOFactory getInstance() {
        return instance;
    }
    public UserDAO getUserDAO() {
        return fileUserImpl;
    }
    public TransactionDAO getTransactionDAO() {
        return fileTransactionImpl;
    }
}
