package controller.commands;

import beans.Transaction;
import controller.Command;
import services.ServiceException;
import services.ServiceFactory;
import services.TransactionService;

public class UpdateTr implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(" ");
        int id = Integer.parseInt(params[1]);
        String description = params[2];
        double sum = Double.parseDouble(params[3]);

        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TransactionService transactionService = serviceFactory.getTransactionService();

        try {
            int newId = serviceFactory.getIdGenerator().nextId();
            transactionService.updateTransaction(id, new Transaction(newId, description, sum));
            response = "Transaction successfully updated";
        } catch (ServiceException e) {
            response = "Error during updating transaction";
        }

        return response;
    }
}