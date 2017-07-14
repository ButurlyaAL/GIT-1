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
        sequence.printTypeOfSequence(checker.isNonDecreasing(consoleReader.getSequence()));
      } else { 
        sequence.printTypeOfSequence(checker.isNonDecreasing(args));  
      }
    } catch (Exception a) {
      System.out.println("It is not an integer.Start programm again and enter an integer sequence.");
      main(args);
    }
  }
  
  /**
   * Prints the type of sequence.
   * @param isNonDecreasing is a boolean value,which determines what to print.
   */
  public void printTypeOfSequence(boolean isNonDecreasing) {
    if (isNonDecreasing) {
      System.out.println("It is non-decreasing sequence.");
    } else {
      System.out.println("This sequence is decreasing.");
    }
  }
}
