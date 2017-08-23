import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * Representation of product.
 */
public class Product {
  private String type;
  private String name;
  private int amount;
  private BigDecimal price;

  /**
   * Makes an exemplar of Product if data is correct.
   * @throws IllegalArgumentException if data isn't correct.
   * @param type is type of product
   * @param name is name of product
   * @param amount is amount of product
   * @param price is price of product
   */
  public Product(String type, String name, int amount, BigDecimal price) {
    if (verify(type, name, amount, price)) {
      this.type = type;
      this.name = name;
      this.amount = amount;
      this.price = price;
    } else {
      throw new IllegalArgumentException("Wrong (type,name,amount or price).Try again.");
    }
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amount;
  }

  public BigDecimal getPrice() {
    return price;
  }

  private boolean verify(String type, String name, int amount, BigDecimal price) {
    return (isCorrect(type) && isCorrect(name)) && amount > 0 && priceIsPositive(price);
  }

  private boolean isCorrect(String value) {
   Pattern pattern = Pattern.compile("^(\\d*|\\W*)$");
   return !pattern.matcher(value).matches();
  }

  private boolean priceIsPositive(BigDecimal price) {
    return price.signum() == 1 || price.signum() == 0;
  }

  public boolean equals(Object object) {
    if (object.getClass() != this.getClass()) {
      return false;
    } else {
      Product product = (Product) object;
      return this.type == product.getType() && this.name == product.getName() && this.amount == product.getAmount() && this.price.compareTo(product.getPrice()) == 0;
    }
  }
}
