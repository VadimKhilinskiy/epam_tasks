package dao;

import beans.Transaction;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {

    private String transactionsPath = "resource/...";

    public void addTransaction(Transaction transaction) throws DAOException {
        try (InfoWriter fileNoteWriter = new InfoWriter(transactionsPath)) {
            String transactionInfo = transaction.getId() + " " + transaction.getDescription() + " " +
                    transaction.getSum();

            fileNoteWriter.writeNote(transactionInfo);
        } catch (IOException e) {
            throw new DAOException(e.getMessage());
        }
    }

    public List<Transaction> readTransactions() throws DAOException {
        try (InfoReader fileNoteReader = new InfoReader(transactionsPath)) {
            List<Transaction> transactions = new ArrayList<>();
            String finNote;
            String[] transactionInfo;

            while ((finNote = fileNoteReader.readNote()) != null) {
                transactionInfo = finNote.split(" ");
                transactions.add(new Transaction(Integer.parseInt(transactionInfo[0]), transactionInfo[1],
                        Double.parseDouble(transactionInfo[2])));
            }
            return transactions;
        } catch (FileNotFoundException e) {
            throw new DAOException(e.getMessage());
        } catch (IOException e) {
            System.out.println(e);
            throw new DAOException(e.getMessage());
        }
    }

    public void deleteTransaction(int transactionId) throws DAOException {
        List<Transaction> transactions = readTransactions();

        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                transactions.remove(transaction);

                try (FileWriter fileWriter = new FileWriter(transactionsPath, false)) {
                    for (Transaction transaction1 : transactions) {
                        fileWriter.write(transaction1.getId() + " " + transaction1.getDescription() + " " +
                                transaction1.getSum() + '\n');
                    }
                } catch (IOException e) {
                    throw new DAOException(e.getMessage());
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
                for (Transaction transaction1 : transactions) {
                    fileWriter.write(transaction1.getId() + " " + transaction1.getDescription() + " " +
                            transaction1.getSum() + '\n');
                }
            } catch (IOException e) {
                throw new DAOException(e.getMessage());
            }
        }
        else {
            return;
        }
    }

    public Transaction findTransactionById(int transactionId) throws DAOException {
        List<Transaction> transactions = readTransactions();

        for (Transaction transaction : transactions) {
            if (transaction.getId() == transactionId) {
                return transaction;
            }
        }
        throw new DAOException("There is no transaction with such id");
    }

    public int lastId() throws DAOException {
        try (InfoReader fileNoteReader = new InfoReader(transactionsPath)) {
            String last, line;
            last = null;

            while ((line = fileNoteReader.readNote()) != null) {
                last = line;
            }
            if (last != null) {
                String[] info = last.split(" ");
                return Integer.parseInt(info[0]);
            }
            return 0;
        } catch (FileNotFoundException e) {
            throw new DAOException(e.getMessage());
        } catch (IOException e) {
            throw new DAOException(e.getMessage());
        }
    }
}
