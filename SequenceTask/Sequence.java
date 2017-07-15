/**
 * Entry Point for task about nondecreasing sequence.
 */
public class Sequence {
  public static void main(String[] args) {
    PrinterOfType printer = new PrinterOfType();
    try {
      if (args.length == 0) {
        printer.printTypeOfSequence(new Checker(new ConsoleReader().readSequence()));
      } else { 
        printer.printTypeOfSequence(new Checker(args));  
      }
    } catch (Exception a) {
      System.out.println("It is not an integer sequence.Start programm again and try to enter an integer sequence.");
    }
  }
}
