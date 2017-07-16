/**
 * Entry point of te task about triangle.
 */
public class EntryPoint {
  public static void main(String[] args) {
    EquaterialTriangleBuilder triangleBuilder = new EquaterialTriangleBuilder();
    PrinterOfTriangleType printer = new PrinterOfTriangleType();
    try {
      printer.printTypeOfTriangle(triangleBuilder.triangleBuild(new ConsoleReader().readSequence()));
    } catch (NumberFormatException a) {
      System.out.println("You have entered values in wrong format.Start programm again and enter a numbers.");
    } catch (IndexOutOfBoundsException b) {
      System.out.println("You have entered more than 3 values.Start programm again and enter 3 values.");
    } catch (IllegalArgumentException c) {
      System.out.println("Such triangle does not exists.Start programm again. ");
    }
  }
}
