/**
 * Entry point of the task about Triangle sides.
 */
public class TriangleTask {
  public static void main(String[] args) {
    PrinterOfTriangleType printer = new PrinterOfTriangleType();
    TriangleTypeDeterminator typeDeterminator = new TriangleTypeDeterminator();
    try {
      if (args.length == 0) {
        TriangleConsoleReader consoleReader = new TriangleConsoleReader();
        Triangle triangle = new Triangle(consoleReader.getSequence());
        printer.printTypeOfTriangle(typeDeterminator.triangleTypeDetermination(triangle)); 
      } else { 
        Triangle triangle = new Triangle(args);
        printer.printTypeOfTriangle(typeDeterminator.triangleTypeDetermination(triangle));  
      }
    } catch (NumberFormatException a) {
      System.out.println("It is not a numbers.Start programm again and enter a numbers");
    } catch (IndexOutOfBoundsException b) {
      System.out.println("It is more than 3 values.Strat programm again and enter 3 values for a Tringle.");
    }
  }
}
