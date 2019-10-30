package controller.commands;

import controller.Command;

public class WrongRequest implements Command {

    @Override
    public String execute(String request) {
        return "Can't process request";
    }
}