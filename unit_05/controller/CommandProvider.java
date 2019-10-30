package controller;

import controller.commands.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> executerCommands = new HashMap<>();


    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = executerCommands.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = executerCommands.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
    CommandProvider() {
        executerCommands.put(CommandName.SIGN_IN, new SignIn());
        executerCommands.put(CommandName.CREATE_TRANSACTION, new CreateTr());
        executerCommands.put(CommandName.READ_TRANSACTION, new ReadTr());
        executerCommands.put(CommandName.UPDATE_TRANSACTION, new UpdateTr());
        executerCommands.put(CommandName.DELETE_TRANSACTION, new DeleteTr());
        executerCommands.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }
}
