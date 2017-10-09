/**
 * Command,wich count types in data base .
 */
public class CountTypesCommand implements Command {
  private final String name = "1";
  private DataBase dataBase;

  public CountTypesCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }

  /**
   * Prints amount of types of product in data base .
   */
  @Override
  public void execute() {
    System.out.println("Amount of types : " + dataBase.getAllData().size());
  }

  @Override
  public String getName() {
    return name;
  }
}
