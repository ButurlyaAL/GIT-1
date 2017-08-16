import java.util.Scanner;

/**
 * Displays menu of the program.
 * Execute commands selected by user.
 */
public class Menu {
  private CommandBuilder commandBuilder;

  /**
   * Makes exemplar of Menu.
   * @param commandBuilder selects command to execute.
   */
  public Menu(CommandBuilder commandBuilder) {
    this.commandBuilder = commandBuilder;
  }

  /**
   * Executes command ,wich user select.
   */
  public void run() {
    do {
      System.out.println("Select command : ");
      System.out.println("(1)count types.");
      System.out.println("(2)count all.");
      System.out.println("(3)average price.");
      System.out.println("(4)average price of type.");
      System.out.println("(5)exit.");
      try {
        commandBuilder.build(new Scanner(System.in).nextLine()).execute();
      } catch (NullPointerException firstException) {
        System.out.println("There is no such type.");
        this.run();
      } catch (IllegalArgumentException secondException) {
        System.out.println(secondException.getMessage());
        this.run();
      }
    } while (true);
  }
}
