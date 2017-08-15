/**
 * Command, wich ends the program.
 */
public class ExitCommand implements Command {
  private final String name = "5";
  private Command next;

  public ExitCommand() {
    next = null;
  }

  /**
   * Ends the program.
   */
  @Override
  public void execute() {
    System.exit(0);
  }

  @Override
  public Command getNext() {
    return this.next;
  }

  @Override
  public void setNext(Command command) {
    this.next = command;
  }

  @Override
  public String getName() {
    return name;
  }
}
