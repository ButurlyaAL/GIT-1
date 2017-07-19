import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Read values of the sides from the console.
 */
public class ConsoleReader {
   private String[] sequence;
   public ConsoleReader() {
     sequence = this.readSequence();
   }
  private String[] readSequence() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the sides of the triangle using spaces(If you have finished,press ENTER):");
    return input.nextLine().split(" ");
  }
   
  /**
   * Makes BigDecimal array,which consists of numbers entered by user.
   * @return BigDecimal array.
   */
  public BigDecimal[] getSides() {
    BigDecimal[] sides = new BigDecimal[sequence.length];
    for(int i = 0; i < sequence.length; i ++) {
      sides[i] = new BigDecimal(sequence[i].replaceAll(",",""));
    }
    return sides;
  }   
}
