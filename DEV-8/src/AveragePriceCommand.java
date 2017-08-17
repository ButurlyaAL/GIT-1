import java.util.LinkedList;
import java.math.BigDecimal;

/**
 * Command,wich calculates average price of products in data base .
 */
public class AveragePriceCommand implements Command {
  private final String name = "3";
  private DataBase dataBase;

  public AveragePriceCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }

  /**
   * Prints average price of all products.
   */
  @Override
  public void execute() {
    System.out.println("Average price of all products : " + this.averagePrice());
  }

  /**
   * Calculates average price of all products in data base.
   * @return average price of all products in data base.
   */
  public BigDecimal averagePrice() {
    BigDecimal averagePrice = new BigDecimal("0");
    int amount = 0;
    for (LinkedList<Product> products : dataBase.getAllData().values()) {
      for (Product product : products) {
        averagePrice = averagePrice.add(product.getPrice());
      }
      amount += products.size();
    }
    return averagePrice.divide(new BigDecimal(amount));
  }

  @Override
  public String getName() {
    return name;
  }
}
