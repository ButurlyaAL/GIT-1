import java.math.BigDecimal;

public class Tringle {
  private BigDecimal[] sides;
  public Tringle(String[] sequence) {
    if (sequence.length > 3) {
      throw new IndexOutOfBoundsException();
    } 
    sides = new BigDecimal[3];
    for(int i = 0; i < 3; i ++) {
      sides[i] = new BigDecimal(sequence[i].replaceAll(",",""));
  }
}
  public BigDecimal getSide(int i) {
    return sides[i]; 
  }
}    