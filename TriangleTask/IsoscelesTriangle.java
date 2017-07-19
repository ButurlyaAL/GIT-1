import java.math.BigDecimal;

/**
 * Representation of isosceles triangle.
 */
public class IsoscelesTriangle extends Triangle {
  public IsoscelesTriangle(BigDecimal[] sides) {
    super(sides);
    exists();
  }
  
  /**
   * Checks for exist isosceles triangle.
   * @throw IllegalArgumentException if triangle isn't isosceles or can't exists.
   */
  public void exists() {  
    if (!(firstSide.compareTo(secondSide) == 0 || firstSide.compareTo(thirdSide) == 0 || secondSide.compareTo(thirdSide) == 0)) {
      throw new IllegalArgumentException("It isn't isosceles triangle.");  
    } 
  }
  
   /**
   * @return String containing type of triangle.
   */
  public String getType() {
    return "Triangle is isosceles.";
  }
}
