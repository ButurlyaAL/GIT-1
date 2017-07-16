import java.math.BigDecimal;

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
  public abstract void exists();
  public abstract String getType();
}