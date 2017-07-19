import java.math.BigDecimal;

/**
 * Builds regular triangle.
 */
public class TriangleBuilder {
  protected TriangleBuilder triangleBuilder;
  /**
   * Makes an exemplar of TriangleBuilder.
   */
  public TriangleBuilder(TriangleBuilder triangleBuilder) {
    this.triangleBuilder = triangleBuilder;
  }
   
  /**
   * Builds regular triangle.
   * @return an exemplar of Triangle.
   */
  public Triangle triangleBuild(BigDecimal[] sides) {
    if (triangleBuilder.triangleBuild(sides) == null) {
      return new Triangle(sides);
    } else {
      return triangleBuilder.triangleBuild(sides);
    }
  }
}
