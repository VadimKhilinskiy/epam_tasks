package services;

import dao.DAOException;
import dao.DAOFactory;
import dao.TransactionDAO;

public class IdGenerator {
    private static final IdGenerator instance = new IdGenerator();

    public static IdGenerator getInstance() {
        return instance;
    }

    public int nextId() throws ServiceException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        TransactionDAO transactionDAO = daoFactory.getTransactionDAO();

        try {
            int lastId = transactionDAO.lastId();
            return lastId + 1;
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
