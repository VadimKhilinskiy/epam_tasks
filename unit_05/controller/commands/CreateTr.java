package controller.commands;

import beans.Transaction;
import controller.Command;
import services.ServiceException;
import services.ServiceFactory;
import services.TransactionService;

public class CreateTr  implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(" ");
        String response = null;

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        TransactionService transactionService = serviceFactory.getTransactionService();

        try {
            int id = serviceFactory.getIdGenerator().nextId();
            String description = params[1];
            double sum = Double.parseDouble(params[2]);

            transactionService.createTransaction(new Transaction(id, description, sum));
            response = "Transaction successfully added";
        } catch (ServiceException e) {
            response = "Error during adding transaction";
            System.out.println(e.getMessage());
        }

        return response;
    }
}