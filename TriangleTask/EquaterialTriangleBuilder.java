public class EquaterialTriangleBuilder {
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
      
     
    
    
    
