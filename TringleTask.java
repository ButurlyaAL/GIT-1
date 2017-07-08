public class TringleTask {
  public static void main(String[] args) {
    PrinterOfTringleType printer = new PrinterOfTringleType();
    TringleTypeDeterminator typeDeterminator = new TringleTypeDeterminator();
    try {
      if (args.length == 0) {
        TringleConsoleReader consoleReader = new TringleConsoleReader();
        Tringle tringle = new Tringle(consoleReader.getSequence());
        printer.printTypeOfTringle(typeDeterminator.tringleTypeDetermination(tringle)); 
      } else { 
        Tringle tringle = new Tringle(args);
        printer.printTypeOfTringle(typeDeterminator.tringleTypeDetermination(tringle));  
      }
    } catch (NumberFormatException a) {
      System.out.println("It is not a numbers.Start programm again and enter a numbers");
    } catch (IndexOutOfBoundsException b) {
      System.out.println("It is more than 3 values.Strat programm again and enter 3 values for a Tringle.");
    }
  }
}