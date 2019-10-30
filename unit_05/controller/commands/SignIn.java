package controller.commands;

import beans.AutorisationInfo;
import controller.Command;
import services.ServiceException;
import services.ServiceFactory;
import services.UserService;

public class SignIn implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(" ");
        String login = params[1];
        String password = params[2];
        String response = null;
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        UserService userService = serviceFactory.getUserService();
        try {
            userService.signIn(new AutorisationInfo(login, password));
            response = "Welcome";
        } catch (ServiceException e) {
            response = "Authorization error. Try Again";
        }

        return response;
    }
}