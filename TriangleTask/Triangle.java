import java.math.BigDecimal;

/**
 * Representation of triangle.
 */
public abstract class Triangle {
  protected BigDecimal firstSide;
  protected BigDecimal secondSide;
  protected BigDecimal thirdSide;
  public Triangle(String[] sequence) {
    if (sequence.length > 3) {
      throw new IndexOutOfBoundsException();
    } 
    firstSide = new BigDecimal(sequence[0].replaceAll(",",""));
    secondSide = new BigDecimal(sequence[1].replaceAll(",",""));
    thirdSide = new BigDecimal(sequence[2].replaceAll(",",""));
  }
  /**
   * Checks for exist triangle.
   * @throw IllegalArgumentException if triangle doesn't exists.
   */
  public void exists() {
    if (!(firstSide.add(secondSide).compareTo(thirdSide) == 1 && firstSide.add(thirdSide).compareTo(secondSide) == 1 && secondSide.add(thirdSide).compareTo(firstSide) == 1)) {
      throw new IllegalArgumentException();
    }     
  } 
  /**
   * Returns String containing type of triangle.
   */
  public abstract String getType();
}
