import java.math.BigDecimal;

/**
 * Representation of triangle.
 */
public class Triangle {
  protected BigDecimal firstSide;
  protected BigDecimal secondSide;
  protected BigDecimal thirdSide;
  /**
   * Makes an exemplar of Triangle if it exists.
   */
  public Triangle(BigDecimal[] sides) {
    if (sides.length > 3) {
      throw new IndexOutOfBoundsException("More than 3 values was entered.");
    } 
    firstSide = sides[0];
    secondSide = sides[1];
    thirdSide = sides[2];
    exists();
  }
  
  /**
   * Checks for exist triangle.
   * @throw IllegalArgumentException if triangle doesn't exists.
   */
  public void exists() {
    if (!(firstSide.add(secondSide).compareTo(thirdSide) == 1 && firstSide.add(thirdSide).compareTo(secondSide) == 1 && secondSide.add(thirdSide).compareTo(firstSide) == 1)) {
      throw new IllegalArgumentException("Triangle doesn't exists.");
    }     
  }
  
  /**
   * Returns String containing type of triangle.
   */
  public String getType() {
    return "Triangle is regular";
  }   
}
