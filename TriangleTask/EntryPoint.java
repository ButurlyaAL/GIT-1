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
      firstException.getMessage();
    } catch (IndexOutOfBoundsException secondException) {
      secondException.getMessage();
    } catch (IllegalArgumentException thirdException) {
      thirdException.getMessage();
    }
  }
}
