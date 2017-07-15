/**
 * Prints the type of sequence. 
 */
public class PrinterOfType {
  /**
   * Prints the type of sequence.
   * @param checker is an exemplar of Checker,which determines what to print.
   */
   public void printTypeOfSequence(Checker checker) {
    if (checker.getResult()) {
      System.out.println("It is non-decreasing sequence.");
    } else {
      System.out.println("This sequence is not nondecreasing.");
    }
  }
}