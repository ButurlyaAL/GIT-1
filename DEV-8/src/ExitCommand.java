/**
 * Command, wich ends the program.
 */
public class ExitCommand implements Command {
  private final String name = "5";

  /**
   * Ends the program.
   */
  @Override
  public void execute() {
    System.exit(0);
  }

  @Override
  public String getName() {
    return name;
  }
}
