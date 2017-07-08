import java.math.BigDecimal;

public class Triangle {
  private BigDecimal[] sides;
  public Triangle(String[] sequence) {
    if (sequence.length > 3) {
      throw new IllegalArgumentException();
    } 
    sides = new BigDecimal[3];
    for (int i = 0; i < 3; i ++) {
      sides[i] = new BigDecimal(sequence[i].replaceAll(",",""));
    }
  }
  /**
   * Returns the value of Triangle side.
   * @return the value of Triangle side.
   */
  public BigDecimal getSide(int i) {
    return sides[i]; 
  }
}    
