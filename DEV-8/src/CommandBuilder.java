import java.util.HashMap;

/**
 * Select command to execute.
 */
public class CommandBuilder {
  private HashMap<String,Command> commands;
  private Command firstCommand;
  private Command secondCommand;
  private Command thirdCommand;
  private Command fourthCommand;
  private Command fifthCommand;

  /**
   * Makes commands,wich user can select.
   * @param dataBase
   */
  public CommandBuilder(DataBase dataBase) {
    commands = new HashMap<>();
    firstCommand = new CountTypesCommand(dataBase);
    secondCommand = new CountAllCommand(dataBase);
    thirdCommand = new AveragePriceCommand(dataBase);
    fourthCommand = new AveragePriceTypeCommand(dataBase);
    fifthCommand = new ExitCommand();
    this.buildMap();
  }

  /**
   * Makes oreder in chain of commands.
   */
  private void buildMap() {
    commands.put(firstCommand.getName(),firstCommand);
    commands.put(secondCommand.getName(),secondCommand);
    commands.put(thirdCommand.getName(),thirdCommand);
    commands.put(fourthCommand.getName(),fourthCommand);
    commands.put(fifthCommand.getName(),fifthCommand);
  }
  /**
   * @param name of command
   * @return command with the name.
   */
  public Command build(String name) {
    if (commands.containsKey(name)) {
      return commands.get(name);
    } else {
      throw new IllegalArgumentException("There is no such command.Try again.");
    }
  }
}
