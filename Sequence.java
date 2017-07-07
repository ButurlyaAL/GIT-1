/** 
 * Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    Checker checker = new Checker();
    if (args.length == 0) {
      ConsoleReader consoleReader = new ConsoleReader();
      sequence.printResultOfCheck(checker.check(consoleReader.getSequence()));
    } else { 
      sequence.printResultOfCheck(checker.check(args));  
    }
  }
  /**
   * Prints what sequence is.
   * @param resultOfCheck is a boolean value,which determines what to print.
   */
  public void printResultOfCheck(boolean resultOfCheck) {
    if (resultOfCheck) {
      System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
}
