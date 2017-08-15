/**
 * Select command to execute.
 */
public class CommandBuilder {
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
    firstCommand = new CountTypesCommand(dataBase);
    secondCommand = new CountAllCommand(dataBase);
    thirdCommand = new AveragePriceCommand(dataBase);
    fourthCommand = new AveragePriceTypeCommand(dataBase);
    fifthCommand = new ExitCommand();
  }

  /**
   * Makes oreder in chain of commands.
   */
  private void buildOrder() {
    firstCommand.setNext(secondCommand);
    secondCommand.setNext(thirdCommand);
    thirdCommand.setNext(fourthCommand);
    fourthCommand.setNext(fifthCommand);
  }

  private Command selectCommand(Command command, String name) {
    if (command.getName().equals(name)) {
      return command;
    } else {
      return this.selectCommand(command.getNext(), name);
    }
  }

  /**
   * @param name of command
   * @return command with the name.
   */
  public Command build(String name) {
    buildOrder();
    return selectCommand(firstCommand, name);
  }
}
