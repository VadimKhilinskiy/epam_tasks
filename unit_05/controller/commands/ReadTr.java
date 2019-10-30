package controller.commands;

import beans.Transaction;
import controller.Command;
import services.ServiceException;
import services.ServiceFactory;
import services.TransactionService;

public class ReadTr implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(" ");
        int id = Integer.parseInt(params[1]);
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TransactionService transactionService = serviceFactory.getTransactionService();
        try {
            Transaction transaction = transactionService.readTransaction(id);
            response = transaction.getId() + " " + transaction.getDescription() + " " + transaction.getSum();
        } catch (ServiceException e) {
            response = "Reading transaction error";
        }

        return response;
    }
}