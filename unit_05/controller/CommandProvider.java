package controller;

import controller.commands.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();


    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
    CommandProvider() {
        repository.put(CommandName.SIGN_IN, new SignIn());
        repository.put(CommandName.CREATE_TRANSACTION, new CreateTr());
        repository.put(CommandName.READ_TRANSACTION, new ReadTr());
        repository.put(CommandName.UPDATE_TRANSACTION, new UpdateTr());
        repository.put(CommandName.DELETE_TRANSACTION, new DeleteTr());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }
}
