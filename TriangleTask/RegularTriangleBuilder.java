/**
 * Builds regular triangle.
 */
public class RegularTriangleBuilder {
   /**
   * Builds equaterial triangle.
   * @return exemplar of successor of Triangle.
   */
  public Triangle triangleBuild(String[] sequence) {
      Triangle triangle = new RegularTriangle(sequence);
      return triangle;
  }
}
