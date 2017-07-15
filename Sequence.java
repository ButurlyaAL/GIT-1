/** 
 * Prints the type of sequence:non decreasing or not. 
 */
public class Sequence {
  public static void main(String[] args) {
    PrinterOfType printer = new PrinterOfType();
    try {
      if (args.length == 0) {
        ConsoleReader reader = new ConsoleReader();
        printer.printTypeOfSequence(new Checker(reader.readSequence()).isNonDecreasing());
      } else { 
        printer.printTypeOfSequence(new Checker(args).isNonDecreasing());  
      }
    } catch (Exception a) {
      System.out.println("It is not an integer sequence.Try again to enter an integer sequence.");
      main(args);
    }
  }
}
