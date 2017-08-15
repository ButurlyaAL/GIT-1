/**
 * Command,wich count types in data base .
 */
public class CountTypesCommand implements Command {
  private final String name = "1";
  private Command next;
  private DataBase dataBase;

  public CountTypesCommand(DataBase dataBase) {
    next = null;
    this.dataBase = dataBase;
  }

  public void next(Command command) {
    next = command;
  }

  /**
   * Prints amount of types of product in data base .
   */
  @Override
  public void execute() {
    System.out.println(dataBase.getAllData().size());
  }

  @Override
  public void setNext(Command command) {
    this.next = command;
  }

  @Override
  public Command getNext() {
    return this.next;
  }

  @Override
  public String getName() {
    return name;
  }
}
