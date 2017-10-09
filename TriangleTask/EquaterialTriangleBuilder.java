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
   * @return an exemplar of EquaterialTriangle if it exists.
   */
  public Triangle triangleBuild(BigDecimal[] sides) {
    try {
      return new EquaterialTriangle(sides);
    } catch (IllegalArgumentException a) {    
      return null;
    }
  }
}
