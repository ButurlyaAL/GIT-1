/**
 * Builds isosceles triangle.
 */
public class IsoscelesTriangleBuilder {
  /**
   * Builds isosceles triangle.
   * @return exemplar of successor of Triangle.
   */
  public Triangle triangleBuild(String[] sequence) {
    try {
      Triangle triangle = new IsoscelesTriangle(sequence);
      return triangle;
    } catch (IllegalArgumentException a) {  
      RegularTriangleBuilder triangleBuilder = new RegularTriangleBuilder();   
      return triangleBuilder.triangleBuild(sequence);
    }
  }
}            
