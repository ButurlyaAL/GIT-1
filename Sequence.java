/** 
 * Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Checker checker = new Checker();
    if (args.length == 0) {
      ConsoleReader consoleReader = new ConsoleReader();
      this.printResultOfCheck(checker.check(consoleReader.getSequence()));
    } else { 
      this.printResultOfCheck(checker.check(args));  
    }
  }
  /**
   * Prints what sequence is.
   * @param resultOfCheck a boolean value,which determines what to print.
   */
  public void printReultOfCheck(boolean resultOfCheck) {
    if (resultOfCheck) {
      System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
}
