/** 
 *Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Checker checker = new Checker();
    if (args.length == 0) {
      ConsoleReader consoleReader = new ConsoleReader();
      checker.printResultOfCheck(checker.check(consoleReader.getSequence()));
    } else { 
      checker.printResultOfCheck(checker.check(args));  
    }
    if (resultOfCheck) {
    System.out.println("It is NOT non-decreasing sequence.");
    } else {
      System.out.println("It is non-decreasing sequence.");
    }
  }
} 
