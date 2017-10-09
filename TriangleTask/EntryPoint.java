/**
 * Entry point of the task about triangle.
 */
public class EntryPoint {
  public static void main(String[] args) {
    TriangleBuilder triangleBuilder = new TriangleBuilder(new IsoscelesTriangleBuilder(new EquaterialTriangleBuilder(null)));
    try {
      Triangle triangle = triangleBuilder.triangleBuild(new ConsoleReader().getSides());
      System.out.println(triangle.getType());
    } catch (NumberFormatException firstException) {
      System.out.println("You have entered values in wrong format.Start programm again and enter a numbers.");
    } catch (IndexOutOfBoundsException secondException) {
      secondException.getMessage();
    } catch (IllegalArgumentException thirdException) {
      thirdException.getMessage();
    }
  }
}
