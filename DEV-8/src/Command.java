/**
 * Interface of commands.
 */
public interface Command {
  void execute();

  String getName();
  /**
   * Set next command in the chain of commands.
   * @param command is next command in the chain of commands.
   */
  void setNext(Command command);

  Command getNext();
}
