public class PrinterOfType {
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