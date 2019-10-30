package controller.commands;

import controller.Command;
import services.ServiceException;
import services.ServiceFactory;
import services.TransactionService;

public class DeleteTr implements Command {
    @Override
    public String execute(String request) {
        String[] params = request.split(" ");
        int id = Integer.parseInt(params[1]);
        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TransactionService transactionService = serviceFactory.getTransactionService();

        try {
            transactionService.deleteTransaction(id);
            response = "Transaction successfully deleted";
        } catch(ServiceException e) {
            response = "Error during deleting transaction";
        }

        return response;
    }
}
