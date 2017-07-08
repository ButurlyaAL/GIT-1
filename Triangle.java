import java.math.BigDecimal;

public class Triangle {
  private BigDecimal[] sides;
  public Triangle(String[] sequence) {
    if (sequence.length > 3) {
      throw new IndexOutOfBoundsException();
    } 
    sides = new BigDecimal[3];
    for(int i = 0; i < 3; i ++) {
      sides[i] = new BigDecimal(sequence[i].replaceAll(",",""));
  }
}
  /**
   * @return value of Triangle side.
   */
  public BigDecimal getSide(int i) {
    return sides[i]; 
  }
}    
