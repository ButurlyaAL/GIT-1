/**
 * Determinates the type of triangle:normal,isosceles and equilateral.
 */
public class TriangleTypeDeterminator {
  /**
   * Returns an integer value,which determines the type of triangle.
   * @return an integer value,which determines the type of triangle.
   */
  public int triangleTypeDetermination(Triangle triangle) {
    int qualifier = 0;
    for (int i = 0; i < 2; i ++) {
      if (triangle.getSide(i).compareTo(triangle.getSide(2)) == 0 || triangle.getSide(i).compareTo(triangle.getSide(i + 1)) == 0) {
        qualifier ++;
      }
    }
    return qualifier;              
  }
} 
