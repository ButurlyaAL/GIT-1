/**
 * Entry point of the task about triangle.
 */
public class EntryPoint {
  public static void main(String[] args) {
    TriangleBuilder triangleBuilder = new TriangleBuilder(new IsoscelesTriangleBuilder(new EquaterialTriangleBuilder(null)));
    try {
      Triangle triangle = triangleBuilder.triangleBuild(new ConsoleReader().getSides());
      System.out.println(triangle.getType());
    } catch (NumberFormatException a) {
      System.out.println("You have entered values in wrong format.Start programm again and enter a numbers.");
    } catch (IndexOutOfBoundsException b) {
      System.out.println("You have entered more than 3 values.Start programm again and enter 3 values.");
    } catch (IllegalArgumentException c) {
      System.out.println("Such triangle does not exists.Start programm again. ");
    }
  }
}
