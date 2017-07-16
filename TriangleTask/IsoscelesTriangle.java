/**
 * Representation of isosceles triangle.
 */
public class IsoscelesTriangle extends Triangle {
  public IsoscelesTriangle(String[] sequence) {
    super(sequence);
    exists();
  }
  /**
   * Checks for exist isosceles triangle.
   * @throw IllegalArgumentException if triangle isn't equaterial or triangle can't exists.
   */
  public void exists() {
    super.exists();   
    if(!(firstSide.compareTo(secondSide) == 0 || firstSide.compareTo(thirdSide) == 0 || secondSide.compareTo(thirdSide) == 0)) {
      throw new IllegalArgumentException();  
    } 
  }
   /**
   * @return String containing type of triangle.
   */
  public String getType() {
    return "Triangle is isosceles.";
  }
}  
