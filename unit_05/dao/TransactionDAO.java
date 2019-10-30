package dao;

import beans.Transaction;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {

    private String transactionsPath = "resource/...";

    public void addTransaction(Transaction transaction) throws DAOException {
        try (FileWriter noteWriter = new FileWriter(transactionsPath)) {
            String transactionInfo = transaction.getId() + " " + transaction.getDescription() + " " + transaction.getSum();
            noteWriter.write(transactionInfo);
            noteWriter.flush();
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }

    public List<Transaction> readTransactions() throws DAOException {
        try (BufferedReader noteReader = new BufferedReader(new FileReader(transactionsPath))) {
            List<Transaction> transactions = new ArrayList<>();
            String note;
            String[] transactionInfo;
            while ((note = noteReader.readLine()) != null) {
                transactionInfo = note.split(" ");
                transactions.add(new Transaction(Integer.parseInt(transactionInfo[0]), transactionInfo[1],
                        Double.parseDouble(transactionInfo[2])));
            }
            return transactions;
        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }

    public void deleteTransaction(int transactionId) throws DAOException {
        List<Transaction> transactions = readTransactions();
        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                transactions.remove(transaction);
                try (FileWriter fileWriter = new FileWriter(transactionsPath, false)) {
                    for (Transaction foundTransaction : transactions) {
                        fileWriter.write(foundTransaction.getId() + " " + foundTransaction.getDescription() + " " + foundTransaction.getSum() + '\n');
                    }
                } catch (IOException e) {
                    throw new DAOException(e);
                }
                return;
            }
        }
    }

    public void deleteTransaction(Transaction transaction) throws DAOException {
        List<Transaction> transactions = readTransactions();
        if (transactions.contains(transaction)) {
            transactions.remove(transaction);
            try (FileWriter fileWriter = new FileWriter(transactionsPath, false)) {
                for (Transaction foundTransaction : transactions) {
                    fileWriter.write(foundTransaction.getId() + " " + foundTransaction.getDescription() + " " + foundTransaction.getSum() + '\n');
                }
            } catch (IOException e) {
                throw new DAOException(e);
            }
        }
    }

    public Transaction findTransactionById(int transactionId) throws DAOException {
        List<Transaction> transactions = readTransactions();
        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                return transaction;
            }
        }
        throw new DAOException("Transaction with this id isn't founded");
    }

    public int lastId() throws DAOException {
        try (BufferedReader noteReader = new BufferedReader(new FileReader(transactionsPath))) {
            String last = null;
            String line;
            while ((line = noteReader.readLine()) != null) {
                last = line;
            }
            if (last != null) {
                String[] info = last.split(" ");
                return Integer.parseInt(info[0]);
            }
            return 0;
        } catch (FileNotFoundException e) {
            throw new DAOException(e);
        } catch (IOException e) {
            throw new DAOException(e);
        }
    }
}
