import java.math.BigDecimal;

/**
 * Builds isosceles triangle.
 */
public class IsoscelesTriangleBuilder extends TriangleBuilder {
  public IsoscelesTriangleBuilder(TriangleBuilder triangleBuilder) {
    super(triangleBuilder);
  }
  
  /**
   * Builds isosceles triangle.
   * @return exemplar of successor of Triangle.
   */
  public Triangle triangleBuild(BigDecimal[] sides) {
    if (triangleBuilder.triangleBuild(sides) == null) {
      try {
        return new IsoscelesTriangle(sides);
      } catch (IllegalArgumentException a) {   
        return null;
      }
    } else {
      return triangleBuilder.triangleBuild(sides);
    }
  }
} 
