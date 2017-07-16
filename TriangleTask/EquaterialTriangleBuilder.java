/**
 * Builds equateterial triangle.
 */
public class EquaterialTriangleBuilder {
  /**
   * Builds equaterial triangle.
   * @return exemplar of successor of Triangle.
   */
  public Triangle triangleBuild(String[] sequence) {
    try {
      Triangle triangle = new EquaterialTriangle(sequence);
      return triangle;
    } catch (IllegalArgumentException a) {
      IsoscelesTriangleBuilder triangleBuilder = new IsoscelesTriangleBuilder();    
      return triangleBuilder.triangleBuild(sequence);
    }
  }
}      
