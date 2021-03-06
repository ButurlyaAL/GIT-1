import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Command,wich calculates average price of product of certain type .
 */
public class AveragePriceTypeCommand implements Command {
  private final String name = "4";
  private DataBase dataBase;
  public AveragePriceTypeCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }

  /**
   * Prints average price of all products with specific typeentered by user).
   */
  @Override
  public void execute() {
    System.out.println("Press type :");
    System.out.println("Average price of products of entered type : " + this.averagePrice(new Scanner(System.in).nextLine()));
  }

  /**
   * Calculates average price of all products with specific type .
   * @param type of product,wich entered by user.
   * @return average price of all products with specific type .
   */
  public BigDecimal averagePrice(String type) {
    BigDecimal averagePrice = new BigDecimal("0");
    for (Product product : dataBase.getDataAboutType(type)) {
      averagePrice = averagePrice.add(product.getPrice());
    }
    return averagePrice.divide(new BigDecimal(dataBase.getDataAboutType(type).size()));
  }

  @Override
  public String getName() {
    return name;
  }
}
