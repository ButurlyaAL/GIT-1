/**
 * Representation of isosceles triangle.
 */
public class RegularTriangle extends Triangle {
  public RegularTriangle(String[] sequence) {
    super(sequence);
    super.exists();
  }
  /**
   * @return String containing type of triangle.
   */
  public String getType() {
    return "Triangle is Regular";
  }   
} 
