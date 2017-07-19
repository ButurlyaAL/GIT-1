import java.math.BigDecimal;

/**
 * Builds equateterial triangle.
 */
public class EquaterialTriangleBuilder extends TriangleBuilder {
  public EquaterialTriangleBuilder(TriangleBuilder triangleBuilder) {
    super(triangleBuilder);
  }
  
  /**
   * Builds equaterial triangle.
   * @return an exemplar of Triangle successor.
   */
  public Triangle triangleBuild(BigDecimal[] sides) {
    try {
      Triangle triangle = new EquaterialTriangle(sides);
      return triangle;
    } catch (IllegalArgumentException a) {    
      return triangleBuilder.triangleBuild(sides);
    }
  }
}
