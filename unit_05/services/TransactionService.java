package services;

import beans.Transaction;
import dao.DAOException;
import dao.DAOFactory;
import dao.TransactionDAO;

public class TransactionService {

    public void createTransaction(Transaction transaction) throws ServiceException {
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            TransactionDAO transactionDAO = daoFactory.getTransactionDAO();
            transactionDAO.addTransaction(transaction);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    public Transaction readTransaction(int transactionId) throws ServiceException {
        if (transactionId < 0) {
            throw new ServiceException("Incorrect id");
        }

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            TransactionDAO transactionDAO = daoFactory.getTransactionDAO();
            Transaction transaction = transactionDAO.findTransactionById(transactionId);

            return transaction;

        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    public void updateTransaction(int transactionId, Transaction newTransaction) throws ServiceException {
        if (transactionId < 0) {
            throw new ServiceException("Incorrect id");
        }

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            TransactionDAO transactionDAO = daoFactory.getTransactionDAO();

            Transaction oldTransaction = transactionDAO.findTransactionById(transactionId);
            transactionDAO.deleteTransaction(oldTransaction);
            transactionDAO.addTransaction(newTransaction);

        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }

    public void deleteTransaction(int transactionId) throws ServiceException {
        if (transactionId < 0) {
            throw new ServiceException("Incorrect id");
        }

        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            TransactionDAO transactionDAO = daoFactory.getTransactionDAO();
            transactionDAO.deleteTransaction(transactionId);
        } catch (DAOException e) {
            throw new ServiceException(e.getMessage());
        }
    }
}
