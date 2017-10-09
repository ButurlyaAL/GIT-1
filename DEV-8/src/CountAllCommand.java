import java.util.LinkedList;

/**
 * Command,wich count all product in data base .
 */
public class CountAllCommand implements Command {
  private final String name = "2";
  private DataBase dataBase;

  public CountAllCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }

  /**
   * Prints amount of all product in data base .
   */
  @Override
  public void execute() {
    System.out.println("Amount of all products : " + this.amount());
  }

  /**
   * Calculates amount of all product in data base.
   * @return amount of all product in data base.
   */
  public int amount() {
    int amount = 0;
    for (LinkedList<Product> products : dataBase.getAllData().values()) {
      for (Product product : products) {
        amount += product.getAmount();
      }
    }
    return amount;
  }

  @Override
  public String getName() {
    return name;
  }
}

