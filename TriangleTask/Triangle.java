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
   * Checks for exist isosceles triangle.
   */
  public abstract void exists();
  /**
   * Returns String containing type of triangle.
   */
  public abstract String getType();
}
