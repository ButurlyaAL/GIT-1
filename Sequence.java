/** 
 * Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    Checker checker = new Checker();
    try {
      if (args.length == 0) {
        ConsoleReader consoleReader = new ConsoleReader();
        sequence.printResultOfCheck(checker.check(consoleReader.getSequence()));
      } else { 
        sequence.printResultOfCheck(checker.check(args));  
      }
    } catch (Exception a) {
      System.out.println("It is not a numbers.Please try again.");
    }
  }
  /**
   * Prints what sequence is.
   * @param resultOfCheck is a boolean value,which determines what to print.
   */
  public void printResultOfCheck(boolean checkBit) {
    if (checkBit) {
      System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
}
