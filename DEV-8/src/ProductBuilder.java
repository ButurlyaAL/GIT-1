import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Build exemplars of Product.
 */
public class ProductBuilder {
  private Scanner scanner;
  private String type;
  private String name;
  private int amount;
  private BigDecimal price;

  /**
   * Makes an exemplar of ProductBuilder.
   */
  public ProductBuilder() {
    scanner = new Scanner(System.in);
    type = null;
    name = null;
    amount = 0;
    price = new BigDecimal("0");
  }

  /**
   * Build an exemplar of Product,with entered by user data .
   * @return an exemplar of product.
   */
  public Product build() {
    try {
      dataInput();
      return new Product(type, name, amount, price);
    } catch (NumberFormatException secondException) {
      System.out.println("Wrong amount or price.Try again :");
      return this.build();
    } catch (IllegalArgumentException firstException) {
      System.out.println(firstException.getMessage());
      return this.build();
    }
  }

  private void dataInput() {
    System.out.print("Enter type of product : ");
    type = scanner.nextLine();
    System.out.print("Enter name of product : ");
    name = scanner.nextLine();
    System.out.print("Enter amount of product : ");
    amount = Integer.valueOf(scanner.nextLine());
    System.out.print("Enter price of product : ");
    price = new BigDecimal(scanner.nextLine());
  }
}