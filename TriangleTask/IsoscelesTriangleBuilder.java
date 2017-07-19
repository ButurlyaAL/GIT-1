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
    try {
      Triangle triangle = new IsoscelesTriangle(sides);
      return triangle;
    } catch (IllegalArgumentException a) {   
      return triangleBuilder.triangleBuild(sides);
    }
  }
} 
