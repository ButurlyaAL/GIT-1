import java.math.BigDecimal;

/**
 * Representation of equilateral triangle.
 */
public class EquaterialTriangle extends Triangle {
  /**
   * Makes an exemplar of EquaterialTriangle if it exists.
   */
  public EquaterialTriangle(BigDecimal[] sides) {
    super(sides);
    exists();
  }
  
  /**
   * Checks for exist equilateral triangle.
   * @throw IllegalArgumentException if triangle isn't equaterial or can't exists.
   */
  public void exists() {
    if (!(firstSide.compareTo(secondSide) == 0 && secondSide.compareTo(thirdSide) == 0)) {
      throw new IllegalArgumentException("It isn't equilateral triangle.");  
    } 
  }
  
  /**
   * @return String containing type of triangle.
   */
  public String getType() {
    return "Triangle is equilzteral.";
  }
}
