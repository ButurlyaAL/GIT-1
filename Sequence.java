/** 
 * Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    Checker checker = new Checker();
    PrinterOfType printer = new PrinterOfType();
    try {
      if (args.length == 0) {
        ConsoleReader consoleReader = new ConsoleReader();
        sequence.printTypeOfSequence(checker.isNonDecreasing(consoleReader.readSequence()));
      } else { 
        sequence.printTypeOfSequence(checker.isNonDecreasing(args));  
      }
    } catch (Exception a) {
      System.out.println("It is not an integer.Try again to enter an integer sequence.");
      main(args);
    }
  }
}
