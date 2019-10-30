package controller;

public class Controller {
    private static final Controller instance = new Controller();
    private final CommandProvider provider = new CommandProvider();

    public static Controller getInstance() {
        return instance;
    }

    public String executeQuery(String request) {
        String[] params = request.split(" ");
        String commandName = params[0];
        Command executionCommand = provider.getCommand(commandName);
        String response = executionCommand.execute(request);
        return response;
    }
}
