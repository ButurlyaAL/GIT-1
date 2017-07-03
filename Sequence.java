/** 
 *Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Checker checker = new Checker();
    if (args.length == 0) {
      ConsoleReader consoleReader = new ConsoleReader();
      printResultOfCheck(checker.check(consoleReader.getSequence()));
    } else { 
      printResultOfCheck(checker.check(args));  
    }
  }
/**
 *Prints what sequence is.
 *@param resultOfCheck is boolean value,which is the result of verification of sequence.
 */
  public static void printReultOfCheck(boolean resultOfCheck) {
    if (resultOfCheck) {
      System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
}
