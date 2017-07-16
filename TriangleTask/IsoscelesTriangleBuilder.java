public class IsoscelesTriangleBuilder {
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
      